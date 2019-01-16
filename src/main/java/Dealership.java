import java.util.ArrayList;

public class Dealership {

    private Supplier supplier;
    private Till till;
    private ArrayList<Customer> customers;
    private ArrayList<Car> cars;

    public Dealership(Supplier supplier, Till till) {
        this.supplier = supplier;
        this.till = till;
        this.customers = new ArrayList<>();
        this.cars = new ArrayList<>();
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Till getTill() {
        return till;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public Car sellCar(String name){
        for (Car car: cars){
            if (car.getName() == name){
                till.addMoney(car.getPrice());
                cars.remove(car);
                return car;
            }
        }
        return null;
    }


}
