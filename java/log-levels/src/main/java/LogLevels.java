import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        int message_index = logLine.indexOf(":");
        String sub = logLine.substring(message_index +1);
        return sub.trim();
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        return logLine.substring(start + 1, end).toLowerCase();
    }

    public static String reformat(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
