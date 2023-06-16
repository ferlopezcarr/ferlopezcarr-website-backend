package ferlopezcarr.websitebackend.core.application.exceptions;

public class NullParameterException extends RuntimeException {
    public NullParameterException() {
        super("Parameter is null");
    }
}
