package ferlopezcarr.websitebackend.features.book.domain.models;

import ferlopezcarr.websitebackend.core.validators.NullValidator;
import ferlopezcarr.websitebackend.core.validators.StringValidator;

public class BookTitle {

    private static final int MAX_LENGTH = 100;

    private String title;

    public BookTitle(String id) {
        this.title = StringValidator.maxLength(StringValidator.isEmpty((String) NullValidator.isNull(id)), MAX_LENGTH);
    }

    public String getTitle() {
        return title;
    }
}

