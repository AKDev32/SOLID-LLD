package Lesson4_LiskovSubstitutionPrinciple.BetterCode;

public abstract class CreditCard {
    private String ccNumber;
    private String ownerName;
    private int cvv;

    public void setCCNumber (String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setOwnerName (String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCvv (int cvv) {
        this.cvv = cvv;
    }

    public String getCCNumber () {
        return ccNumber;
    }

    public abstract void tapAndPay ();

    public abstract void onlineTransfer ();

    public abstract void mandatePayments ();

    public abstract void SwipeAndPay ();

    public void displayCreditCardDetails () {
        System.out.println("CC Number : " + this.ccNumber + " , with Owner Name : " + this.ownerName);
    }
}
