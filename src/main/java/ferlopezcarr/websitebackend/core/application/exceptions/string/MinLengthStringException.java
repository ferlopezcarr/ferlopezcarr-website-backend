package ferlopezcarr.websitebackend.core.application.exceptions.string;

public class MinLengthStringException extends RuntimeException {
    public MinLengthStringException() {
        super("String is shorter than allowed");
    }
}
