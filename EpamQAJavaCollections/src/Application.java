import data.BaseElectricalAppliance;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        IElectricalApplianceManager manager = new ElectricalApplianceManager();
        System.out.println("Потребляемая мощность = " + manager.calculateSumPower());
        List<BaseElectricalAppliance> list = manager.sortingByPowerElectricalAppliance();
        System.out.println("Сортировка по мощности: ");

        for (BaseElectricalAppliance baseElectricalAppliance : list) {
            System.out.println(baseElectricalAppliance.getName() + " = " + baseElectricalAppliance.getPower() + "Вт");
        }

        List<BaseElectricalAppliance> listSearch = manager.searchElectricalApplianceParams("Холодильник №2", 100, true);

        for (BaseElectricalAppliance baseElectricalAppliance : listSearch) {
            System.out.println(baseElectricalAppliance.toString());
        }
    }
}
