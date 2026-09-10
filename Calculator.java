public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Sum of two integers (10 + 20): " + calc.add(10, 20));
        System.out.println("Sum of three integers (10 + 20 + 30): " + calc.add(10, 20, 30));
        System.out.println("Sum of two decimals (10.5 + 20.5): " + calc.add(10.5, 20.5));
    }
}