package pokemon;

import move.*;

public final class Ursaring extends Teddiursa {
    public Ursaring(String name, int level) {
        super(name, level);
        setStats(90, 130, 75, 75, 75, 55);
        addMove(new FocusBlast());
    }
}