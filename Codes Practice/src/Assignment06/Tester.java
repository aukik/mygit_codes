public class Tester {
    public static void main(String[] args) {
        Anime a1=new Anime();
        a1.setName("Ore Gairu");
        a1.setGenre("slice of life,comedy");
        a1.setEpisodes(49);
        a1.setSeasons(2);
        a1.setRating(9);
        System.out.println(a1);
        a1.anime_completed();
        Movie m1=new Movie();
        m1.setName("Shutter Island");
        m1.finished();
        Media m=new Media();
        System.out.println(m);


    }
}
