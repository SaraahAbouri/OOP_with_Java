public class CounterDisplay {
    private int value;
    private int limit;


    public CounterDisplay(int pLimit){
        this.value = 0;
        limit = pLimit;
    }

    public void setValue(int pValue){
        this.value = pValue;
    }

    public int getValue(){
        return this.value ;
    }

    public void increment(){
        if (value < limit) {
            value = value + 1;
        }
        if (value == limit ){
            value = 0;
        }
    }


    public String getDisplayvalue(){
        String format = String.format("%02d", value);
        return format;
    }

    public static void main(final String[] args) {
        CounterDisplay counterDisplay = new CounterDisplay(3);
        counterDisplay.increment();
        counterDisplay.increment();
        System.out.println(counterDisplay.getDisplayvalue());
        counterDisplay.increment();
        System.out.println(counterDisplay.getDisplayvalue());

    }


}

