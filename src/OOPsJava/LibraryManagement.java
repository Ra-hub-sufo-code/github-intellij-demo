package OOPsJava;

public class LibraryManagement {
    private String bookAuthor;
    private String bookId;
    private boolean ret;

    public LibraryManagement(String bookAuthor, String bookId) {
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
    }

    public void borrowBook (String bookAuthor) {
        if ( this.bookAuthor.equals(bookAuthor)) {
            if ( !ret ) {
                System.out.println("Take book enjoy");
                ret = true;
            }
            else {
                System.out.println("This book is already borrowed");
            }
        }
        else {
            System.out.println("This type of Author book not Available");
       }
    }
    public void returnBook ( String bookAuthor ) {
        if (this.bookAuthor.equals(bookAuthor)) {
           if (ret) {
               System.out.println("Hopefully you enjoyed this book,Leave the review");
               ret = false;
           }
           else {
               System.out.println("This book is already return");
           }
        }
        else {
           System.out.println("Please give me right Author book");
       }
    }
}
