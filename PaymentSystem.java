class Payment {
    public void makePayment() {
        System.out.println("Processing generic payment...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing payment of ₹5,000 using Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing payment of ₹1,200 using UPI.");
    }
}

class CashPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Processing payment of ₹500 using Cash on Delivery.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        // Direct object creation and method calls
        CreditCardPayment cc = new CreditCardPayment();
        UPIPayment upi = new UPIPayment();
        CashPayment cash = new CashPayment();

        System.out.println("--- Direct Object Calls ---");
        cc.makePayment();
        upi.makePayment();
        cash.makePayment();

        // Demonstrating Runtime Polymorphism using Parent class reference
        System.out.println("\n--- Runtime Polymorphism with Parent Reference ---");
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new CashPayment();

        p1.makePayment(); 
        p2.makePayment(); 
        p3.makePayment(); 
    }
}