package array_list;

import java.util.ArrayList;
import java.util.List;

public class LotteryTicket {
    public static void main(String[] args) {
        List<Integer> lotteryTicket = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 49 + 1);
            lotteryTicket.add(random);
        }

        for (int number : lotteryTicket) {
            System.out.println(number);
        }
    }
}
