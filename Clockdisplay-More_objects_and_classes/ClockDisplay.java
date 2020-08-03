public class ClockDisplay {
    private CounterDisplay hours;
    private  CounterDisplay minutes;

    public ClockDisplay(int pHours, int pMinutes) {
        this.hours = new CounterDisplay(24) ;
        hours.setValue(pHours);
        this.minutes  = new CounterDisplay(60);
        minutes.setValue(pMinutes);

    }


    public void setTime(int pHours, int pMinutes) {
        hours = new CounterDisplay(24);
        hours.setValue(pHours);
        minutes = new CounterDisplay(60);
        minutes.setValue(pMinutes);
    }

    public void tick() {

        minutes.increment();

    }

    public String getDisplayValue() {

        return this.hours.getDisplayvalue() + ":" + this.minutes.getDisplayvalue();
    }

    public static void main(final String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay(5,30);
        clockDisplay.tick();
        System.out.println(clockDisplay.getDisplayValue());
    }

}


