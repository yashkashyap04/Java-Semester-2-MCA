import java.io.*;

public class SaveLoadBook {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        // WRITING OBJECT TO FILE
        ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream("OData.txt"));
        
        String pageData[] = {"Page 1", "Page 2", "Page3"};
        Book writeBook = new Book(pageData, "Some author", "Some title");
        oStream.writeObject(writeBook);
        
        oStream.close();

        // READING OBJECT FROM FILE
        ObjectInputStream iStream = new ObjectInputStream(new FileInputStream("OData.txt"));
        
        Book readBook = (Book) iStream.readObject();
        readBook.display();
        
        iStream.close();
    }
}