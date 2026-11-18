package move;
import ru.ifmo.se.pokemon.*;

public final class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18, 0.8, 0, 3);
    }

    @Override public String describe() {
        return "FurySwipes";
    }
}
