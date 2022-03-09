package tp1.dao;

public class DaoImpl implements IDao{
    
    @Override
    public double getData() {
        // Version 1 de DAO 

        System.out.println("Version 1");

        double temp = Math.random()*30;
        return temp;
    }
}
