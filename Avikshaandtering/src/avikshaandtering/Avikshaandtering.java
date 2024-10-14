package avikshaandtering;

import javax.swing.*;

public class Avikshaandtering {
    public static void main(String [] args){
        String innStreng = JOptionPane.showInputDialog("Skriv inn et heltall");
        int tall;
        try{
            tall = Integer.parseInt(innStreng);
        }
        catch (Exception e){
            tall = 0;
            System.out.println(e);
        }
        System.out.println("Tallet er "+tall);
    }
}
