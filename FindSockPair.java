package SockPairAlgo;

import java.util.HashMap;
import java.util.Map;

class findSockPair{

    public static int CountSockPair(int n, int[] ar) {
        Map<Integer, Integer> sockCounts = new HashMap<>();

        // Count the occurrences of each sock color
        for (int sock : ar) {
            sockCounts.put(sock, sockCounts.getOrDefault(sock, 0) + 1);
        }

        // Calculate the number of pairs for each color
        int pairCount = 0;
        for (int count : sockCounts.values()) {
            pairCount += count / 2;
        }

        return pairCount;
    }

    public static void main(String[] args) {
        // Sample Input
        int n = 10;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20, 30};

        // Sample Output
        int result = CountSockPair(n, ar);
        System.out.println(result);
    }

}