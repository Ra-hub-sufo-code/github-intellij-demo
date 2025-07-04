import java.util.*;

public class LibraryAPP {
    private final Scanner scanner=new Scanner(System.in);
    private final MemberService memberService=new MemberService();
    private final LibraryService libraryService=new LibraryService();

    public static void main(String[] args) {

        new LibraryAPP().start();
    }

    public void start() {
        while (true) {
            System.out.println("\n.....Welcome to Library.....");
            if (!memberService.isLoggedIn()){
                System.out.println("1. Register:");
                System.out.println("2. Login: ");
                System.out.println("3. Exit: ");
                System.out.print("Enter Choice: ");

                int choice=scanner.nextInt();
                switch (choice){
                    case 1->register();
                    case 2->longin();
                    case 3->exitApp();
                    default -> System.out.println("Invalid Choice");
                }
            }
            else {
                showMemberMenu();
            }
        }
    }

    public void register() {
        System.out.print("Enter member contact: ");
        String contact =scanner.next();
        System.out.print("Enter member Name: ");
        String memberName =scanner.next();
        System.out.print("Enter Member Full Name:");
                        scanner.next();
        String memberFullName=scanner.nextLine();
        memberService.registerMember(memberName,contact,memberFullName);
    }

    public void longin(){
        System.out.print("\nEnter member Name: ");
        String memberName =scanner.next();
        memberService.loginMember(memberName);
    }

    private void exitApp(){
        System.out.println("Thank you for using Library");
        System.exit(0);
    }

    private void showMemberMenu() {
        while (memberService.isLoggedIn()){
            System.out.println("\n.... Member menu.....");
            System.out.println("1. Search Books:");
            System.out.println("2. Borrow Books:");
            System.out.println("3. Return Books:");
            System.out.println("4. View All Books:");
            System.out.println("5. View My Books:");
            System.out.println("6. Logout:");
            System.out.print("Enter your Choice:");

            int choice=scanner.nextInt();
            switch (choice){
                case 1->searchBooks();
                case 2->borrowBooks();
                case 3-> returnBooks();
                case 4->libraryService.listAllBooks();
                case 5->viewMyBooks();
                case 6->memberService.logOutMember();
                default -> System.out.println("Invalid Choice");
            }

        }
    }

    public void searchBooks(){
        System.out.print("Enter the Book Title: ");
        String bookTitle =scanner.next();
        System.out.print("Enter the Book Author: ");
        String bookAuthor=scanner.next();
        List<Book> books=libraryService.searchBook(bookTitle,bookAuthor);
        if (books.isEmpty()){
            System.out.println("No Books Found");
            return;
        }
        System.out.println("Books Found:");
        for (Book book:books) {
            System.out.println(book);
        }

        System.out.println("Do you want to Borrow Books (Yes/No)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes")){
            System.out.print("Enter Member Name:");
            String memberName =scanner.next();
            Member member=memberService.getCurrentMember();
            System.out.println("Enter the numbers of Book Do you want to Borrow: ");
            int count = scanner.nextInt();
            libraryService.borrowBook(member,memberName,bookTitle,bookAuthor,count);
        }
        else {
            System.out.println("Returning to user menu....");
        }
    }

    private void borrowBooks(){
        System.out.print("Enter the Book Title: ");
        String bookTitle =scanner.next();
        System.out.print("Enter the Book Author: ");
        String bookAuthor=scanner.next();
        System.out.print("Enter Member Name: ");
        String memberName =scanner.next();
        Member member=memberService.getCurrentMember();
        System.out.println("Enter the numbers of Book Do you want to Borrow: ");
        int count = scanner.nextInt();
        libraryService.borrowBook(member,memberName,bookTitle,bookAuthor,count);
    }

    private void returnBooks(){
        System.out.print("Enter the Book Title: ");
        String bookTitle =scanner.next();
        System.out.print("Enter the Book Author: ");
        String bookAuthor=scanner.next();
        System.out.println("Enter the numbers of Book Do you want to Return: ");
        int count = scanner.nextInt();
        libraryService.returnBook(bookTitle,bookAuthor,count);
    }

    private void viewMyBooks(){
        Member member=memberService.getCurrentMember();
        libraryService.viewMyBooks(member);
    }
}
