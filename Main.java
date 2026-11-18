import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
        public static void main(String[] args) {
                Battle b = new Battle();

                // Команда 1
                Pokemon p1 = new Darkrai("Тень", 1);
                Pokemon p2 = new Ursaring("Медведь", 1);
                Pokemon p3 = new Florges("Цветок", 1);

                // Команда 2
                Pokemon p4 = new Teddiursa("Мишка", 1);
                Pokemon p5 = new Flabebe("Бутон", 1);
                Pokemon p6 = new Floette("Стебель", 1);

                b.addAlly(p1);
                b.addAlly(p2);
                b.addAlly(p3);

                b.addFoe(p4);
                b.addFoe(p5);
                b.addFoe(p6);

                b.go();
        }
}