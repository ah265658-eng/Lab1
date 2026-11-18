package move;
import ru.ifmo.se.pokemon.*;

public final class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        return "использует Aerial Ace";
    }
}