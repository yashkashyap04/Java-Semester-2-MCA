import java.util.*;

class Book {
    private String name;
    private String author;
    private int num_pages;
    private ArrayList<Page> pages;

    public Book() {
        this.name = "NA";
        this.author = "NA";
        this.num_pages = 0;
        this.pages = new ArrayList<Page>();
    }

    public Book(String name, String author, int num_pages) {
        this.name = name;
        this.author = author;
        this.num_pages = num_pages;
        this.pages = new ArrayList<Page>();
    }

    public int getNumPages(){
        return num_pages;
    }

    public void addPage(Page page) {
        this.pages.add(page);
    }

    public void addDefaultPage() {
        Page page = new Page();
        this.pages.add(page);
    }

    public boolean isWordPresent(String word) {
        for (int idx = 0; idx < num_pages; idx++) {
            if (this.pages.get(idx).isWordPresent(word))
                return true;
        }
        return false;
    }

    public int getWordCount(String word) {
        int count = 0;
        for (int idx = 0; idx < num_pages; idx++) {
            count += this.pages.get(idx).getWordCount(word);
        }
        // System.out.println(count);
        return count;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
    }
}