public class GolfCart extends Vehicle{
    private int numPassengers;

    public GolfCart(String name, int wheels, int numPassengers){
        super(name, wheels);
        this.numPassengers = numPassengers;
    }

    public void honk(){
        System.out.println("honk honk");
    }

    public int getNumPassengers(){
        return numPassengers;
    }
}
