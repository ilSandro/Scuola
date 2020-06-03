package middle_earth;

public class Hobbit extends Razza{

    public Hobbit(String razza, int fazione, int forza, int exp, int index) {
        super(razza, fazione, forza, exp, index);
    }

    public int forzaP() {
        return super.forza=10+(3*super.exp);
    }
}
