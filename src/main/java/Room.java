import java.util.ArrayList;

public abstract class Room {

    private int rate;
    private ArrayList<String> room;


    public Room(int rate) {
        this.rate = rate;
        room = new ArrayList<>(2);
    }

    public int getRate() {
        return rate;
    }

    public ArrayList<String> getGuests(){
        return room;
    }



}
