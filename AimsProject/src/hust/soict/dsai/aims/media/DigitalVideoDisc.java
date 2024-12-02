package AimsProject.src.hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0);
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        super(++nbDigitalVideoDiscs, title, category, (float) cost);
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(++nbDigitalVideoDiscs, title, category, (float) cost);
        setDirector(director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(++nbDigitalVideoDiscs, title, category, (float) cost, length, director);
    }

    public boolean isMatch(String title) {
        return getTitle() != null && getTitle().equalsIgnoreCase(title);
    }
    
    @Override
    public String toString() {
        return "DVD - " + (getTitle() != null ? getTitle() : "Unknown Title") + " - "
                + (getCategory() != null ? getCategory() : "Unknown Category") + " - "
                + (getDirector() != null ? getDirector() : "Unknown Director") + " - "
                + (getLength() > 0 ? getLength() + " mins" : "Unknown Length") + ": "
                + getCost() + " $";
    }
}
