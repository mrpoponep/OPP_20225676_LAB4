package AimsProject.src.hust.soict.dsai.aims;
import AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Action", "Movie 1", 15.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Comedy", "Movie 2", 12.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Comedy", "Movie 3", 1.11);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);

        System.out.println("");

        cart.removeMedia(dvd1);
        cart.displayCart();

        cart.findMediaByTitle("Movie 2");
    }
}
