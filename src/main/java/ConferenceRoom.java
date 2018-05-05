import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private ArrayList<String> rooms;


    public ConferenceRoom(int rate, ArrayList<String> rooms) {
        super(rate);
        this.rooms = rooms;
    }


    public int roomCount(){
        return rooms.size();
    }

    public ArrayList<String> getRooms() {
        return rooms;
    }

    public String getRoomType(){
        return rooms.get(0);
    }

    public int getArraySize(){
        return rooms.size();
    }




}
