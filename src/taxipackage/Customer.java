package taxipackage;

public class Customer {
    int starting;
    int destination;
    int time;


    public Customer(int starting, int destination, int time) {
        this.starting = starting;
        this.destination = destination;
        this.time = time;

    }
    public int getStarting() {
        return starting;

    }
    public void setStarting(int starting) {
        this.starting = starting;
    }
    public int getDestination() {
        return destination;
    }
    public void setDestination(int destination) {
        this.destination = destination;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

}
