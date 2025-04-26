package services.netology;

import org.junit.jupiter.api.Test;
import ru.netology.FreelanceService;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {

    @Test
    void calculateRestMonthsExample1() {
        FreelanceService service = new FreelanceService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        System.out.println("=== Пример 1: income=10_000, expenses=3_000, threshold=20_000 ===");
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        System.out.println("Ожидается месяцев отдыха: " + expected);
        System.out.println("Фактический результат: " + actual);
        System.out.println();

        assertEquals(expected, actual);
    }

    @Test
    void calculateRestMonthsExample2() {
        FreelanceService service = new FreelanceService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        System.out.println("=== Пример 2: income=100_000, expenses=60_000, threshold=150_000 ===");
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        System.out.println("Ожидается месяцев отдыха: " + expected);
        System.out.println("Фактический результат: " + actual);
        System.out.println();

        assertEquals(expected, actual);
    }
}
