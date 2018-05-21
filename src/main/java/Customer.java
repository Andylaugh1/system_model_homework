public class Customer {

    private String name;
    private int height;
    private int money;

    public Customer(String name, int height, int money){
        this.name = name;
        this.height = height;
        this.money = money;
    }


    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMoney() {
        return this.money;
    }

    public void payForRide(Ride ride){
        money -= ride.getCost();

    }
}
