import data.BaseElectricalAppliance;

import java.util.List;

public interface IElectricalApplianceManager {

    List<BaseElectricalAppliance> filteringByPowerElectricalAppliance(int power);

    List<BaseElectricalAppliance> filteringByNameElectricalAppliance(String name);

    List<BaseElectricalAppliance> filteringBySwitchOnElectricalAppliance(boolean isSwitchOn);

    List<BaseElectricalAppliance> sortingByPowerElectricalAppliance();

    List<BaseElectricalAppliance> searchElectricalApplianceParams(String name, int power, boolean isSwitchOn);

    int calculateSumPower();
}
