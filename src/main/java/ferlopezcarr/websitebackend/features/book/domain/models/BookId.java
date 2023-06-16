package ferlopezcarr.websitebackend.features.book.domain.models;

import ferlopezcarr.websitebackend.core.validators.NullValidator;
import ferlopezcarr.websitebackend.core.validators.StringValidator;

public class BookId {

    private static final int MAX_LENGTH = 36;

    private String id;

    public BookId(String id) {
        this.id = StringValidator.maxLength(StringValidator.isEmpty((String) NullValidator.isNull(id)), MAX_LENGTH);
    }

    public String getId() {
        return id;
    }
}
