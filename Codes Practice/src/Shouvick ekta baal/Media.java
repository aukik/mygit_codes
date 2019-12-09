import java.util.Scanner;
public class Media {

    public String name;
    public String got_aired;
    public String genre;
    public int rating;
    public String finished="Not finished";
    public static Media storeData[];

    public static int animes_watched;
    public static int movies_watched;
    public static int series_watched;

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setGot_aired(String got_aired) {
        this.got_aired = got_aired;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setEpisodes(int episodes) {

    }

    public void setSeasons(int seasons) {

    }

    public String getRating() {
        return "Rating: "+rating;
    }

    public String getGenre() {
        return "Genre: "+genre;
    }

    public String getGot_aired() {
        return "Got Aired: "+got_aired;
    }

    public String getName() {
        return "Name: "+name;
    }

   public String toString(){
        return "==================\nAnime completed: "+animes_watched+"\nMovie completed: "+movies_watched+"\nSeries completed: "+series_watched+"\n==================";
   }
}

