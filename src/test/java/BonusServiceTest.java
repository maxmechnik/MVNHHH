import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    public static void main(String[] args) {

    }

    @org.junit.jupiter.api.Test
    void Test1() {
        BonusService service = new BonusService();
        long expected = 30;
        long actual = service.calculate(1000, true);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void Test2() {
        BonusService service = new BonusService();
        long expected = 500;
        long actual = service.calculate(1000000, true);
        Assertions.assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void Test3() {
        BonusService service = new BonusService();
        long expected = 30;
        long actual = service.calculate(1000, false);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void Test4() {
        BonusService service = new BonusService();
        long expected = 500;
        long actual = service.calculate(1000000, false);
        Assertions.assertEquals(expected, actual);

    }
}










