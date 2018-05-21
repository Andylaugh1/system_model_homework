import java.util.ArrayList;

public abstract class Ride {

    private int cost;
    private int minHeight;
    private String type;
    private int rating;
    private int capacity;
    private ArrayList<Customer> riders;

    public Ride(int cost, int minHeight, String type, int rating, int capacity){
        this.cost = cost;
        this.minHeight = minHeight;
        this.type = type;
        this.rating = rating;
        this.capacity = capacity;
        this.riders = new ArrayList<>();
    }

    public int getCost() {
        return this.cost;
    }

    public int getMinHeight(){
        return this.minHeight;
    }

    public String getType(){
        return this.type;
    }

    public int getRating(){
        return this.rating;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int countRiders(){
        return this.riders.size();
    }

    public boolean isRiderAllowedToRide(Customer customer){
        if (customer.getHeight() >= getMinHeight())
            return true;
        else
            return false;
    }

    public boolean canRiderAffordRide(Customer customer) {
        if (customer.getMoney() >= getCost())
            return true;
        else
            return false;
    }

    public void checkCustomerOntoRide(Customer customer) {
        if (isRiderAllowedToRide(customer) == true && canRiderAffordRide(customer) == true)
            if (customer.getMoney() >= getCost())
                this.riders.add(customer);
    }

    public void finishRide(){
        this.riders.clear();
    }
}
