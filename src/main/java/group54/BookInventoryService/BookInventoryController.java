package group54.BookInventoryService;

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

import group54.BookCatalogService.Book;

@RestController
@RequestMapping("/books")
public class BookInventoryController {

private List<Book> books = new ArrayList<Book>();

@GetMapping
public List<Book> getAllBooks(){

    return books;

}

@PostMapping
public void addNewBook(@RequestBody Book book){

    books.add(book);

}

@GetMapping("/{bookID}")
public ResponseEntity<Book> getBookByID(@PathVariable int bookID){

    for(Book book:books){

        if(book.getId()==bookID){
            return ResponseEntity.ok(book);
        }

    }

    return null;


}

@PutMapping("/{bookID}")
public  ResponseEntity<Void> updateBook(@RequestBody Book book,@PathVariable  int bookID){

    for(Book newBook:books){

        if(newBook.getId()==bookID){
            newBook.setTitle(book.getTitle());
            newBook.setAuthor(book.getAuthor());
            newBook.setId(bookID);
            newBook.setPublicationDate(book.getPublicationDate());
            newBook.setQuantity(book.getQuantity());
            return ResponseEntity.ok().build();
        }

    }

    return ResponseEntity.notFound().build();

}

@DeleteMapping("/{bookID}")
public  ResponseEntity<Void> deleteBook(@PathVariable int bookID){

    for(Book book:books){

        if(book.getId()==bookID){
            books.remove(book);
            return ResponseEntity.ok().build();
        }

    }

    return ResponseEntity.notFound().build();
}

@PutMapping("/{bookID}/quantity")
public ResponseEntity<Void> updateBookQuantity(int bookID, int quantity){

    for(Book book:books){

        if(book.getId()==bookID){
        book.setQuantity(quantity);
        return ResponseEntity.ok().build();
        }

    }

    return ResponseEntity.notFound().build();

}



}
