package middle_earth;

public class Sudroni extends Razza{

    public Sudroni(String razza, int fazione, int forza, int exp, int index) {
        super(razza, fazione, forza, exp, index);
    }

    public int forzaP() {
        return super.forza=40+(5*super.exp);
    }
}
