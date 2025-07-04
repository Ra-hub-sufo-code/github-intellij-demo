import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class LibraryService {
    private List<Book> bookList =new ArrayList<>();
    private Map<Member,Integer> memberBookMap =new HashMap<>();

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

    public Book borrowBook(Member member,String memberName,String bookTitle, String author , int bookCount) {
        if (MemberService.memberMap.containsKey(memberName)) {
            for (Book book:bookList)
            {
                if (book.getBookTitle().equalsIgnoreCase(bookTitle) &&book.getAuthor().equalsIgnoreCase(author))
                {
                    //check
                    if (book.borrowBook(bookCount))
                    {
                        memberBookMap.put(member,bookCount);
                        System.out.println("Enjoy Book");
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
        System.out.println("Member not Found!");
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
        System.out.println("Please return Right Book");
        return false;
    }

    public void listAllBooks() {
        System.out.println("List of All books:");
        for (Book book:bookList) {
            System.out.println(book);
        }
    }

    public void viewMyBooks(Member member) {
        if (memberBookMap.containsKey(member)){
            System.out.println("Your all Books:");
            System.out.println(memberBookMap.get(member));
            return;
        }
        System.out.println("Member not Found");
    }

}
