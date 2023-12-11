package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Character {
    Random rnd = new Random();
    int hp, agility, luck;
    ArrayList <Equipment> equipment = new ArrayList<Equipment>();  

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
            this.equipment.add(item);
            
        }
    }
    
    public void use(String item){
        remove(item);
    }
    
    public void use(String item, int ammount){
        removeAmmount(item, ammount);
    }
    
    public void use(String item, int ammount, boolean use){
        if(use == true ){
            removeAmmount(item, ammount);
        }
    }
    
    private void remove(String item){
        this.equipment.remove(item);
    }
    
    private void removeAmmount(String item, int ammount){
        for (int i = 0; i < ammount; i++) {
            remove(item);
        }
    }

    @Override
    public String toString() {
        return "You're Character:" + " hp = " + hp + ", agility = " + agility + ", luck = " + luck + ", equipments = " + equipment;
    }
    
    
    
}
