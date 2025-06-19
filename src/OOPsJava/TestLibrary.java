package OOPsJava;

public class TestLibrary {
    public static void main(String[] args) {
        LibraryManagement book =new  LibraryManagement("Java book","075fgj");
        book.borrowBook("Raushan");
        book.returnBook("Raushan");
        book.borrowBook("Java book");
        book.borrowBook("Java book");
        book.returnBook("Java book");
        book.returnBook("Java book");
    }
}
