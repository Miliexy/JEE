package tp1.ext;

import tp1.dao.IDao;

public class DaoImplV3 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version 3");
        return 3;
    }
}
