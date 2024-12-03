package AimsProject.src.hust.soict.dsai.test.store;
import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle", "Adventure", "John Doe", 120, 20.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Fantasy", "Jane Smith", 90, 15.49);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avengers", "Action", "Russo Brothers", 180, 25.00);

        Store store = new Store();

        System.out.println("Testing addDVD method:");
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        System.out.println("\nItems in the store after adding DVDs:");
        store.displayStoreItems();

        System.out.println("\nTesting removeDVD method:");
        store.removeMedia(dvd2);

        System.out.println("\nItems in the store after removing a DVD:");
        store.displayStoreItems();

        System.out.println("\nTesting removeDVD with a non-existent DVD:");
        store.removeMedia(dvd2);
    }
}
