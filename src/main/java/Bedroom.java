public class Bedroom extends Room {

    private BedroomType bedroom;

    public Bedroom(BedroomType bedroom){
        this.bedroom = bedroom;
    }

    public BedroomType getBedroom() {
        return bedroom;
    }
}
