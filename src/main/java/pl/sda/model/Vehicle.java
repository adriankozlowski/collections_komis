package pl.sda.model;

public class Vehicle {
    private String id;
    private String vin;
    private String value;
    private String mark;
    private String model;
    private String chassis;
    private String typ;
    private String engine;
    private String injectionType;
    private String engineCode;
    private String productionYear;
    private String cylindersValves;
    private String volume;
    private String power;
    private String momentum;
    private String timing;
    private String exaustFilter;
    private String transmission;
    private String driveAxis;
    private String breaks;
    private String suspensionFront;
    private String suspensionRear;
    private String selfWeight;
    private String chassisDimension;
    private String trunkVolume;
    private String acceleration;
    private String vMax;
    private String consumption;
    private String tankVolume;
    private String powerWeightRatio;

    public Vehicle(String id, String vin, String value, String mark, String model, String chassis, String typ, String engine, String injectionType, String engineCode, String productionYear, String cylindersValves, String volume, String power, String momentum, String timing, String exaustFilter, String transmission, String driveAxis, String breaks, String suspensionFront, String suspensionRear, String selfWeight, String chassisDimension, String trunkVolume, String acceleration, String vMax, String consumption, String tankVolume, String powerWeightRatio) {
        this.id = id;
        this.vin = vin;
        this.value = value;
        this.mark = mark;
        this.model = model;
        this.chassis = chassis;
        this.typ = typ;
        this.engine = engine;
        this.injectionType = injectionType;
        this.engineCode = engineCode;
        this.productionYear = productionYear;
        this.cylindersValves = cylindersValves;
        this.volume = volume;
        this.power = power;
        this.momentum = momentum;
        this.timing = timing;
        this.exaustFilter = exaustFilter;
        this.transmission = transmission;
        this.driveAxis = driveAxis;
        this.breaks = breaks;
        this.suspensionFront = suspensionFront;
        this.suspensionRear = suspensionRear;
        this.selfWeight = selfWeight;
        this.chassisDimension = chassisDimension;
        this.trunkVolume = trunkVolume;
        this.acceleration = acceleration;
        this.vMax = vMax;
        this.consumption = consumption;
        this.tankVolume = tankVolume;
        this.powerWeightRatio = powerWeightRatio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getInjectionType() {
        return injectionType;
    }

    public void setInjectionType(String injectionType) {
        this.injectionType = injectionType;
    }

    public String getEngineCode() {
        return engineCode;
    }

    public void setEngineCode(String engineCode) {
        this.engineCode = engineCode;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getCylindersValves() {
        return cylindersValves;
    }

    public void setCylindersValves(String cylindersValves) {
        this.cylindersValves = cylindersValves;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getMomentum() {
        return momentum;
    }

    public void setMomentum(String momentum) {
        this.momentum = momentum;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getExaustFilter() {
        return exaustFilter;
    }

    public void setExaustFilter(String exaustFilter) {
        this.exaustFilter = exaustFilter;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDriveAxis() {
        return driveAxis;
    }

    public void setDriveAxis(String driveAxis) {
        this.driveAxis = driveAxis;
    }

    public String getBreaks() {
        return breaks;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public String getSuspensionFront() {
        return suspensionFront;
    }

    public void setSuspensionFront(String suspensionFront) {
        this.suspensionFront = suspensionFront;
    }

    public String getSuspensionRear() {
        return suspensionRear;
    }

    public void setSuspensionRear(String suspensionRear) {
        this.suspensionRear = suspensionRear;
    }

    public String getSelfWeight() {
        return selfWeight;
    }

    public void setSelfWeight(String selfWeight) {
        this.selfWeight = selfWeight;
    }

    public String getChassisDimension() {
        return chassisDimension;
    }

    public void setChassisDimension(String chassisDimension) {
        this.chassisDimension = chassisDimension;
    }

    public String getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(String trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public String getvMax() {
        return vMax;
    }

    public void setvMax(String vMax) {
        this.vMax = vMax;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(String tankVolume) {
        this.tankVolume = tankVolume;
    }

    public String getPowerWeightRatio() {
        return powerWeightRatio;
    }

    public void setPowerWeightRatio(String powerWeightRatio) {
        this.powerWeightRatio = powerWeightRatio;
    }
}
