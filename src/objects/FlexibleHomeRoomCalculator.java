package objects;

import java.util.Scanner;

public class FlexibleHomeRoomCalculator {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var calculator = new FlexibleHomeRoomCalculator();
        int totalRoom = 3;

        Rectangle prevRoom = null;
        for (int i = 0; i < totalRoom; i++) {
            System.out.println("Room " + (i + 1) + ":");
            var room = calculator.getRoom();
            if (i == 0) {
                prevRoom = room;
            } else {
                double totalArea = calculator.calculateAreaOfRoom(prevRoom, room);
                System.out.println("The total area of rooms is " + totalArea);
            }
        }
    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of the room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaOfRoom(Rectangle prevRoom, Rectangle currentRoom) {
        return prevRoom.calculateArea() + currentRoom.calculateArea();
    }
}
