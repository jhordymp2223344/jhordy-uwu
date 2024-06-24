package Semana3;

import java.util.Scanner;

public class EjercicioDeScanner2 {
    public static void main(String[] args) {
        
        double tasaConversion = 4.20; // 1 euro = 4.20 soles (puedes actualizar esta tasa según sea necesario)

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros que desea convertir a soles: ");
        double euros = scanner.nextDouble();

        double soles = euros * tasaConversion;

        
        System.out.println(euros + " euros son " + soles + " soles.");

       
        scanner.close();
     }
}