public class Book {
    private String bookTitle;
    private String author;
    private int bookId;
    private int totalBook;
    private int availableBook;

    public Book(String bookTitle, String author, int bookId, int totalBook) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.bookId = bookId;
        this.totalBook = totalBook;
        this.availableBook = totalBook;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }

    public int getAvailableBook() {
        return availableBook;
    }

    public void setAvailableBook(int availableBook) {
        this.availableBook = availableBook;
    }

    @Override
    public String toString() {
        return bookTitle+" | "+" Author Name: "+author+" | "+" Book ID: "+bookId+
                " | "+" Total Number of Book: "+totalBook+" | "+" Available Book: "+availableBook;
    }

    public boolean borrowBook(int count ) {
        if (count <= availableBook) {
            availableBook -= count;
            return true;
        }
        return false;
    }

    public void returnBook( int count ) {
        availableBook += count;
    }
}
