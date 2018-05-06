import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private ArrayList<String> rooms;
    private String room;


    public ConferenceRoom(int rate, String room) {
        super(rate);
        this.room = room;
        this.rooms = new ArrayList<>();
        rooms.add("Classroom");
        rooms.add("Boardroom");
        rooms.add("Theater");
    }


    public int roomCount(){
        return rooms.size();
    }

    public ArrayList<String> getRooms() {
        return rooms;
    }

    public String getRoomType(){
        room = rooms.get(0);
        return room;
    }

    public int getArraySize(){
        return rooms.size();
    }




}
