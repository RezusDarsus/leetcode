public class leetcode1281 {

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            temp = temp / 10;
            sum = sum + digit;
            product = product * digit;
        }

        int difference = product - sum;
        System.out.println(difference);

        return difference;
    }

    public static void main(String[] args) {
        leetcode1281 main = new leetcode1281();
        main.subtractProductAndSum(234);
    }
}
