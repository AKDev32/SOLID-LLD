
package Lesson4_LiskovSubstitutionPrinciple.BetterCode;


public class MasterCard extends CreditCard implements InternationPaymentCompatibleCreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay implementation of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer implementation of MasterCard");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Payments implementation of MasterCard");
    }

    @Override
    public void SwipeAndPay() {
        System.out.println("Swipe and Pay implementation of MasterCard");
    }


    @Override
    public void internationalPayment() {
        System.out.println("International Payment implementation on MasterCard");
    }
}
