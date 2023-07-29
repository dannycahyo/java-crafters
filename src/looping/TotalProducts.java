package looping;

public class TotalProducts {
    public static void main(String[] args) {
        int[] products = { 5, 4, 3, 210, 1 };

        int total = 0;

        for (int i = 0; i < products.length; i++) {
            total += products[i];
        }

        System.out.println("Total: " + total);
    }
}