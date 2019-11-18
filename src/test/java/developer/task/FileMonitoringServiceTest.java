package developer.task;

import lombok.SneakyThrows;
import org.junit.Test;

import java.util.logging.Logger;

public class FileMonitoringServiceTest {

    Logger log = Logger.getLogger(FileMonitoringServiceTest.class.getName());

    // TODO: 11/18/19 тесты тесты тесты, нужен кейс где один и тот же юзер обрабатывется несколькими потоками и извстный результат подтверждается, то есть не искривляется асинхронностью.
    
    @SneakyThrows
    @Test
    public void runTest () {
        // TODO: тест проходит, но по факту он в потоке падает и ошибку не выдает. а через main в классе "FileMonitoringService" все работает нормально. С чем это связанно?
        String path = "./developer-task-logs";
        int countThread = 10;

        Thread thread = new Thread(new FileMonitoringService(path, countThread));
        thread.start();
    }
}