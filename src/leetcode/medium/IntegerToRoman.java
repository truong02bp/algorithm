package leetcode.medium;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        String[] characters = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] values = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int i = characters.length - 1;
        StringBuilder sb = new StringBuilder();
        while (num > 0 && i>=0) {
            if (num >= values[i]) {
                sb.append(characters[i]);
                num -= values[i];
            } else {
                i--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }
}
