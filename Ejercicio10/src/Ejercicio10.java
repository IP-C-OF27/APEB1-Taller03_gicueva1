public class Ejercicio10 {
    public static void main(String[] args) {
        int valor1 = 25;
        int valor2 = 10;
        int valor3 = 100;
        int valor4 = 2;
        int valor5 = 5;
        
        boolean respuesta1 = Math.sqrt(valor1) * valor2 >= valor3;
        boolean respuesta2 = true;
        boolean respuesta3 = false;
        boolean respuesta4 = valor2 / valor5 >= valor4;
        
        
        boolean respuesta = respuesta1 && respuesta2 || respuesta3 || respuesta4;
        System.out.println("La respuesta final es:  " + respuesta);
    }
}
