public class Printer {

    private int paperLvl;
    private int tonerLvl;

    public Printer(int paperLvl, int tonerLvl) {
        this.paperLvl = paperLvl;
        this.tonerLvl = tonerLvl;
    }

    public int paperLeft() {
        return this.paperLvl;
    }

    public int tonerLeft() {
        return this.tonerLvl;
    }

    public void print(int pages, int copies) {

        if (this.paperLvl >= (pages * copies)) {
            this.paperLvl -= (pages * copies);
            this.tonerLvl -= (pages * copies);
        }
    }

    public void refill(int pagesInserted) {

        paperLvl += pagesInserted;
    }

}
