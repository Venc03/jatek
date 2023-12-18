package jatek;

public class Right extends Places implements OtherWay{

    @Override
    public String description() {
        return "You went to the right. Go North or South.";
    }

    @Override
    public Places oneWay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String BtnWay() {
        return "South";
    }

    @Override
    public Places OtherWay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String BtnOtherWay() {
        return "North";
    }
    
}
