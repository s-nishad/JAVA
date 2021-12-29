public class Calculation {
    String Addition(String str1, String str2) {
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        String str = "";

        int len1 = str1.length();
        int len2 = str2.length();
        int diff = len2 - len1;
        int carry = 0;
        int sum;
        for (int i = len1 - 1; i >= 0 ; i--) {
            sum = ((int) (str1.charAt(i) - '0') + (int) (str2.charAt(i + diff) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        for (int i = diff - 1; i >= 0 ; i--) {
            sum = ((int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0)
            str += (char)(carry + '0');
        return new StringBuilder(str).reverse().toString();
    }
}
