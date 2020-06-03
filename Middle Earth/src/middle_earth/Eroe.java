package middle_earth;

public class Eroe {
    String nome;
    int hp=10; //da 1 a 10, se 1=morto?
    int potenza;
    int expE=1;

    public Eroe(String nome, int hp, int potenza, int expE){
        this.nome=nome; this.hp=hp; this.potenza=potenza; this.expE=expE;
    }

    public int forzaE(){
        return this.potenza=(50*this.expE)+(50*this.hp);
    }
}
