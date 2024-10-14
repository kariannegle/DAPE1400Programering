package tall;

import javax.swing.*;

public class Tall {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et desimaltall til");
        double tall1 = Double.parseDouble(innStreng1);
        double tall2 = Double.parseDouble(innStreng2);
        double divisjon = tall1/tall2;
        System.out.println("Divisjonen ble "+divisjon);
    }

}
