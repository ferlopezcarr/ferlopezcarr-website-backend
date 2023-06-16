package ferlopezcarr.websitebackend.features.book.infraestructure.drivers.models;

public class BookApiDTO {
    private String id;
    private String title;
    private String author;
    private String description;
    private String imageUrl;
    private Double rating;

    public BookApiDTO() {
    }

    public BookApiDTO(String title, String author, String description, String imageUrl, Double rating) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.imageUrl = imageUrl;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getRating() {
        return rating;
    }
}
