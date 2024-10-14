package oppgave1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    public static void main (String [] args){

        int sum = 0;
        int nedreGrense = Integer.parseInt(showInputDialog("Skriv inn nedre grense for summen"));
        int øvreGrense = Integer.parseInt(showInputDialog("Skriv inn øvre grene for summen"));

        if(nedreGrense >= øvreGrense){
            showMessageDialog(null, "Den nedre grensen for summen er mindre eller lik den øvre grensen, skriv inn på nytt.");
        }
        while (nedreGrense <= øvreGrense){
            System.out.print(nedreGrense);
            sum = sum + nedreGrense;

            if (nedreGrense < øvreGrense){
                System.out.print(" + ");
            }
            else {
                System.out.print(" = " + sum);
            }
            if (nedreGrense % 10 == 0 ){
                System.out.println(" ");
            }
            nedreGrense++;

        }

    }

}
