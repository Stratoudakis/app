package group54.BookCatalogService;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Author {
    private int id;
    private String name;
    
    @JsonCreator
    Author(@JsonProperty("id") int id, @JsonProperty("nmae") String name){

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
