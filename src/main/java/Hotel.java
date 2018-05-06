import java.util.ArrayList;

public class Hotel {
    private ArrayList<Guest> bedroom;
    private ArrayList<Guest> conference;


    public Hotel() {
        this.bedroom = new ArrayList<>();
        this.conference = new ArrayList<>();
    }

    public int bedroomCount(){
        return bedroom.size();
    }

    public int conferenceCount(){
        return conference.size();
    }

}
