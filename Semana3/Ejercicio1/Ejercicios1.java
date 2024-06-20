package Semana3.Ejercicio1;

public class Ejercicios1 {
    public static void main(String[] args) {
        int euros;
        double soles;

        System.err.println("ingrese un monto de Euros: ");
        euros = Integer.parseInt(System.console().readLine());

        soles = euros * 4.09;
        System.out.println("El valor en soles es:"+soles);
    }
}