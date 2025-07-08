package Lesson2_OpenClosedPrinciple.HomeWork.BetterCode.Solution2;

public class Client {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.VehicleInsuranceEvaluator();

        Vehicle veh = new Truck();
        veh.VehicleInsuranceEvaluator();
    }
}
