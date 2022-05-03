import java.util.*;

class UseBag {
    public static void main(String args[]) {
        
        Book bookA = new Book("Harry Potter", "J K Rowling", 90);
        Book bookB = new Book("The Alchemist", "Paulo Coelho", 70);
        Book bookC = new Book("The Murder on the Orient Express", "Agatha Christie", 100);

        for (int idx = 0; idx < bookA.getNumPages(); idx++)
            bookA.addDefaultPage();
        
        for (int idx = 0; idx < bookB.getNumPages(); idx++)
            bookB.addDefaultPage();
        
        for (int idx = 0; idx < bookC.getNumPages(); idx++)
            bookC.addDefaultPage();

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(bookA);
        books.add(bookB);
        books.add(bookC);

        Page pg = new Page();
        // System.out.println(pg.getWordCount("Lorem"));

        Bag bag = new Bag(books, 3);
        System.out.println("Books with word: Lorem\n");
        for(Book book: bag.getBooksWithWord("Lorem")){
            book.display();
            System.out.println("\n");
        }
        System.out.println("-------------------------------------------");
        System.out.println("Max Occurences of: Lorem\n");
        bag.getBookWithMaxOccurence("Lorem").display();
    }
}