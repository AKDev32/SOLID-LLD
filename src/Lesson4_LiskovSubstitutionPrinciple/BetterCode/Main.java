package Lesson4_LiskovSubstitutionPrinciple.BetterCode;

import Lesson4_LiskovSubstitutionPrinciple.ProblematicCode.CreditCard;
import Lesson4_LiskovSubstitutionPrinciple.ProblematicCode.RuPayCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for (InternationPaymentCompatibleCreditCard card : cards) {
            card.internationalPayment();
        }
    }
}
