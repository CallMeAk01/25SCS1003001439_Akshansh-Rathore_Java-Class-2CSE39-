public class UnboxingDemo {
    public static void main(String[] args) {
        // Wrapper objects
        Integer wrapperInt = 500;
        Double wrapperDouble = 89.95;
        Character wrapperChar = 'Z';
        Boolean wrapperBoolean = false;

        // Unboxing: Wrapper Object to Primitive
        int primitiveInt = wrapperInt;
        double primitiveDouble = wrapperDouble;
        char primitiveChar = wrapperChar;
        boolean primitiveBoolean = wrapperBoolean;

        System.out.println("=== Unboxing Demonstration ===");
        System.out.println("Integer Object value: " + wrapperInt + " --> Unboxed primitive int: " + primitiveInt);
        System.out.println("Double Object value: " + wrapperDouble + " --> Unboxed primitive double: " + primitiveDouble);
        System.out.println("Character Object value: " + wrapperChar + " --> Unboxed primitive char: " + primitiveChar);
        System.out.println("Boolean Object value: " + wrapperBoolean + " --> Unboxed primitive boolean: " + primitiveBoolean);
    }
}