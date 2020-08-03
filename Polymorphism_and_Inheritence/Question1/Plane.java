public class Plane extends Question1 {
    private String colour ;
    private int numPassengers ;
    private int doors ;
    private String doortype;


    Plane(String colour, int passengers, String doortype , int doors) {
        this.numPassengers = passengers;
        this.colour = colour;
        this.doors = doors;
        this.doortype = doortype;
    }

    public String toString() {
        return colour + " " + numPassengers + " passengers" + " " + doortype + " " + doors ;
    }
}

