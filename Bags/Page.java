import java.util.*;

class Page {
    private String text;

    public Page() {
        this.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    }

    public Page(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public boolean isWordPresent(String word) {
        if (this.text.contains(word)) 
            return true;
        return false;
    }

    public int getWordCount(String word) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = this.text.indexOf(word, lastIndex);

            if(lastIndex != -1) {
                count++;
                lastIndex += word.length();
            }
        }
        // System.out.println(count);
        return count;
    }
}