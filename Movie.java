public class Movie implements ContentActions {

    private String title;

    public Movie(java.lang.String title) {
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
        return "Play movie: "+ title;
    }
    @java.lang.Override
    public java.lang.String pauseContent() {
        return "Pausing movie: " +title;
    }
    @java.lang.Override
    public java.lang.String stopContent() {
        return "Stopping the movie: " + title;
    }
}


