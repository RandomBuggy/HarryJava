class Library {
    private int num_of_books;
    private String[] books;

    Library() {
        this.books = new String[100];
        this.num_of_books = 0;
    }

    public void addBook(String book) {
        this.books[num_of_books] = book;
        this.num_of_books++;
        System.out.println(book + " has been added");
    }

    public void showAvailableBooks() {
        for (String book : this.books) {
            if (book == null) {
                continue;
            }

            System.out.println("Available Books are : " + book);
        }
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                this.books[i] = null;
                System.out.println("This book has been issued!!");
                return;
            }
        }
        System.out.println("This book does not exists.");
    }
    public void returnBook(String book) {
        addBook(book);
    }
}

public class exer_4_sol {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Python 3 Language");
        library.addBook("The c++ Journey");
        library.addBook("The C Programming Language");
        library.addBook("JavaScript : A Modern Approach");
        library.addBook("RDBMS with MySQL");
        library.showAvailableBooks();
        // library.issueBook("Random");
        library.issueBook("JavaScript : A Modern Approach");
        library.showAvailableBooks();
        library.returnBook("JavaScript : A Modern Approach");
        library.showAvailableBooks();
    }
}

