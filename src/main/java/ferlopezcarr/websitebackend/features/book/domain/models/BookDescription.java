package ferlopezcarr.websitebackend.features.book.domain.models;

import ferlopezcarr.websitebackend.core.validators.NullValidator;
import ferlopezcarr.websitebackend.core.validators.StringValidator;

public class BookDescription {

    private static final int MAX_LENGTH = 500;

    private String description;

    public BookDescription(String id) {
        this.description = StringValidator.maxLength(StringValidator.isEmpty((String) NullValidator.isNull(id)), MAX_LENGTH);
    }

    public String getTitle() {
        return description;
    }
}