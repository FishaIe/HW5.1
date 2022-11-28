import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void testRegisteredRightCounting(int NumFrom, int NumTo, int expected) {
        SQRService service = new SQRService();

        int actual = (int) service.calculate(NumFrom, NumTo);

        Assertions.assertEquals(expected, actual);
    }


}
