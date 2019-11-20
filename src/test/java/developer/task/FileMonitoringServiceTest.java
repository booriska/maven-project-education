package developer.task;

import lombok.SneakyThrows;
import org.junit.Test;

import java.util.logging.Logger;

public class FileMonitoringServiceTest {

    Logger log = Logger.getLogger(FileMonitoringServiceTest.class.getName());

    String path = "./developer-task-logs";

    // TODO: 11/18/19 тесты тесты тесты, нужен кейс где один и тот же юзер обрабатывется несколькими потоками и извстный результат подтверждается, то есть не искривляется асинхронностью.
    
//    @SneakyThrows
    @Test
    public void runTest () {
        // TODO: тест проходит, но по факту он в потоке падает и ошибку не выдает. а через main в классе "FileMonitoringService" все работает нормально. С чем это связанно?

        // TODO: 11/18/19 ну так это и работает, эксепшн в одном потоке на другой не влияет, для этого есть Callable. Чтобы тест прошел или нет нужен ассерт на твой результат и все будет пучком.
        // все равно не понял что мне нужно сделать, чтобы тест работал так же как и в main сейчас
        // TODO: 11/20/19 в тесте должны быть assert где они?
        int countThread = 10;

        Thread thread = new Thread(new FileMonitoringService(path, countThread));
        thread.start();
    }

    @Test
    public void someRunTest () {
        int countThread = 10;

        Thread threadOne = new Thread(new FileMonitoringService(path, countThread));
        Thread threadTwo = new Thread(new FileMonitoringService(path, countThread));

        threadOne.start();
        threadTwo.start();
    }
}