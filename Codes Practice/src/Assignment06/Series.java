public class Series extends Media {
    public int seasons;
    public int episodes;
    public int episodes_watched=0;
    public int seasons_completed=0;
    public static int series_watched=0;

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getEpisodes() {
        return "No of Episodes: "+episodes;
    }

    public String getSeasons() {
        return "No of Seasons: "+seasons;
    }

    public String getEpisodes_watched() {
        return "Episodes you watched: "+episodes_watched;
    }

    public String getSeasons_completed() {
        return "Seasons you completed: "+seasons_completed;
    }


    public void addEpisode(){
        if(episodes_watched<=episodes) {
            episodes_watched++;

        }
    }

    public void episode_completed(int e){
        episodes_watched=e;

    }
    public void season_completed(int s ){
        seasons_completed=s;
        if(seasons_completed>=seasons){
           series_watched++;
           super.series_watched++;
        }
    }
    public void series_completed(){
        series_watched++;
        super.series_watched++;
        finished="Yes Finished";
    }
    public void remove(){
        series_watched--;
        super.series_watched++;
        finished="Not Finished";
    }
    public String toString(){
        return "==================\nThis is an Series"+"\nName: "+this.name+"\nGenre: "+genre+"\nSeason: "+this.seasons+"\nEpisodes: "+this.episodes+"\nRating: "+rating+"\n==================";

    }

}
