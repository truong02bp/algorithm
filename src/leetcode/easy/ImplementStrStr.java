package leetcode.easy;

public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty() || needle.equals(haystack))
            return 0;
        if (needle.length() == haystack.length())
            return -1;
        int i=0;
        while (i < haystack.length()) {
            boolean accepted = true;
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j=0;j<needle.length();j++) {
                    if (i +j >= haystack.length() || haystack.charAt(i+j) != needle.charAt(j)){
                        accepted = false;
                        break;
                    }
                }
                if (accepted)
                    return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("aaa" , "aaaa"));
    }
}
