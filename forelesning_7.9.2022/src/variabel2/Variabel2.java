package variabel2;

import static javax.swing.JOptionPane.*;

public class Variabel2 {

    public static void main(String [] args){
        int alderPer = 23;
        int alderLine, sumAlder;
        alderLine = 22;
        sumAlder = alderPer + alderLine;
        System.out.println("summen av alderen er "+sumAlder);

        String innNavn = showInputDialog("Skriv in navnet");
        String innAlder = showInputDialog("skriv inn alderen");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2022 - alder;
        showMessageDialog(null, innNavn+" er født "+fødselsår);

        String innStreng1 = showInputDialog("skriv inn et desimaltall");
        String innStreng2 = showInputDialog("Skriv inn et desimaltall til");

        double innTall1 = Double.parseDouble(innStreng1);
        double innTall2 = Double.parseDouble(innStreng2);
        double divisjon = innTall1 / innTall2;
        showMessageDialog(null, innTall1+" delt på "+innTall2+" er lik "+divisjon);



    }
}
