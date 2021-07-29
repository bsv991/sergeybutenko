package ua.hillel.logger;

/**
 * HomeWork 7
 */
public class Logger {
    public static final String DEBUG = "DEBUG";
    public static final String INFO = "INFO";
    public static final String WARN = "WARN";
    public static final String ERROR = "ERROR";

    public enum levelDebug {
        DEBUG("\u001B[34m"),
        INFO("\u001B[0m"),
        WARN("\u001B[31m"),
        ERROR("\u001B[31m");

        private String color;

        levelDebug(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

    }

    public static void startLogging(String action, String massage) {
        switch (action) {
            case "DEBUG":
                System.out.println(levelDebug.DEBUG.getColor() + DEBUG + " : " + massage);
                break;
            case "INFO":
                System.out.println(levelDebug.INFO.getColor() + INFO + " : " + massage);
                break;
            case "WARN":
                System.out.println(levelDebug.WARN.getColor() + WARN + " : " + massage);
                break;
            case "ERROR":
                System.out.println(levelDebug.ERROR.getColor() + ERROR + " : " + massage);
                break;
            default:
                System.out.println(massage);
        }
    }

    public static void main(String[] args) {
        startLogging(DEBUG, "DEBUG massage");
        startLogging(INFO, "INFO massage");
        startLogging(WARN, "WARN massage");
        startLogging(ERROR, "ERROR massage");
    }
}