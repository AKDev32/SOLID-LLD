package Lesson4_LiskovSubstitutionPrinciple.BetterCode;


public class VisaCard extends CreditCard implements InternationPaymentCompatibleCreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation of VISA");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer implementation of VISA");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments implementation of VISA");
    }

    @Override
    public void SwipeAndPay() {
        System.out.println("Swipe and Pay implementation of VISA");
    }

    @Override
    public void internationalPayment() {
        System.out.println("International Payment implementation of VISA");
    }
}
