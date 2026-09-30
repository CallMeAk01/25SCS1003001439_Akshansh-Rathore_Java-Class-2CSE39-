public class PrimitiveAndWrapper {
    public static void main(String[] args) {
        // Primitive variables
        byte pByte = 12;
        short pShort = 100;
        int pInt = 1000;
        long pLong = 50000L;
        float pFloat = 10.5f;
        double pDouble = 99.99;
        char pChar = 'J';
        boolean pBoolean = true;

        // Corresponding Wrapper Class variables
        Byte wByte = pByte;
        Short wShort = pShort;
        Integer wInt = pInt;
        Long wLong = pLong;
        Float wFloat = pFloat;
        Double wDouble = pDouble;
        Character wChar = pChar;
        Boolean wBoolean = pBoolean;

        System.out.println("=== Primitive and Wrapper Variables ===");
        System.out.println("byte: " + pByte + " | Byte Object: " + wByte);
        System.out.println("short: " + pShort + " | Short Object: " + wShort);
        System.out.println("int: " + pInt + " | Integer Object: " + wInt);
        System.out.println("long: " + pLong + " | Long Object: " + wLong);
        System.out.println("float: " + pFloat + " | Float Object: " + wFloat);
        System.out.println("double: " + pDouble + " | Double Object: " + wDouble);
        System.out.println("char: " + pChar + " | Character Object: " + wChar);
        System.out.println("boolean: " + pBoolean + " | Boolean Object: " + wBoolean);
    }
}