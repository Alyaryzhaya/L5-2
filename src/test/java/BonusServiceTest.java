import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test

    public void test() {  // простая функция, которая ничего не принимает и ничего не возвращает

// переносим логику из Main
        BonusService service = new BonusService(); // обьект
        int expected = 150;
        int actual = service.calcBonus(5000, true);
        //  System.out.println("1. " + expected + "==//==" + actual);  // нас не устраивает вывод на экран для просмотра глазами

        Assertions.assertEquals(expected, actual);  // проверка соответствия ожидаемого и фактического результата
    }

    @Test

    public void testUnRegUnderLimit() {
        BonusService service = new BonusService(); // обьект
        int expected = 50;
        int actual = service.calcBonus(5000, false);
        //System.out.println("2. " + expected + "==//==" + actual);
        Assertions.assertEquals(expected, actual);
    }

}
