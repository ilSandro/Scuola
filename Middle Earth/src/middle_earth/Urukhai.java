package middle_earth;

public class Urukhai extends Razza{

    public Urukhai(String razza, int fazione, int forza, int exp, int index) {
        super(razza, fazione, forza, exp, index);
    }

    public int forzaP() {
        return super.forza=50+(5*super.exp);
    }
}
