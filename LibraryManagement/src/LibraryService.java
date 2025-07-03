import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private List<Book> bookList =new ArrayList<>();

    public LibraryService(){
        bookList.add(new Book("Java","Raushan",1001,100));
        bookList.add(new Book("Python","Abhishek",1002,90));
        bookList.add(new Book("HTML","Aditya",1003,80));
        bookList.add(new Book("JavaScript","Ravindra",1004,10));
        bookList.add(new Book("PHP","Rahul",1005,30));
        bookList.add(new Book("C++","Manisha",1006,50));
    }

    public List<Book> searchBook( String bookTitle,String author) {
        List<Book> res = new ArrayList<>();
        for (Book book:bookList) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle) && book.getAuthor().equalsIgnoreCase(author)) {
                res.add(book);
            }
        }
        return res;
    }

    public Book borrowBook(String bookTitle, String author , int bookCount) {
        for (Book book:bookList)
        {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle) &&book.getAuthor().equalsIgnoreCase(author))
            {
                if (book.borrowBook(bookCount))
                {
                    return book;
                }
                else {
                    System.out.println("No enough Book Available");
                    return null;
                }
            }
        }
        System.out.println("This type of BookTitle "+bookTitle+" and Author "+author+" Book is not Available");
        return null;
    }

    public boolean returnBook(String bookTitle,String author,int bookCount ) {
        for (Book book:bookList)
        {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle) &&book.getAuthor().equalsIgnoreCase(author))
            {
                bookList.add(book);
                book.returnBook(bookCount);
                System.out.println("Your Book is return successfully,Please leave reviews");
                return true;
            }
        }
        System.out.println("Please give return Right Book");
        return false;
    }

    public void listAllBook() {
        System.out.println("List of All books:");
        for (Book book:bookList) {
            System.out.println(book);
        }
    }


}
