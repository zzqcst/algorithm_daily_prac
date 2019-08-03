package com.zhi.algorithm;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int people_count = scanner.nextInt();
            HashMap<Integer, Integer> index_score = new HashMap<>();
            PriorityQueue<Integer> score_sort = new PriorityQueue<>();
            for (int i = 0; i < people_count; i++) {
                int score = scanner.nextInt();
                index_score.put(i, score);
                score_sort.add(score);
            }

            HashMap<Integer, Integer> score_front_people = new HashMap<>();
            int front_count = 0;
            while (!score_sort.isEmpty()) {
                score_front_people.put(score_sort.poll(), front_count++);
            }
            int q = scanner.nextInt();
            int[] qs = new int[q];
            for (int i = 0; i < q; i++) {
                qs[i] = scanner.nextInt();
            }
            for (int i = 0; i < q; i++) {
                int x = qs[i];
                int x_scrore = index_score.get(x - 1);
                int people_front = score_front_people.get(x_scrore);
                double res = ((double) people_front / people_count * 100);
                System.out.printf("%.6f\n", res);
            }
        }
    }
}