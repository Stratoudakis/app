package group54.BookCatalogService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController{

private List<Author> authors = new ArrayList<>();

@PostMapping
public void addNewAuthor(@RequestBody Author author){

    authors.add(author);

}

@GetMapping("/{authorID}")
public ResponseEntity<Author> getAuthorByID(@PathVariable int authorID){

    for(Author author:authors){

        if(author.getId()==authorID){
            return ResponseEntity.ok(author);
        }

    }

    return ResponseEntity.notFound().build();


}

@PutMapping("/{authorID}")
public void updateAuthor(@RequestBody Author author, @PathVariable int authorID){

    for(Author newAuthor:authors){

        if(newAuthor.getId()==authorID){
            newAuthor.setName(author.getName());
            newAuthor.setId(authorID);
            break;
        }

    }
}

@DeleteMapping("/{authorID}")
public ResponseEntity<Void> deleteAuthor(@PathVariable int authorID){

    for(Author author:authors){

        if(author.getId()==authorID){
            authors.remove(author);
            return ResponseEntity.ok().build();
        }

    }
    return ResponseEntity.notFound().build();
}

}


