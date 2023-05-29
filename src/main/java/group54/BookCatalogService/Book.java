package group54.BookCatalogService;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    
    private String title;
    private String publicationDate;
    private String author;
    private int id;
    private int quantity;

    @JsonCreator
    Book(@JsonProperty("title") String title,@JsonProperty("publicationDate") String publicationDate,@JsonProperty("author") String author, @JsonProperty("id") int id, @JsonProperty("quantity") int quantity){

        this.title = title;
        this.publicationDate = publicationDate;
        this.author = author;
        this.id = id;
        this.quantity = quantity;

    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
