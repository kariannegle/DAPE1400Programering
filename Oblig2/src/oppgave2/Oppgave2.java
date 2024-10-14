package oppgave2;

import static javax.swing.JOptionPane.*;

class Tallspill {
    public int nyttTall() {
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding){
        showMessageDialog(null, melding);
    }

    private void forLite(int tall){
        String melding = tall + " er for lite, prøv igjen!";
        visMelding(melding);
    }

    private void forStort(int tall) {
        String melding = tall + " er for stort, prøv igjen!";
        visMelding(melding);
    }

    public void avsluttRunde(int antall, int gjetning) {
        String melding = "Tallet " + gjetning + " er riktig!" +"\n"+ "Du gjettet riktig etter " + antall + " forsøk.";
        visMelding(melding);
    }

    public void kjørSpill() {
        int randomTall = nyttTall();
        System.out.println(randomTall);
        int antall = 0;
        String inntall = showInputDialog("Jeg tenker på et tall mellom 0 og 200." + "\n" + "Prøv å gjette på tallet:");

        int tall2;
        try {
            tall2 = Integer.parseInt(inntall);
        }
        catch (Exception E){
            showMessageDialog(null, "Error!" +"\n"+ "Du har ikke skrevet inn et tall");
            tall2 = 0;
        }
        while (tall2 != randomTall){
            if (tall2 < randomTall){
                forLite(tall2);
                inntall = showInputDialog("Jeg tenker på et tall mellom 0 og 200." + "\n" + "Prøv å gjette på tallet:");
                try {
                    tall2 = Integer.parseInt(inntall);
                }
                catch (Exception E){
                    showMessageDialog(null, "Error!" +"\n"+ "Du har ikke skrevet inn et tall");
                    tall2 = 0;
                }
                antall++;
            }

            else if (tall2 > randomTall){
                forStort(tall2);
                inntall = showInputDialog("Jeg tenker på et tall mellom 0 og 200." + "\n" + "Prøv å gjette på tallet:");
                try {
                    tall2 = Integer.parseInt(inntall);
                }
                catch (Exception E){
                    showMessageDialog(null, "Error!" +"\n"+ "Du har ikke skrevet inn et tall");
                    tall2 = 0;
                }
                antall++;

            }

        }
        avsluttRunde(antall,randomTall);
    }
}

public class Oppgave2 {
    public static void main (String [] args){
        Tallspill spill = new Tallspill();
        spill.kjørSpill();

    }
}
