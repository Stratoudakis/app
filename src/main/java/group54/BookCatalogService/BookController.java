package group54.BookCatalogService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController{

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
public Book getBookByID(@PathVariable int bookID){

    for(Book book:books){

        if(book.getId()==bookID){
            return book;
        }

    }

    return null;


}

@PutMapping("/{bookID}")
public void updateBook(@RequestBody Book book,@PathVariable  int bookID){

    for(Book newBook:books){

        if(newBook.getId()==bookID){
            newBook.setTitle(book.getTitle());
            newBook.setAuthor(book.getAuthor());
            newBook.setId(bookID);
            newBook.setPublicationDate(book.getPublicationDate());
            break;
        }

    }

}

@DeleteMapping("/{bookID}")
public void deleteBook(@PathVariable int bookID){

    for(Book book:books){

        if(book.getId()==bookID){
            books.remove(book);
        }

    }
}

}
