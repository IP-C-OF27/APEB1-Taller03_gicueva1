public class Ejercicio04 {
    public static void main(String[] args) {
        int valor1 = 2;
        int valor2 = 3;
        int valor3 = 20;
        boolean resultado = valor3/(++valor2) + (valor1) >= (++valor1);
        
        System.out.println("El resultado de la operación es:  " + resultado);
    }
}
