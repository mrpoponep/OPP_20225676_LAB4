package AimsProject.src.hust.soict.dsai.aims.media;

public class Track implements Playable {
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
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength() + " seconds");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Track track = (Track) obj;
        return title != null && title.equals(track.title) && length == track.length;
    }
}
