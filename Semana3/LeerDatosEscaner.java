package Semana3;

import java.util.Scanner;

public class LeerDatosEscaner {
    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce tu nombre;");
        String nombre = lee.nextLine();

        System.out.println("Introduce tu edad");
        int edad = Integer.parseInt(lee.nextLine());

        System.out.println("tu nombre es: " + nombre + "tu edad es:" + edad);
        lee.close();

    }
}
