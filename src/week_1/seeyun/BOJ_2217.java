package week_1.seeyun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_2217 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        Collections.sort(list, Collections.reverseOrder());

        int max = list.get(0);

        // 1등 로프 맥스냐, 아니면 한계를 고려한 w/k 냐, w = limit * k(갯수)

        for (int i = 1; i < list.size(); i++) {
            int maxWhenShared = list.get(i) * (i + 1); // w = limit * k(갯수)

            if (max < maxWhenShared) {
                max = maxWhenShared;
            }

        }

        System.out.println(max);

    }
}
