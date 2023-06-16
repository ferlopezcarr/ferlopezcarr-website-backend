package ferlopezcarr.websitebackend.core.application.exceptions.string;

public class MaxLengthStringException extends RuntimeException {
    public MaxLengthStringException() {
        super("String is longer than allowed");
    }
}
