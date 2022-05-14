import java.io.Serializable;

public class Page implements Serializable {
    private String pageContent;
    
    Page(String s){
        pageContent = s;
    }
    
    boolean isOccurs(String key){
        return pageContent.contains(key);
    }
    
    int noOccurrences(String key){
        String[] words = pageContent.split(" ");
        int count = 0;
        for (int i=0;i<words.length;i++){
            if (words[i].equalsIgnoreCase(key)){
                count++;
            }
        }
        return count;
    }
}
