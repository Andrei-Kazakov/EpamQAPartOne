import data.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ElectricalApplianceManager implements IElectricalApplianceManager {

    private final List<BaseElectricalAppliance> electricalApplianceList = new ArrayList();

    public ElectricalApplianceManager() {
        this.createListElectricalApplications();
    }

    @Override
    public List<BaseElectricalAppliance> filteringByPowerElectricalAppliance(int power) {
        return filtering(baseElectricalAppliance -> baseElectricalAppliance.getPower() == power);
    }

    @Override
    public List<BaseElectricalAppliance> filteringByNameElectricalAppliance(String name) {
        return filtering(baseElectricalAppliance -> baseElectricalAppliance.getName().equals(name));
    }

    @Override
    public List<BaseElectricalAppliance> filteringBySwitchOnElectricalAppliance(boolean switchOn) {
        return filtering(baseElectricalAppliance -> baseElectricalAppliance.isSwitchOn() == switchOn);
    }

    @Override
    public List<BaseElectricalAppliance> sortingByPowerElectricalAppliance() {
        List<BaseElectricalAppliance> list = this.electricalApplianceList;
        list.sort(Comparator.comparingInt(BaseElectricalAppliance::getPower).reversed());
        return list;
    }

    @Override
    public int calculateSumPower() {
        List<BaseElectricalAppliance> list = this.filteringBySwitchOnElectricalAppliance(true);
        int power = 0;

        for (BaseElectricalAppliance baseElectricalAppliance : list) {
            power += baseElectricalAppliance.getPower();
        }

        return power;
    }

    @Override

    public List<BaseElectricalAppliance> searchElectricalApplianceParams(String name, int power, boolean switchOn) {
        return filtering(baseElectricalAppliance -> baseElectricalAppliance.getName().equals(name) && baseElectricalAppliance.getPower() == power && baseElectricalAppliance.isSwitchOn() == switchOn);
    }

    private ArrayList<BaseElectricalAppliance> filtering(Predicate predicate) {
        ArrayList<BaseElectricalAppliance> list = new ArrayList();

        for (BaseElectricalAppliance baseElectricalAppliance : electricalApplianceList) {
            if (predicate.checked(baseElectricalAppliance)) {
                list.add(baseElectricalAppliance);
            }
        }

        return list;
    }

    interface Predicate {
        boolean checked(BaseElectricalAppliance baseElectricalAppliance);
    }

    private void createListElectricalApplications() {
        this.electricalApplianceList.add(new Kettle("Чайник №1", 600, true));
        this.electricalApplianceList.add(new Kettle("Чайник №2", 1000, false));
        this.electricalApplianceList.add(new Kettle("Чайник №3", 2500, true));
        this.electricalApplianceList.add(new Fridge("Холодильник №1", 300, true));
        this.electricalApplianceList.add(new Fridge("Холодильник №2", 100, true));
        this.electricalApplianceList.add(new Tv("Телевизор №1", 250, true));
        this.electricalApplianceList.add(new Tv("Телевизор №2", 120, true));
        this.electricalApplianceList.add(new Washer("Стиралка №1", 2000, false));
        this.electricalApplianceList.add(new Washer("Стиралка №2", 1000, true));
        this.electricalApplianceList.add(new Nuke("Микроволновка №1", 1500, true));
    }
}
