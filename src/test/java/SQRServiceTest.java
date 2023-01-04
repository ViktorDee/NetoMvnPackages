import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.NetoMvnPackages.services.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcInTheRange() {
        SQRService service = new SQRService();

        int expected = 16;
        int actual = service.calcSortOut(1000, 2300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOutOfTheRange() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSortOut(1, 10_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcLessThanMinNumber() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSortOut(50, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMoreThanMaxNumber() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSortOut(9900, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcIfZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSortOut(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/boundary.csv")
    public void shouldCalcBoundary(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSortOut(min, max);

        Assertions.assertEquals(expected, actual);
    }


}
