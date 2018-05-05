public class Bedroom extends Room {

    private BedroomType bedroom;

    public Bedroom(int rate, BedroomType bedroom) {
        super(rate);
        this.bedroom = bedroom;
    }

    public BedroomType getBedroom() {
        return bedroom;
    }





}
