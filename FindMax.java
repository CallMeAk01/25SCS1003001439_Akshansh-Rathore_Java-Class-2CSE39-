class FindMax {

    // Maximum between two integers
    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Maximum between three integers
    int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // Maximum between two decimal numbers
    double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        FindMax obj = new FindMax();

        int max1 = obj.max(15, 25);
        int max2 = obj.max(10, 50, 30);
        double max3 = obj.max(12.5, 8.4);

        System.out.println("Max of 2 integers: " + max1);
        System.out.println("Max of 3 integers: " + max2);
        System.out.println("Max of 2 decimals: " + max3);
    }
}