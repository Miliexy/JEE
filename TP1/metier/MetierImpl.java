package tp1.metier;

import tp1.dao.IDao;

public class MetierImpl implements IMetier{

    private IDao dao; 

    @Override
    public double calcul() {
        // TODO Auto-generated method stub

        double tmp = dao.getData();

        double res = Math.PI*Math.cos(tmp)/Math.sqrt(tmp-Math.random());
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }


}
