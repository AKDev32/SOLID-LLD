package Lesson2_OpenClosedPrinciple.Example1.BetterCode;

public class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS...");
    }
}
