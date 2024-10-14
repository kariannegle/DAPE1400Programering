package oblig3;

import java.util.Arrays;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class UnikeTall {

    // Deklarasjon av array for lagring av tilfeldige heltall
    int[] tilfeldigeTall;

   // Konstruktør som mottar arrayets lengde som parameter og oppretter arrayet
    public UnikeTall () {
        int arrayLength = Integer.parseInt(showInputDialog("Hvor mange tilfeldige tall ønsker du?"));
        tilfeldigeTall = new int [arrayLength];
    }

   // Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
    private boolean TallSjekker(int input){
        for (int i = 0; i < tilfeldigeTall.length; i++){
            if (input == tilfeldigeTall[i]){
                return true;
            }
        }
        return false;
    }

   //Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999
    public void FyllOppTall() {
        for (int i = 0; i < tilfeldigeTall.length; i++) {
            int tilfeldig = (int)(Math.random()*(900)+100);

            boolean unikeTallSjekk = TallSjekker(tilfeldig);

            while(unikeTallSjekk == true){
                tilfeldig = (int)(Math.random()*(900)+100);
                unikeTallSjekk = TallSjekker(tilfeldig);
            }
            tilfeldigeTall[i] = tilfeldig;
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayet
    private int minsteTallSjekk(int[] input){
        Arrays.sort(input);
        return input[0];
    }

    // Metode som finner og returnerer det største tallet i arrayet
    private int størsteTallSjekk(int[] input){
        Arrays.sort(input);
        return input[(input.length - 1)];
    }

    // Metode som beregner og returnerer den gjennomstnittlige verdien (double-verdi) av tallene i arrayet
    private double gjennomsnittTallSjekk(int[] input){
        int i = 0;
        int totalen = 0;
        double gjennomsnitt = 0.00;

        for (Integer tall : tilfeldigeTall){
            i++;
            totalen += tall;
        }
        gjennomsnitt = (double)totalen / (double)i;
        return gjennomsnitt;
    }

    // Metode som viser tallene i arrayet i en meldngsboks.
    public void MeldingsBoks(){
        String ut = "";
        int i = 0;
        for (Integer tall : tilfeldigeTall){
            ut += (tall + " ");
            i++;
            if (i % 10 == 0){
                ut += "\n";
            }
        }

        int minsteTall = minsteTallSjekk(tilfeldigeTall);
        int størsteTall = størsteTallSjekk(tilfeldigeTall);

        String gjennomsnittTall;
        gjennomsnittTall = String.format("%.1f",gjennomsnittTallSjekk(tilfeldigeTall));

        // melding
        ut += "\n" + "\n" + "Minste tall er " + minsteTall + "\n" + "Største tall er " + størsteTall + "\n" + "Gjennomsnittsverdien er " + gjennomsnittTall;

        showMessageDialog(null, ut);
    }

}
