public class Player {
    private String username;
    private String color;

    public Player () {
        username = "";
        color = "";
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public String getUsername () {
        return this.username;
    }

    public String getColor () {
        return this.color;
    }
}
