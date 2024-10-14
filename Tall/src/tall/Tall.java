package tall;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class Tall {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        double tall2 = Double.parseDouble(innStreng2);
        double divisjon = tall1/tall2;
       JOptionPane.showMessageDialog(null, "Divisjonen ble "+divisjon);

    }

}
