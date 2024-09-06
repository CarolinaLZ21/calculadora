package calculadora;

import java.util.Scanner;

//Clase Operaciones
public class Operaciones {

    //Atributos del constructor
    int primernumero;
    int segundonumero;

    //Constructor
    public Operaciones(int primernumero, int segundonumero) {

        this.primernumero = primernumero;
        this.segundonumero = segundonumero;

    }

    //Metodo suma
    public int suma() {
        return primernumero + segundonumero;
    }

    //Metodo resta
    public int resta() {
        return  primernumero - segundonumero;
    }

    // Metodo multiplicacion
    public int multiplicacion() {
        return primernumero * segundonumero;
    }

    // Metodo division
    public int division() {
        return primernumero / segundonumero;
    }

    public static void main(String[] args) {

        Scanner pnumero = new Scanner(System.in);
        System.out.println("El primer Numero");
        int primernumero = pnumero.nextInt();

        Scanner snumero = new Scanner(System.in);
        System.out.println("El segundo Numero");
        int segundonumero = snumero.nextInt();

        // instancia de la clase Operaciones
        Operaciones operaciones = new Operaciones(primernumero, segundonumero);
        Scanner op = new Scanner(System.in);

        System.out.println("Elija la operación: 1. Suma 2. Resta 3. Multiplicación 4. División");
        int opcion = op.nextInt();

        int resultado = 0;
        switch (opcion) {
            case 1:
                resultado = operaciones.suma();
                break;
            case 2:
                resultado = operaciones.resta();
                break;
            case 3:
                resultado = operaciones.multiplicacion();
                break;
            case 4:
                resultado = operaciones.division();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
