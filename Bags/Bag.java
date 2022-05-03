import java.util.*;

class Bag {
    private ArrayList<Book> books;
    private int num_books;

    public Bag() {
        int num_books = 0;
    }

    public Bag(ArrayList<Book> books, int num_books) {
        this.num_books = num_books;
        this.books = books;
    }

    public ArrayList<Book> getBooksWithWord(String word) {
        ArrayList<Book> books = new ArrayList<Book>();
        for (int idx = 0; idx < num_books; idx++) {
            if (this.books.get(idx).isWordPresent(word)) {
                books.add(this.books.get(idx));
            }
        }
        return books;
    }

    public Book getBookWithMaxOccurence(String word) {
        Book book = new Book();
        int max = 0;
        for (int idx = 0; idx < num_books; idx++) {
            if (this.books.get(idx).getWordCount(word) > max) {
                book = this.books.get(idx);
                max = this.books.get(idx).getWordCount(word);
            }
        }
        return book;
    }
}