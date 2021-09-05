package abbtractObject;

public class StringTest {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isCharSorted("abc"));
        String[] strings={"abf","abd"};
        System.out.println(isStringSorted(strings));
    }
    // 判断字符串是否是回文
    public static boolean isPalindrome(String s){
        int length = s.length();
        // 回文字符串第一个和最后一个相同，即S[1]=S[N]  S[2]=S[N-1] ... S[x]=S[N-(x-1)]=S[N-x+1]
        for (int i = 0; i < length / 2; i++) {
            // x表示的是传统理解上的第几个字符，从1开始，而i表示字符串的下标，从0开始
            // 用于表示字符串第N个字符的表示也发生了变化，原来的第N个字符用S[N]表示，而使用下标则表示为s[n-1],n为字符串长度，则s(i)=s[n-1-i]
            // n=length 则s(i)=s[length-1-i]
            if (s.charAt(i)!=s.charAt(length-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCharSorted(String s){
        for(int i = 0;i<s.length()-1;i++){
            if (s.charAt(i + 1 )<s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStringSorted(String[] s) {
        for(int i =1 ;i < s.length;i++){
            if (s[i-1].compareTo(s[i]) > 0) {
                return false;
            }
        }
        return true;
    }
}
