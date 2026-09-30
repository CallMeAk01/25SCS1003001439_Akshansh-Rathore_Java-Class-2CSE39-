public class AutoboxingDemo {
    public static void main(String[] args) {
        // Primitive values
        int primitiveInt = 100;
        double primitiveDouble = 45.67;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Autoboxing: Primitive to Wrapper Object
        Integer wrapperInt = primitiveInt;
        Double wrapperDouble = primitiveDouble;
        Character wrapperChar = primitiveChar;
        Boolean wrapperBoolean = primitiveBoolean;

        System.out.println("=== Autoboxing Demonstration ===");
        System.out.println("Primitive int value: " + primitiveInt + " --> Autoboxed Integer Object: " + wrapperInt);
        System.out.println("Primitive double value: " + primitiveDouble + " --> Autoboxed Double Object: " + wrapperDouble);
        System.out.println("Primitive char value: " + primitiveChar + " --> Autoboxed Character Object: " + wrapperChar);
        System.out.println("Primitive boolean value: " + primitiveBoolean + " --> Autoboxed Boolean Object: " + wrapperBoolean);
    }
}