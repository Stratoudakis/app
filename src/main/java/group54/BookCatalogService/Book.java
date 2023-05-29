package group54.BookCatalogService;

public class Book {
    
    private String title;
    private String publicationDate;
    private Author author;
    private int id;

    Book(String title, String publicationDate, Author author, int id){

        this.title = title;
        this.publicationDate = publicationDate;
        this.author = author;
        this.id = id;

    }

    public Author getAuthor() {
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

    public void setAuthor(Author author) {
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
}
