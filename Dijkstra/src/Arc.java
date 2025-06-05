public class Arc{
    Node destination;
    int distance;

    public Arc(Node destination, int distance) {
        this.destination = destination;
        this.distance = distance;
    }
    public void setDestination(Node destination) {
        this.destination = destination;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Arc{");
        sb.append("destination=").append(destination);
        sb.append(", distance=").append(distance);
        sb.append('}');
        return sb.toString();
    }

    

}