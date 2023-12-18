package jatek;
public class Start extends Places {
    @Override
    public String description(){
        return "This is the start! Go Onwards.";
    }

    @Override
    public Places oneWay() {
        return new Begining();
    }

    @Override
    public String BtnWay() {
        return "Onwards";
    }
}
