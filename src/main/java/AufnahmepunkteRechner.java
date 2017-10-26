/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   09
 * Übungstitel: Aufnahmepunkteberechnung
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Berechnung der Aufnahmepunkte für die Htl
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Schultypen und Noten mit if entscheiden und die Aufnahmezahl erfahren.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class AufnahmepunkteRechner {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.print("AHS (1), Hauptschule (2), Neue Mittelschule (3):");
        int schule = scanner.nextInt();
        // useless comment


        //Grundnoten
        int mathematiknote = 0;
        int deutschnote = 0;
        int englischnote = 0;
        int aufnahmepunkte = 0;

        //Leistungsgruppennoten
        int leistungMathematik = 0;
        int leistungDeutsch = 0;
        int leistungEnglisch = 0;
        int leistungMathematikContain = 0;
        int leistungDeutschContain = 0;
        int leistungEnglischContain = 0;

        //Grundlegend
        int grundlegendMathematik = 0;
        int grundlegendDeutch = 0;
        int grundlegendEnglish = 0;
        int grundlegendEnglishContain = 0;
        int grundlegendDeutchContain = 0;
        int grundlegendMathematikContain = 0;

        String ausgabe = "";
        String error = "";

        // AHS
        if (schule == 1) {

            System.out.print("Mathematiknote: ");
            mathematiknote = scanner.nextInt();

            System.out.print("Deutschnote: ");
            deutschnote = scanner.nextInt();

            System.out.print("Englischnote: ");
            englischnote = scanner.nextInt();

            aufnahmepunkte = 2 * mathematiknote + deutschnote + englischnote;
            ausgabe = "Aufnahmepunkte: " + aufnahmepunkte;

        }
        // Hauptschule
        else if (schule == 2){
            System.out.print("Mathematiknote: ");
            mathematiknote = scanner.nextInt();
            System.out.print("Leistungsgruppe Mathematik: ");
            leistungMathematik = scanner.nextInt();

            System.out.print("Deutschnote: ");
            deutschnote = scanner.nextInt();
            System.out.print("Leistungsgruppe Deutch: ");
            leistungDeutsch = scanner.nextInt();

            System.out.print("Englischnote: ");
            englischnote = scanner.nextInt();
            System.out.print("Leistungsgruppe Englisch ");
            leistungEnglisch = scanner.nextInt();

            switch (leistungMathematik){
                case 1 :
                    break;

                case 2 :
                    leistungMathematikContain = 2;
                    break;

                case 3 :
                    leistungMathematikContain = 5;
                    break;

                default:
                    error = "Leistungsgruppe " + leistungDeutsch + " existiert nicht.";
                    break;
            }

            switch (leistungEnglisch){
                case 1 :
                    break;

                case 2 :
                    leistungEnglischContain = 2;
                    break;

                case 3 :
                    leistungEnglischContain = 5;
                    break;

                default:
                    error = "Leistungsgruppe " + leistungDeutsch + " existiert nicht.";
                    break;
            }

            switch (leistungDeutsch){
                case 1 :
                    break;

                case 2 :
                    leistungDeutschContain = 2;
                    break;

                case 3 :
                    leistungDeutschContain = 5;
                    break;

                default:
                    error = "Leistungsgruppe " + leistungDeutsch + " existiert nicht.";
                    break;
            }

            aufnahmepunkte = ((mathematiknote + leistungMathematikContain) * 2) + (deutschnote + leistungDeutschContain) + (englischnote + leistungEnglischContain);
            ausgabe = "Aufnahmepunkte: " + aufnahmepunkte;


        }
        //NMS
        else if (schule == 3) {
            System.out.print("Mathematiknote: ");
            mathematiknote = scanner.nextInt();
            System.out.print("Grundlegende Allgemeinbildung: ");
            grundlegendMathematik = scanner.nextInt();

            System.out.print("Deutschnote: ");
            deutschnote = scanner.nextInt();
            System.out.print("Grundlegende Allgemeinbildung: ");
            grundlegendDeutch = scanner.nextInt();

            System.out.print("Englischnote: ");
            englischnote = scanner.nextInt();
            System.out.print("Grundlegende Allgemeinbildung: ");
            grundlegendEnglish = scanner.nextInt();

            switch (grundlegendMathematik) {
                case 0:
                    break;

                case 1:
                    grundlegendMathematikContain = 5;
                    break;

                default:
                    error = "Fehler bei der Eingabe von grundlegend";
            }

            switch (grundlegendDeutch){
                case 0:
                    break;

                case 1:
                    grundlegendDeutchContain = 5;
                    break;

                default:
                    error = "Fehler bei der Eingabe von grundlegend";
            }

            switch (grundlegendEnglish) {
                case 0:
                    break;

                case 1:
                    grundlegendEnglishContain = 5;
                    break;

                default:
                    error = "Fehler bei der Eingabe von grundlegend";
            }

            aufnahmepunkte = ((mathematiknote + grundlegendMathematikContain) * 2) + (englischnote + grundlegendEnglishContain) + (deutschnote + grundlegendDeutchContain);
            ausgabe = "Aufnahmepunkte: " + aufnahmepunkte;

        }

        if (error.equals("")) {
            System.out.println(ausgabe);
        }
        else {
            System.out.println(error);
        }
    }
}
