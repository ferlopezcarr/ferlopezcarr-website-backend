package ferlopezcarr.websitebackend.core.validators;

import ferlopezcarr.websitebackend.core.application.exceptions.string.EmptyStringException;
import ferlopezcarr.websitebackend.core.application.exceptions.string.MaxLengthStringException;
import ferlopezcarr.websitebackend.core.application.exceptions.string.MinLengthStringException;

public class StringValidator {

    public static String isEmpty(String value) {
        if(value == null || value.isEmpty()) {
            throw new EmptyStringException();
        }
        return value;
    }

    public static String minLength(String value, int minLength) {
        if(value == null || value.length() < minLength) {
            throw new MinLengthStringException();
        }
        return value;
    }

    public static String maxLength(String value, int maxLength) {
        if(value == null || value.length() > maxLength) {
            throw new MaxLengthStringException();
        }
        return value;
    }

}
