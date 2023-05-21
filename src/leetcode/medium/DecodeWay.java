package leetcode.medium;

public class DecodeWay {

    public static int numDecodings(String s) {
        int len = s.length();
        switch (len) {
            case 0:
                return 0;
        }
        int[] values = new int[len+1];
        values[0] = 0;
        values[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i < s.length(); i++) {
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("226"));
    }
}
