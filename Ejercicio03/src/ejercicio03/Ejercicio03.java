package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // TODO code application logic here
        double valor1 = 10;
        double valor2 = 2;
        double valor3 = 16;
        double valor4 = 11; //no necesito mas valores porque el resto los puedo consegiur operando y usaré un incremento para valor4
        double resultado = (Math.pow(valor1, valor2) + Math.sqrt(valor3) + ((valor1 * valor2)/(++valor4)));
        
        System.out.println("El resultado es:  " + resultado);
    }
    
}