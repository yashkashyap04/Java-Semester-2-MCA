public class Player {
    private String username;
    private char color;

    public Player () {
        username = "";
        color = 'X';
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public void setColor (char color) {
        this.color = color;
    }

    public String getUsername () {
        return this.username;
    }

    public char getColor () {
        return this.color;
    }
}
