package jatek;

public class Begining extends Places {
    @Override
    public String description(){
        return "This is the begining. Go onwards.";
    }

    @Override
    public Places oneWay() {
        throw new UnsupportedOperationException("we dont know where to from the start"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String BtnWay() {
        return "Onwards";
    }
}
