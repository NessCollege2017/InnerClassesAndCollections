package ness.edu.innerclassesandcollections;

/**
 * Created by Android2017 on 5/23/2017.
 */

//Class in a class
public class House {
    private String address;
    //No room without a house.
    //A Room Always knows the house it's in. (IE A Reference).

    public House(String address) {
        this.address = address;
    }
    public class Room{
        private double width;
        private double height;

        public Room(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public String toString() {
            return "Room: Width: " + width +
                   " Height: " + height +
                   " Address: " + address;
        }
    }
}
