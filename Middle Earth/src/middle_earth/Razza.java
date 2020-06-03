package middle_earth;

abstract public class Razza {
    String razza;
    int fazione; //1=bene 2=male
    int exp=1;
    int forza;
     int index=0;

    public Razza(String razza, int fazione,  int forza, int exp, int index){
        this.razza=razza; this.fazione=fazione; this.forza=forza; this.exp=exp; this.index=index;
    }

    abstract public int forzaP();

}
