import java.util.ArrayList;

public class MovieCollectionRunner
{
    public static void main(String arg[])
    {
        MovieCollection myCollection = new MovieCollection("src/movies_data.csv");
//        System.out.println(myCollection.getAllActors());
        myCollection.menu();
    }
}
