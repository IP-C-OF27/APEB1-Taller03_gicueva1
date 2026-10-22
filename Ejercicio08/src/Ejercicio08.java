public class Ejercicio08 {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 3;
        int valor3 = 2;
        int valor4 = 50;//valores planteados para operar pq quiero ahorrar variables
        
        boolean resultado1 = ((valor1 * (valor2 * valor2)) + (valor1 * valor3) - ((valor1 * valor4)/valor3) + Math.pow(valor2, valor3)) >= (valor4 * (valor3 * valor3));
        boolean resultado2 = (valor4 >= (valor4 - valor4 + (++valor4)));
        boolean resultadoFinal = resultado1 || resultado2;
        
        System.out.println("El resultado final es:  " + resultadoFinal);
    }
}
