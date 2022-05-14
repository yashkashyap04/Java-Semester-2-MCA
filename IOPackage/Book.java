import java.io.Serializable;

public class Book implements Serializable{
    private Page[] myPages = new Page[100];
    private int noPages;
    private String author;
    private String title;
    
    public Book(String[] pageData, String author, String title){
        noPages = pageData.length;
        this.author = author;
        this.title = title;
        
        for (int i=0;i<noPages;i++){
            myPages[i] = new Page(pageData[i]);
        }
    }
    
    public boolean doIHave(String key){
        for (int i=0;i<noPages;i++){
            if (myPages[i].isOccurs(key)){
                return true;
            }
        }
        return false;
    }
    
    public int getCount(String key){
        int myCount = 0;
        for (int i=0;i<noPages;i++){
            myCount+=myPages[i].noOccurrences(key);
        }
        return myCount;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getTitle(){
        return title;
    }

    public void display() {
        System.out.println("Author: " + this.author);
        System.out.println("Title: " + this.title);
        System.out.println("Number of pages: " + this.noPages);
    }
}
