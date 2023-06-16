package ferlopezcarr.websitebackend.core.validators;

import ferlopezcarr.websitebackend.core.application.exceptions.NullParameterException;

public class NullValidator {

    public static Object isNull(Object value) {
        if(value == null)
            throw new NullParameterException();
        return value;
    }

}
