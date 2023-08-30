class UserService {
    private Logger logger;

    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void performSomeAction() {
        logger.log("Performed an action in UserService");
    }
}
interface Logger {
    void log(String message);
}
class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }
}
class FileLogger implements Logger {
    public void log(String message) {

    }
}
public class Main {
    public static void main(String[] args) {

        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();


        UserService userServiceWithConsoleLogger = new UserService(consoleLogger);
        userServiceWithConsoleLogger.performSomeAction();

        UserService userServiceWithFileLogger = new UserService(fileLogger);
        userServiceWithFileLogger.performSomeAction();
    }
}
