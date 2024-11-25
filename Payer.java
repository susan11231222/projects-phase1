
public interface Payer
{
    public void processPayment(double amount);
    public String generateReceipt();
}
class CreditCardPayment implements Payer {
    public void processPayment(double amount){
System.out.println("amount paid by credit card:$"+amount);
    }
    public String generateReceipt(){
        String receipts="Credit card transaction ID:"+Math.random();
        return receipts;

    }
}
    class PayPalPayment implements Payer {
        public void processPayment(double amount){
            System.out.println("amount paid by payapal:$"+amount);
        }
        public String generateReceipt(){
            String receipt="credit card transaction ID:"+Math.random();
            return receipt;
        }

    }
    class Main{
        public static void main(String[] args) {
           CreditCardPayment myObj1=new CreditCardPayment();
           PayPalPayment myObj2=new PayPalPayment();
           myObj1.processPayment(200);
           myObj1.generateReceipt();
           myObj2.processPayment(200);
           myObj2.generateReceipt();

        }
    }