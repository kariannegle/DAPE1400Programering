package Variabler_Oppg1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String [] args){
        String navn,etternavn;
        navn = "Karianne";
        etternavn = "Glent";
        System.out.println("Fornavnet er "+navn);
        System.out.println("Etternavnet er "+etternavn);

        String innNavn = showInputDialog("Skriv inn fornavnet");
        String innEtternavnet = showInputDialog("Skriv inn etternavnet");
        showMessageDialog(null, innNavn+" har etternavnet "+innEtternavnet);

        String alder = "19";
        System.out.println("Alderen til Karianne er "+alder);

        String innAlder = showInputDialog("Skriv inn din alder");
        showMessageDialog(null,innNavn+" "+innEtternavnet+" har alderen "+innAlder);

        String adresse = "Seljeslyngen 3";
        String postNr = "2164";
        String postAdresse = "Skogbygda";
        System.out.println("Adressen til "+innNavn+" "+innEtternavnet+" er "+adresse+" "+postNr+" "+postAdresse);

        String innAdresse = showInputDialog("Skriv inn adressen din");
        String innPostNr = showInputDialog("Skriv inn postnummeret ditt");
        String innPostAdresse = showInputDialog("Skriv inn postadressen din");
        showMessageDialog(null,innNavn+" "+innEtternavnet+" bor i "+innAdresse+" som har postnummer "+innPostNr+" i "+innPostAdresse);

        String ut = "Navnet er : "+innNavn+"\n"+"Adressen er : "+innAdresse+"\n"+"Postnummer : "+innPostNr+"\n"+"Poststed : "+innPostAdresse+"\n"+"Alder : "+innAlder;
        System.out.println(ut);
        showMessageDialog(null,ut);


    }
}
