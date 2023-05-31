import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import group54.BookCatalogService.BookController;

class BookControllerTest {

    @Test public void testgetAllBooks(){

    BookController bookController = new BookController();

    List<Book> books = bookController.getAllBooks();

    assertEquals(0,books.size());

    }

    @Test public void testaddNewBooks(){

    BookController bookController = new BookController();

    Book book = new Book("BigBum", "10-6-1999", "BigStra" , 18 , 3);

    bookController.addNewBook(book);

    List<Book> books = bookController.getAllBooks();

    assertEquals(book, books.get(0));

    }

    @Test public void testgetBookByID(){

        BookController bookController = new BookController();
    
        Book book = new Book("BigBum", "10-6-1999", "BigStra" , 18 , 3);

        Book book2 = new Book("BigBum", "10-6-1999", "BigStra" , 29 , 3);
    
        bookController.addNewBook(book);

        bookController.addNewBook(book2);
    
        Book newBook = bookController.getBookByID(29);

    
        assertEquals(book2, newBook);
    
        }


        @Test public void testUpdateBook(){

            BookController bookController = new BookController();
        
            Book book = new Book("BigBum", "10-6-1999", "BigStra" , 18 , 3);
    
            bookController.addNewBook(book);
        
            bookController.updateBook(book, 30);

            Book retrievedBook = bookController.getBookByID(29);
        
            assertEquals(book, retrievedBook);
        
            }


            @Test public void testDeleteBook(){

                BookController bookController = new BookController();
            
                Book book = new Book("BigBum", "10-6-1999", "BigStra" , 18 , 3);
        
                bookController.addNewBook(book);
            
                bookController.deleteBook(18);
    
                Book retrievedBook = bookController.getBookByID(18);
            
                assertNull(retrievedBook);
            
                }

    
}
