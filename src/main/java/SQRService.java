public class SQRService {
    public long calculate(int NumFrom, int NumTo) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i >= NumFrom && i * i <= NumTo) {
                count++;
            }
        }
        return count;
    }
}