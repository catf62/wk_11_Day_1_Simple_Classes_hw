public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int drinkTen() {
        if (this.volume >= 10) {
            this.volume -= 10;
        }
        else {
            this.volume = 0;
        }
        return this.volume;
    }

    public int emptyBottle() {
        this.volume = 0;
        return this.volume;
    }

    public int fillBottle() {
        this.volume = 100;
        return this.volume;
    }

}
