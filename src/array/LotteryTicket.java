package array;

public class LotteryTicket {
    public static void main(String[] args) {
        int[] lotteryTicket = new int[6];

        for (int i = 0; i < lotteryTicket.length; i++) {
            lotteryTicket[i] = (int) (Math.random() * 49 + 1);
        }
        for (int i = 0; i < lotteryTicket.length; i++) {
            System.out.println(lotteryTicket[i]);
        }
    }
}
