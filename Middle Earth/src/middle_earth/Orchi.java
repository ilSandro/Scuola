package middle_earth;

public class Orchi extends Razza{

    public Orchi(String razza, int fazione, int forza, int exp, int index) {
        super(razza, fazione, forza, exp, index);
    }

    public int forzaP() {
        if(super.exp < 5){
            return super.forza=30+(2*super.exp);
        }
        else{
            return super.forza=70+(3*super.exp);
        }
    }
}
