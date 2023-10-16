package proyectos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class calculator {

    private static final List<String> choices = Arrays.asList("1", "2", "3", "4", "5", "6"); 

    private static final void calc(String choice, Long num1, Long num2) {

        if (num1 == 0 && num2 == 0 && choice.equals("4")) { System.out.println("\nNo puedes dividir entre Zero."); return;} 

        switch (choice) {

            case "1" : {System.out.printf("\nResultado: %d\n", (num1 + num2)); break;}
            case "2" : {System.out.printf("\nResultado: %d\n", (num1 - num2)); break;}
            case "3" : {System.out.printf("\nResultado: %d\n", (num1 * num2)); break;}
            case "4" : {System.out.printf("\nResultado: %d\n", (num1 / num2)); break;}

        }

    }

    public static void main(String[] args) {

        var runtime = java.lang.Runtime.version();

        if (!runtime.toString().startsWith("17")) {

            System.out.println("Este script solo es compatible con Java 17.\n");

            return;

        }
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                
        Calculadora en Java

        Opciones:

        - (1) -> Sumar
        - (2) -> Restar
        - (3) -> Multiplicar
        - (4) -> Dividir
        - (5) -> Raíz Cuadrada
        - (6) -> Salir
        """);

        var choice = scanner.nextLine();

        while(choices.contains(choice)) {

            if (choice.equals("6")) {

                scanner.close();
                return;

            } else if (choice.equals("5")) {

                try {

                    System.out.println("\nNúmero: ");
                    var num1 = scanner.nextLong();

                    System.out.println(Math.sqrt(num1));

                    scanner.close();
                    return;

                } catch (Exception e) {

                    System.out.println("\n Los valores ingresados deben ser númericos de tipo entero, además de respetar los limites de Long.");

                    scanner.close();
                    return;

                }

            }

            try {

                System.out.println("\nNúmero 1: ");
                var num1 = scanner.nextLong();
                
                System.out.println("\nNúmero 2: ");
                var num2 = scanner.nextLong();

                calc(choice, num1, num2);
                scanner.close();
                return;

            } catch (Exception e ) {

                System.out.println("\n Los valores ingresados deben ser númericos de tipo entero, además de respetar los limites de Long.");
                return;

            }

        }

        scanner.close();

        System.out.println("\nOpción inválida.");
        return;

    }

   
}