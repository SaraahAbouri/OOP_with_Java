public class Softdrink {
    private String name;
    private String colour;
    private String volume;

    public Softdrink(String name, String colour, String volume) {
        this.name = name;
        this.colour = colour;
        this.volume = volume;
    }


    @Override
    public String toString() {
        return this.name + " " + this.colour + " " + this.volume;

    }


}
