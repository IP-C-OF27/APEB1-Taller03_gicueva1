public class Ejercicio05 {
    public static void main(String[] args) {
        int valor1 = 2;
        int valor2 = 12;
        double valor3 = 3;//en double porque la division para 3 suele no ser exacta
        double respuesta = (Math.pow(valor1, valor1) + valor2 - (--valor1))/valor3;
        System.out.println("La respuesta es:  " + respuesta);
    }
}
