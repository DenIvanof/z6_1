import org.example.zadanie6_1.services.IncomeExpensesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeExpensesServiceTest {

    @Test
    public void restSmallSalary() {
        IncomeExpensesService service = new IncomeExpensesService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void restBigSalary() {
        IncomeExpensesService service = new IncomeExpensesService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void restNoIncome() {
        IncomeExpensesService service = new IncomeExpensesService();
        int expected = 0;
        int actual = service.calculate(10_000, 10_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }
}
