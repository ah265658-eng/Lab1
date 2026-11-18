package move;
import ru.ifmo.se.pokemon.*;

final public class DisarmingVoice extends SpecialMove {
    public DisarmingVoice() {
        super(Type.FAIRY, 40, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        return "использует Disarming Voice";
    }
}
