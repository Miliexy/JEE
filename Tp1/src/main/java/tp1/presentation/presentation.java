package tp1.presentation;

import tp1.ext.DaoImplV2;
import tp1.metier.MetierImpl;

public class presentation {
    

    public static void main(String[] args) {

        /*
        Injection statique 
        */ 
        //DaoImpl dao = new DaoImpl();
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Result = " + metier.calcul());
    }
}
