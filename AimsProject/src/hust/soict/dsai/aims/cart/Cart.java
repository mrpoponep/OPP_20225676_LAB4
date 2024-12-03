package AimsProject.src.hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import AimsProject.src.hust.soict.dsai.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); 

    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("The media \"" + media.getTitle() + "\" has been added.");
    }

    public void addMedia(Media[] medias) {
        for (Media media : medias) {
            itemsOrdered.add(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been added.");
        }
    }
    

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been removed.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" was not found in the cart.");
        }
    }

    public void searchMedia(int id) {
        ArrayList<Media> matchingMedia = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                matchingMedia.add(media);
            }
        }
        if (matchingMedia.isEmpty()) {
            System.out.println("No media found with id: \"" + id + "\"");
        } else {
            System.out.println("Matching media:");
            for (Media media : matchingMedia) {
                System.out.println(media);
            }
        }
    }

    public void searchMedia(String title) {
        ArrayList<Media> matchingMedia = new ArrayList<>();
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                matchingMedia.add(media);
            }
        }
        if (matchingMedia.isEmpty()) {
            System.out.println("No media found with title: \"" + title + "\"");
        } else {
            System.out.println("Matching media:");
            for (Media media : matchingMedia) {
                System.out.println(media);
            }
        }
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        double totalCost = 0.0;
        int index = 1;

        for (Media media : itemsOrdered) {
            System.out.println(index + ". " + media.toString());
            totalCost += media.getCost();
            index++;
        }

        System.out.println("\nTotal cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
}
