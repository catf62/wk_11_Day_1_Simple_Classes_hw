public class Printer {
    private int numberOfSheets;
    private int tonerVolume;

    public Printer(int numberOfSheets, int tonerVolume){
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public String printMethod(int pages, int copies) {
        int requiredSheets = pages * copies;
        if (this.numberOfSheets >= requiredSheets && this.tonerVolume >= requiredSheets) {
            this.numberOfSheets -= requiredSheets;
            this.tonerVolume -= requiredSheets;
            return "Sufficient paper and toner available, there are "+this.numberOfSheets+" sheets of paper remaining and the toner volume is "+this.tonerVolume;
        }
        else if (this.numberOfSheets >= requiredSheets && this.tonerVolume < requiredSheets) {
            return "Insufficient Toner Available";
        }
        else if (this.numberOfSheets < requiredSheets && this.tonerVolume >= requiredSheets) {
            return "Insufficient Paper Available";
        }
        else {
            return "Insufficient Paper and Toner Available";
        }
    }

    public int refillPaper() {
        this.numberOfSheets = 500;
        return this.numberOfSheets;
    }

    public int refillToner() {
        this.tonerVolume = 10000;
        return this.tonerVolume;
    }
}
