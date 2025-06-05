
import java.util.ArrayList;
import org.w3c.dom.Node;


public class Nodo{
    int distance;
    Node previous;
    String name;
    ArrayList<Arc> neighbours;

    public Node(String name){
        this.name=name;
        distance = Integer.MAX_VALUE;
        previou=null;
        neighbours=new ArrayList<>();
    }
    public int getDistance() {

        return distance;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nodo{");
        sb.append("distance=").append(distance);
        sb.append(", previous=").append(previous);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
    




}