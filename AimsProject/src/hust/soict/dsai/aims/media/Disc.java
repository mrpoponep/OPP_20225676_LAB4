package AimsProject.src.hust.soict.dsai.aims.media;


public class Disc extends Media {
    private int length;        
    private String director;   

    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Disc [length=" + length + ", director=" + director + ", getId()=" + getId() + ", getLength()="
                + getLength() + ", getTitle()=" + getTitle() + ", getDirector()=" + getDirector() + ", getCategory()="
                + getCategory() + ", getCost()=" + getCost() + "]";
    }

    public Disc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
