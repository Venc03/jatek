package jatek;

public class Left extends Places {

    @Override
    public String description() {
        return "You went to the left. Go East or West.";
    }

    @Override
    public Places oneWay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String BtnWay() {
     return "South";
    }
    
}
