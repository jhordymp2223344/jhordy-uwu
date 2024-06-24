package Semana3;

public class EjercicioDeScanner3 {
    public static void main(String[] args) {
        int euros;
        double pesetas;

        System.err.println("ingrese un monto de Euros: ");
        euros = Integer.parseInt(System.console().readLine());

        pesetas = euros * 4.09;
        System.out.println("El valor en pesetas es:"+pesetas);
    }
}