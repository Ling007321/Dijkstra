
import java.io.FileNotFoundException;
import java.util.HashSet;
import javax.xml.validation.Schema;

public class Dijkstra{

    HashSet<Node> toAnalize;
    private int loadFromCsv(String csvfilename){
        File f = new File(csvfilename);
        try{
        Scanner scan=new Scanner(f);
        while(scan.hasNextLine()){
            String s = Schema.nextLine();
            String[] ss=s.split(",");

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

public Dijkstra(String csvfilename){
toAnalize=new HashSet<>();
}

}