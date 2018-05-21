public class Rollercoaster extends Ride {

    private int numberOfLoops;

    public Rollercoaster(int cost, int minHeight, String type, int rating, int capacity, int numberOfLoops){
        super(cost, minHeight, type, rating, capacity);
        this.numberOfLoops = numberOfLoops;
    }

    public int getNumberOfLoops() {
        return this.numberOfLoops;
    }
}
