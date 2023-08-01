package data_structure;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> lotteryTicket = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 49 + 1);
            lotteryTicket.add(random);
        }

        for (int number : lotteryTicket) {
            System.out.println(number);
        }

        // Point Free
        lotteryTicket.forEach(System.out::println);

        System.out.println("index of 2:" + lotteryTicket.get(2));
        System.out.println("size of list:" + lotteryTicket.size());
        System.out.println("is empty:" + lotteryTicket.isEmpty());
    }
}
