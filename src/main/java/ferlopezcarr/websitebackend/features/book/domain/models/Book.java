package ferlopezcarr.websitebackend.features.book.domain.models;

public class Book {

    private BookId id;
    private BookTitle title;
    private Author author;
    private BookDescription description;
    private String imageUrl;
    private Double rating;

    public Book(BookId id, BookTitle title, Author author, BookDescription description, String imageUrl, Double rating) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.imageUrl = imageUrl;
        this.rating = rating;
    }

    public BookId getId() {
        return id;
    }

    public BookTitle getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public BookDescription getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Double getRating() {
        return rating;
    }
}
