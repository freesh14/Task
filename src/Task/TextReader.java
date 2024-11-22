package Task;

import java.util.Scanner;

public class TextReader {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TextCounter counter = new TextCounter();

        String input;
        System.out.println("Skriv text eller 'stop' för att avsluta: ");


        while (true){
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("stop")){
                break; // Avsluta om användaren skriver 'stop'
            }
            counter.count(input);// räkna tecken och rader
        }

        System.out.println("Antal rader: " + counter.getNumberOfRow());
        System.out.println("Antal rader: " + counter.getNumberOfChar());
    }


    }

