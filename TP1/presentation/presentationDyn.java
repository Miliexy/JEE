package tp1.presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import tp1.dao.DaoImpl;
import tp1.dao.IDao;
import tp1.ext.DaoImplV2;
import tp1.metier.MetierImpl;

public class presentationDyn {
    

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {


        Scanner scanner = new Scanner(new File("../config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao =Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(daoClassName);
    }
}

















