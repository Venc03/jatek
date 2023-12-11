package jatek;

import java.util.ArrayList;
import java.util.Random;

public class Character {
    Random rnd;
    int hp = rnd.nextInt(6)*2+12;
    int agility = rnd.nextInt(6)*+6;
    int luck = rnd.nextInt(6)*+6;
    ArrayList <String> equipment;
}
