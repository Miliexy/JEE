package tp1.ext;

import tp1.dao.IDao;

public class DaoImplV2 implements IDao{
    
    @Override
    public double getData() {
        // Version 2 de DAO 

        System.out.println("Version 2");

        double temp = Math.random()*Math.sin(1)*Math.exp(3);
        return temp;
    }
}
