public class Dealership {
    public static void main(String[] args) {
        //dealership
        //employee
        //vehicle
        //customer

        Customer cust1 = new Customer("Tom", "123 Anything St.", 12000);

        Vehicle vehicle = new Vehicle("BMW", "M3", 20000);

        Vehicle vehicle2 = new Vehicle("BMW", "M3", 20000);

        boolean value = vehicle2.equals(vehicle);
        System.out.println(value);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

        // WE NEED
        //employee class
        // handleCustomer( Customer cust, boolean finance , Vehicle vehicle)
        //   if (finance==true)
        //         runCreaditHistory(Customer cust , double doubleAmount)
        //   else if (Vehicle.getPrice()<= cust.cashOnHAnd)
        //          processTransation(Customer cust , Vehicle vehicle)
        //  else
        //          tell customer to bring money




    }
}
