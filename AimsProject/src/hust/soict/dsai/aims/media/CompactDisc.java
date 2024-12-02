package AimsProject.src.hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "CD - " + (getTitle() != null ? getTitle() : "Unknown Title") + " - "
                + (getCategory() != null ? getCategory() : "Unknown Category") + " - "
                + (getArtist() != null ? getArtist() : "Unknown Artist") + " - "
                + (getDirector() != null ? getDirector() : "Unknown Director") + " - "
                + (getLength() > 0 ? getLength() + " mins" : "Unknown Length") + ": "
                + getCost() + " $";
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track added successfully.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed successfully.");
        } else {
            System.out.println("Track not found in the CD.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}


