public class Car extends Question1 {
    private String colour ;
    private int numPassengers ;
    private int doors ;

    public Car (String colour, int passengers, int doors){
        this.numPassengers = passengers;
        this.colour = colour;
        this.doors = doors;
    }

    public String toString() {
        return colour + " " + numPassengers + " passengers" + " " + doors + " passengers";
    }

}

