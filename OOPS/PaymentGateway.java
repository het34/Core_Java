package OOPS;

interface PaymentGateway {

    void pay(int amount);
}

class GooglePay implements PaymentGateway {

    public void pay(int amount) {
        System.out.println("Payment Successful: " + amount);
    }

    public static void main(String[] args) {

        GooglePay gp = new GooglePay();

        gp.pay(500);
    }
}