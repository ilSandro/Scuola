package middle_earth;

public class Uomini extends Razza{

    public Uomini(String razza, int fazione, int forza, int exp, int index) {
        super(razza, fazione, forza, exp, index);
    }

    public int forzaP() {
        return super.forza=30+(6*super.exp);
    }

}
