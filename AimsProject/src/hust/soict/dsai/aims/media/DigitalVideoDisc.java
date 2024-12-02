package AimsProject.src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    private static int nbDigitalVideoDiscs = 0; // Tracks total DVDs created

    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0); // Initialize in the superclass
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        super(++nbDigitalVideoDiscs, title, category, (float) cost);
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(++nbDigitalVideoDiscs, title, category, (float) cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(++nbDigitalVideoDiscs, title, category, (float) cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isMatch(String title) {
        return getTitle() != null && getTitle().equalsIgnoreCase(title);
    }

    @Override
    public String toString() {
        return "DVD - " + (getTitle() != null ? getTitle() : "Unknown Title") + " - "
                + (getCategory() != null ? getCategory() : "Unknown Category") + " - "
                + (director != null ? director : "Unknown Director") + " - "
                + (length > 0 ? length + " mins" : "Unknown Length") + ": "
                + getCost() + " $";
    }
}
