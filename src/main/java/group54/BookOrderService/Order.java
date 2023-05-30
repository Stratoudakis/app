package group54.BookOrderService;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    private int bookID;
    private int quantity;
    private LocalDate date;

    Order(@JsonProperty("bookID") int bookID,@JsonProperty("quantity") int quantity,@JsonProperty("date") LocalDate date){

        this.bookID = bookID;
        this.quantity = quantity;
        this.date = date;

    }
    
    public int getBookID() {
        return bookID;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
