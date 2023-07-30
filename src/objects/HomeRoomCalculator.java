package objects;

public class HomeRoomCalculator {
    public static void main(String[] args) {
        Rectangle bedRoom = new Rectangle();
        bedRoom.setLength(30);
        bedRoom.setWidth(40);

        double bedRoomArea = bedRoom.calculateArea();

        Rectangle bathRoom = new Rectangle(5, 10);
        double bathRoomArea = bathRoom.calculateArea();

        double totalArea = bedRoomArea + bathRoomArea;
        System.out.println("The total area is " + totalArea);
    }
}
