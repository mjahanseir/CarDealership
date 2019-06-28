public class Employee {


    //Method
    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {

        if (finance == true) {
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();

            runCreaditHistory( cust, loanAmount);

        } else if (vehicle.getPrice() <= cust.getCashOnHand()) {
            processTransation( cust,  vehicle);
        } else {
            System.out.println("customer need more money to purchase vehicle : " + vehicle);
        }
    }


    public void runCreaditHistory(Customer cust, double loanAmount) {

        System.out.println("Ran credit history for customer ...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransation(Customer cust, Vehicle vehicle) {
        System.out.println("Customer has purchase the vehicle : " + vehicle + "for the price " + vehicle.getPrice());
    }


}
