public class Movie extends Media {
    public static int movies_watched=0;

    public void remove() {
        movies_watched--;
        super.movies_watched--;
    }
    public void finished(){
        movies_watched++;
        super.movies_watched++;
        finished="Yes Finished";
    }

    public String toString(){
        return "==================\nThis is a Movie"+"\nName: "+this.name+"\nGenre: "+genre+"\nRating: "+rating+"\n==================";
    }
}
