package jatek;

public class Jatek {
    public static void main(String[] args) {
        run();
    }
    
    public static void run(){
        Character c1 = new Character(6, 6, 6);
        Equipment sword = new Equipment("sword", "a rusty old sword");
        Equipment gold = new Equipment("Gold", "a little piece of gold coin");
        
        System.out.println(c1.toString());
        
        c1.pickup(sword, 1);
        c1.pickup(gold, 10);
        
        System.out.println(c1.toString());
    }
    
}
