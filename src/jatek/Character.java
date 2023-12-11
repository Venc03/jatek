package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Character {
    Random rnd;
    int hp, agility, luck;
    ArrayList <Equipment> item;  

    public Character(int hp, int agility, int luck) {
        this.hp = roll()+12;
        this.agility = roll()+6;
        this.luck = roll()+6;
    }
    
    private int roll(){
        return rnd.nextInt(6)*2;
    }
    
    public void pickup(Equipment item){
        this.pickup(item, 1);
    }
    
    public void pickup(Equipment item, int ammount){
        for (int i = 0; i < ammount; i++) {
            this.item.add(item);
            
        }
    }
    
}
