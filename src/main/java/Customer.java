import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Car> garage;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.garage = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void removeMoney(double cost){
        wallet -= cost;
    }

    public int getGarageCount(){
        return garage.size();
    }

    public void buyCar(Dealership dealership, String name) {
        Car boughtCar = dealership.sellCar(name);
        garage.add(boughtCar);
        this.removeMoney(boughtCar.getPrice());


    }
}
