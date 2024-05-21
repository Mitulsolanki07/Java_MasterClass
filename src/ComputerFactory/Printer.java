package ComputerFactory;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerLevel) {
        int tonerAmount = tonerLevel + this.tonerLevel;
        if ((tonerAmount > 100) && (tonerAmount < 0)) {
            return -1;
        }
        this.tonerLevel = tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (this.duplex ? ((pages / 2) + (pages % 2)) : pages);
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
