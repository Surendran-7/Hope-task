class Book {
    String title;
    String author;
    

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class borrower extends Book{
    String borrowerName;
    borrower(String title, String author, String borrowerName) {
        super(title, author);
        this.borrowerName = borrowerName;
    }
    void display() {
        super.display();
        System.out.println("Borrower Name: " + borrowerName);
    }
}   
class date extends borrower{
    String dateOfBorrowing;
    date(String title, String author, String borrowerName, String dateOfBorrowing) {
        super(title, author, borrowerName);
        this.dateOfBorrowing = dateOfBorrowing;
    }
    void display() {
        super.display();
        System.out.println("Date of Borrowing: " + dateOfBorrowing);
    }

}
class Genre extends Book {
    String genre;

    Genre(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {

        Book b1 = new Book("C Programming", "Dennis Ritchie");
        
        b1.display();
        Book b2 = new Genre("Harry Potter", "J.K. Rowling", "Fantasy");
        Book b3= new date("The Great Gatsby", "F. Scott Fitzgerald", "Alice", "2023-10-01");
        
        Genre b2 = new Genre("Harry Potter", "J.K. Rowling", "Fantasy");
        System.out.println("---- Genre Book Details ----");
        b2.display();
    }
}
