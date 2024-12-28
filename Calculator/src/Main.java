public class Main {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println("Addition: " + calculator.add(5,5));
    System.out.println("Subtraction: " + calculator.subtract(10, 5));
    System.out.println("Multiplication: " + calculator.multiply(10,5));
    System.out.println("Division:" + calculator.divide(10,2));
    }
}