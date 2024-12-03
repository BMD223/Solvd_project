public class Venue implements Namable{
    int capacity;
    String name;
    String city;

    public Venue(String name, int capacity,String location) {
        this.name = name;
        this.capacity = capacity;
        city=location;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
