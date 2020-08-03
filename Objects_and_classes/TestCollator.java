public class TestCollator {
    public static void main(final String[] args) {

        System.out.println("Test 1");
        Collator coll = new Collator("Black Gorilla");
        if (coll.label().equals("Black Gorilla")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("Test 2");
        coll = new Collator("Black Gorilla");
        coll.label("Blue Butterfly");
        if (coll.label().equals("Blue Butterfly")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Test 3");
        coll = new Collator("");
        coll.recordReading(5);
        coll.recordReading(26);
        coll.recordReading(14);
        coll.recordReading(39);
        if (coll.minimum() == 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Test 4");
        coll = new Collator("");
        coll.recordReading(5);
        coll.recordReading(26);
        coll.recordReading(14);
        coll.recordReading(39);
        if (coll.maximum() == 39) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.print("Test 5  \n");
        coll = new Collator("");
        coll.recordReading(5);
        coll.recordReading(26);
        coll.recordReading(14);
        coll.recordReading(39);
        if (coll.average() == 21) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
