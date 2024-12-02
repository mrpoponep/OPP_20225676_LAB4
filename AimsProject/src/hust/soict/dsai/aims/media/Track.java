package AimsProject.src.hust.soict.dsai.aims.media;

public class Track {
    private String title;  
    private int length;    

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Track: " + (title != null ? title : "Unknown Title") + " - " 
                + (length > 0 ? length + " seconds" : "Unknown Length");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Track track = (Track) obj;
        return length == track.length && (title != null ? title.equals(track.title) : track.title == null);
    }

    @Override
    public int hashCode() {
        int result = (title != null ? title.hashCode() : 0);
        result = 31 * result + length;
        return result;
    }
}
