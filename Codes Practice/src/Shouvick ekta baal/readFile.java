import java.util.Scanner;
import java.io.*;
public class readFile  {
    private Scanner sc;
    public static int count=1;

    public static Media M[];


    public void openFile(){

        try{
            sc=new Scanner(new File("C:\\Users\\Aukik\\IdeaProjects\\Anime List\\src\\AnimeList.txt"));
        }
        catch(Exception e) {
            System.out.println("could not find file");
        }
    }
    public void readFile(){

         Media a=new Anime();

         while (sc.hasNext()){
             a.setName(sc.next());
             a.setRating(sc.nextInt());
             a.setSeasons(sc.nextInt());
             a.setEpisodes(sc.nextInt());
             a.setGenre(sc.next());
             a.setGot_aired(sc.next());

         }
         M=new Anime[500];
         M[count]=a;
         count++;
    }

    public void closeFile(){
        sc.close();

    }

    public void openFile2(){

        try{
            sc=new Scanner(new File("C:\\Users\\Aukik\\IdeaProjects\\Anime List\\src\\MovieList.txt"));
        }
        catch(Exception e) {
            System.out.println("could not find file");
        }

    }
    public void readFile2(){

        Media m=new Movie();

        while (sc.hasNext()){
            m.setName(sc.next());
            m.setRating(sc.nextInt());
            m.setGenre(sc.next());
            m.setGot_aired(sc.next());
        }
        M=new Movie[500];
        M[count]=m;
        count++;
    }

    public void closeFile2(){

        sc.close();

    }



    public void openFile3(){

        try{
            sc=new Scanner(new File("C:\\Users\\Aukik\\IdeaProjects\\Anime List\\src\\SeriesList.txt"));
        }
        catch(Exception e) {
            System.out.println("could not find file");
        }
    }
    public void readFile3(){


        Media s=new Series();

        while (sc.hasNext()){
            s.setName(sc.next());
            s.setRating(sc.nextInt());
            s.setGenre(sc.next());
            s.setGot_aired(sc.next());
        }
        M=new Series[500];
        M[count]=s;
        count++;
    }
    public void closeFile3(){
        sc.close();

    }
   public void getDetails(int a){
       System.out.println(M[a]);
   }

}
