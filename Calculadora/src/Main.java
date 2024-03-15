public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " +calculadora.suma(4,3));
        System.out.println("Resta: " +calculadora.suma(3,3));
        System.out.println("Multiplicacion: " +calculadora.suma(5,2));

        System.out.println("Division: " +calculadora.division(6,3));

        // Ejemplo de division entre 0
        try {
            System.out.println("División por cero: " + calculadora.division(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
