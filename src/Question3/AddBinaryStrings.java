package Question3;

/*Given two Binary Strings a and b return their sum as a binary string s.

 */
public class AddBinaryStrings {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        // Example usage
        AddBinaryStrings solution = new AddBinaryStrings();

        String a = "101";//this is 5 in binary
        String b = "1101";//This is 13 in binary

        String sum = solution.addBinary(a, b);

        System.out.println("Sum: " + sum);// output is 18 in binary 10010
    }
}
