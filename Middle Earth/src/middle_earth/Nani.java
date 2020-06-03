package middle_earth;

public class Nani extends Razza{

    public Nani(String razza, int fazione, int forza, int exp, int index){
        super(razza, fazione, forza, exp, index);
    }

    public int forzaP() {
        return super.forza=20+(4*super.exp);
    }
}
