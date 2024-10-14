package variabler2_oppgaver;

import javax.swing.*;

public class Variabler2_Oppgaver {
    public static void main(String [] args){
        String innStreng = JOptionPane.showInputDialog("Skriv inn alderen din");
        int tall = Integer.parseInt(innStreng);
        int sum = tall;
        JOptionPane.showMessageDialog(null, "Min alder er "+sum+" år");
    }
}
