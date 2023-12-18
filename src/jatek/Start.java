package jatek;
public class Start extends Places {
    @Override
    public String description(){
        return "This is the start! Go left.";
    }

    @Override
    public Places oneWay() {
        return new Begining();
    }

    @Override
    public String BtnWay() {
        return "Left";
    }
}
