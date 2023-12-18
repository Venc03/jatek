package jatek;

public class Begining extends Places implements OtherWay{
    @Override
    public String description(){
        return "This is the begining. Go to right or left.";
    }

    @Override
    public Places oneWay() {
        return new Right();
    }

    @Override
    public String BtnWay() {
        return "Right";
    }

    @Override
    public Places OtherWay() {
        return new Left();
    }

    @Override
    public String BtnOtherWay() {
        return "Left";
    }
}
