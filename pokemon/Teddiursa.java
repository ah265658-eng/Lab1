package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Teddiursa extends Pokemon {
    public Teddiursa(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(60, 80, 50, 50, 50, 40);
        setMove(new Bulldoze(), new FurySwipes(), new AerialAce());
    }
}