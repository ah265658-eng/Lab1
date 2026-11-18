package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Darkrai extends Pokemon {
    public Darkrai(String name, int level) {
        super(name, level);
        setType(Type.DARK);
        setStats(70, 90, 90, 135, 90, 125);
        setMove(new WillOWisp(), new PoisonJab(), new SwordsDance(), new AerialAce());
    }
}
