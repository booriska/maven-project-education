package simpleTasks.DomesticAppliances;

public class Laptop extends DomesticAppliance {

    public Laptop(String madeBy) {
        super(madeBy);
    }

    @Override
    public ElectricityCost consumeElectricity() {
        return null;
    }
}
