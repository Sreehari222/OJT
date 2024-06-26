 public class book {


    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
     
        book book1 = new book("1234567890", "ram care of anandhi", "hari");
       
        book1.displayDetails();

        book1.borrowBook();
        book1.displayDetails();

        book1.borrowBook();
     
        book1.returnBook();
        book1.displayDetails();
    
        book1.returnBook();
    }
}

