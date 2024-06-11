package laboratorki2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public static class Library {
        private List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(Book book) {
            books.remove(book);
        }

        public void displayBooks() {
            System.out.println("Книги в библиотеке:");
            for (Book book : books) {
                System.out.println("Название: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Книга 1", "Автор 1", "12345");
        Book book2 = new Book("Книга 2", "Автор 2", "54321");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Книги добавлены в библиотеку:");
        library.displayBooks();

        library.removeBook(book1);
        System.out.println("\nПосле удаления книги:");
        library.displayBooks();
    }
}
