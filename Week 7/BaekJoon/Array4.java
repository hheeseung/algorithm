package baekjoon;

import java.util.Scanner;
import java.util.HashSet;

public class Array4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(in.nextInt() % 42);
            //입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
        }

        in.close();
        System.out.print(h.size());
    }
}