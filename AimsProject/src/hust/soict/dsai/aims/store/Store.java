package AimsProject.src.hust.soict.dsai.aims.store;

import java.util.ArrayList;
import AimsProject.src.hust.soict.dsai.aims.media.Media;
import java.util.List;

public class Store {
    private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("Media added to the store: " + media.getTitle());
        } else {
            System.out.println("Media already exists in the store: " + media.getTitle());
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media removed from the store: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store: " + media.getTitle());
        }
    }

    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        System.out.println("No media found with the title: " + title);
        return null;
    }

    public void displayStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in the store:");
            for (Media media : itemsInStore) {
                System.out.println(media.toString());
            }
        }
    }
    
    public List<Media> getMediaList() {
        return new ArrayList<>(itemsInStore);  // Return a copy of the list
    }
}