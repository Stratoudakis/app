package group54.BookCatalogService;

public class Author {
    private int id;
    private String name;

    Author(int id,String name){

        this.id=id;
        this.name =name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
