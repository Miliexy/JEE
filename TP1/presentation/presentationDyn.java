package tp1.presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import tp1.dao.DaoImpl;
import tp1.dao.IDao;
import tp1.ext.DaoImplV2;
import tp1.metier.IMetier;
import tp1.metier.MetierImpl;

import javax.imageio.metadata.IIOMetadata;

public class presentationDyn {
    

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {


        Scanner scanner = new Scanner(new File("tp1/config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao =Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("Result = " + metier.calcul());
    }
}

















