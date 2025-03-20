package slack.inheritance_task;

public class SmartWatch extends Technique {
    private boolean hasHeartRateMonitor;

    public SmartWatch(String brand, int version, boolean hasHeartRateMonitor) {
        super("Акылдуу саат", brand, version);
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    public boolean hasHeartRateMonitor() {
        return hasHeartRateMonitor;
    }

    public void setHasHeartRateMonitor(boolean hasHeartRateMonitor) {
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    @Override
    public String turnOnOff() {
        return super.turnOnOff();
    }

    @Override
    public String toString() {
        return super.toString() + ", Жүрөк согушун өлчөгүч: " + (hasHeartRateMonitor ? "Ооба" : "Жок");
    }
}

