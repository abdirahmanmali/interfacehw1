public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        Movie movie = new Movie("friday");
        Game game = new Game("grandtheft auto");
        //

        // tessing methods

        System.out.println(movie.playContent());
        System.out.println(movie.pauseContent());
        System.out.println(movie.stopContent());
        System.out.println(game.playContent());
        System.out.println(game.pauseContent());
        System.out.println(game.stopContent());


    }
}