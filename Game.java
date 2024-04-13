public class Game implements ContentActions{
    private String title;
    public Game(java.lang.String title) {
        this.title = title;
    }
    public java.lang.String getTitle() {
        return title;
    }
    public void setTitle(java.lang.String title) {
        this.title = title;
    }
    @java.lang.Override
    public java.lang.String playContent() {
        return "Playing the game:"+ title;
    }
    @java.lang.Override
    public java.lang.String pauseContent() {
        return "Pausing the game:" +title;
    }
    @java.lang.Override
    public java.lang.String stopContent() {
        return "Stopping the game:" +title;
    }
}