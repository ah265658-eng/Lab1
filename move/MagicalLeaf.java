package move;
import ru.ifmo.se.pokemon.*;

public final class MagicalLeaf extends SpecialMove {
    public MagicalLeaf() {
        super(Type.GRASS, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        return "использует Magical Leaf";
    }
}
