package middle_earth;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Razza> Bene = new ArrayList<Razza>();
        ArrayList<Razza> Male = new ArrayList<Razza>();
        ArrayList<Eroe> Eroi = new ArrayList<Eroe>();

        int scelta; //per il menù
        int scelta2; //menù interni

        String input;

        int b=0; int m=0; //tiene a mente il suo index ///usato anche nell'output come riconoscimento
        int x; int y; //index per i combattimenti

        do {
            scelta = Integer.parseInt(JOptionPane.showInputDialog("0. esci\n\n1. inserisci razza\n2. inserisci eroe" +
                    "\n\n3. visualizza personaggi inseriti\n4. combatti")); //menù ///dopo scelta razza, è necessario creare il suo eroe subito dopo?

            switch (scelta) {

                case 1: //scegli fazione--)razza ///dopo la scelta calcolo forzaP ////aggiungo all'arraylist

                    scelta2 = Integer.parseInt(JOptionPane.showInputDialog("Scegli la fazione:\n1. bene\n2. male"));
                    switch (scelta2) {

                        case 1:

                            scelta2 = Integer.parseInt(JOptionPane.showInputDialog("Scegli la razza:\n1. uomini\n2. elfi\n3. nani\n4. hobbit"));
                            if (scelta2 == 1) {

                                Uomini uomini = new Uomini("uomini", 1, 1, 1, b);
                                uomini.forzaP();
                                Bene.add(uomini);
                                b++;

                            }
                            else if (scelta2 == 2) {

                                Elfi elfi = new Elfi("elfi", 1, 1, 1, b);
                                elfi.forzaP();
                                Bene.add(elfi);
                                b++;

                            }
                            else if (scelta2 == 3) {

                                Nani nani = new Nani("nani", 1, 1, 1, b);
                                nani.forzaP();
                                Bene.add(nani);
                                b++;

                            }
                            else if (scelta2 == 4) {

                                Hobbit hobbit = new Hobbit("hobbit", 1, 1, 1, b);
                                hobbit.forzaP();
                                Bene.add(hobbit);
                                b++;

                            }
                            break;

                        case 2:

                            scelta2 = Integer.parseInt(JOptionPane.showInputDialog("Scegli la razza:\n1. orchi\n2. urukhai\n3. sudroni"));
                            if (scelta2== 1) {

                                Orchi orchi = new Orchi("orchi", 2, 1, 1, m);
                                orchi.forzaP();
                                Male.add(orchi);
                                m++;

                            }
                            else if (scelta2 == 2) {

                                Urukhai urukhai = new Urukhai("urukhai", 2, 1, 1, m);
                                urukhai.forzaP();
                                Male.add(urukhai);
                                m++;

                            }
                            else if (scelta2 == 3) {

                                Sudroni sudroni = new Sudroni("sudroni", 2, 1, 1, m);
                                sudroni.forzaP();
                                Male.add(sudroni);
                                m++;

                            }
                            break;
                    }
                    break;

                case 2: //crea eroe ///dopo creazione calcolo forzaE ////inserisco in arraylist

                    Eroe eroe = new Eroe(null,10,1,1);

                    input = JOptionPane.showInputDialog("Nome dell'eroe?\n");
                    eroe.nome = input;

                    eroe.forzaE();
                    Eroi.add(eroe);

                    break;

                case 3: //output personaggio + eroe

                    scelta2= Integer.parseInt(JOptionPane.showInputDialog("1. bene\n2. male"));
                    switch (scelta2){

                        case 1:

                            for (int i=0; i<Bene.size(); i++){ //l'eroe usa l'index per collegarsi all'eroe giusto?

                                System.out.println( "Statistiche Personaggio\nRazza: " + Bene.get(i).razza + " Fazione: " + Bene.get(i).fazione
                                        + " Forza: " + Bene.get(i).forza + " Exp: " + Bene.get(i).exp
                                        + "\nStatistiche Eroe\nNome: " + Eroi.get(Bene.get(i).index).nome + " HP: " + Eroi.get(Bene.get(i).index).hp
                                        + " Forza: " + Eroi.get(Bene.get(i).index).potenza + " Exp: " + Eroi.get(Bene.get(i).index).expE + "\n");

                            }
                            System.out.print("\n");
                            break;

                        case 2:

                            for (int i=0; i<Male.size(); i++){

                                System.out.println( "\nStatistiche Personaggio\nRazza: " + Male.get(i).razza + " Fazione: " + Male.get(i).fazione
                                        + " Forza: " + Male.get(i).forza + " Exp: " + Male.get(i).exp
                                        + "\nStatistiche Eroe\nNome: " + Eroi.get(Male.get(i).index).nome + " HP: " + Eroi.get(Male.get(i).index).hp
                                        + " Forza: " + Eroi.get(Male.get(i).index).potenza + " Exp: " + Eroi.get(Male.get(i).index).expE);

                            }
                            System.out.print("\n");
                            break;
                    }
                    break;

                case 4: //scelta combattenti tramite index, cioè posizione nell'arraylist ///if per valutare chi è vince ////confronto degli eroi

                    x = Integer.parseInt(JOptionPane.showInputDialog("Quale personaggio del bene?"));
                    y = Integer.parseInt(JOptionPane.showInputDialog("Quale personaggio del male?"));

                    if (Bene.get(x).forza > Male.get(y).forza) {

                        System.out.println("Il personaggio " + Bene.get(x).razza + " ha vinto contro " + Male.get(y).razza + "!");
                        Bene.get(x).exp+=1;
                        Bene.get(x).forzaP();

                    }
                    else if (Male.get(y).forza > Bene.get(x).forza) {

                        System.out.println("Il personaggio " + Male.get(y).razza + " ha vinto contro " + Bene.get(x).razza + "!");
                        Male.get(y).exp+=1;
                        Male.get(y).forzaP();

                    }

                    if (Eroi.get(Bene.get(x).index).potenza > Eroi.get(Male.get(y).index).potenza){

                        System.out.println("L'eroe del personaggio " + Bene.get(x).razza + " ha vinto!");

                        Eroi.get(Male.get(y).index).hp-=1;
                        Eroi.get(Bene.get(x).index).expE+=1;

                    }


            }

        }while(scelta != 0);

    }

}
