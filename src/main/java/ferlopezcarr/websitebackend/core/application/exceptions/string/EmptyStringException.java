package ferlopezcarr.websitebackend.core.application.exceptions.string;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException() {
        super("String is empty");
    }
}
