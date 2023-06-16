package ferlopezcarr.websitebackend.features.book.domain.models;

import ferlopezcarr.websitebackend.core.validators.NullValidator;
import ferlopezcarr.websitebackend.core.validators.StringValidator;

public class Author {

    private static final int MAX_LENGTH = 100;

    private String author;

    public Author(String id) {
        this.author = StringValidator.maxLength(StringValidator.isEmpty((String) NullValidator.isNull(id)), MAX_LENGTH);
    }

    public String getTitle() {
        return author;
    }
}