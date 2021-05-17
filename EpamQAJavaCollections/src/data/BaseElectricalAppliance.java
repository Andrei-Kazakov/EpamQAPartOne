package data;

public class BaseElectricalAppliance {
    private final String name;
    private final int power;
    private boolean isSwitchOn;

    public BaseElectricalAppliance(String name, int power, boolean isSwitchOn) {
        this.name = name;
        this.power = power;
        this.isSwitchOn = isSwitchOn;
    }

    public String getName() {
        return this.name;
    }

    public int getPower() {
        return this.power;
    }

    public boolean isSwitchOn() {
        return this.isSwitchOn;
    }

    public void setSwitchOn(boolean switchOn) {
        this.isSwitchOn = switchOn;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" + "name='" + this.name + '\'' + ", power=" + this.power + ", isSwitchOn=" + this.isSwitchOn + '}';
    }
}
