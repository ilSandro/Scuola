package middle_earth;

public class Elfi extends Razza{

    public Elfi(String razza, int fazione, int forza, int exp, int index) {
        super(razza, fazione, forza, exp, index);
    }

    public int forzaP() {
        if(super.exp < 5){
            return super.forza=20+(3*super.exp);
        }
        else{
            return super.forza=80+(2*super.exp);
        }
    }
}
