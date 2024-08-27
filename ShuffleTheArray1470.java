import java.util.Arrays;
public class RichestCostumer {
    public static void main(String[] args) {
        int result = 0;
        int temp = 0;
        int max = 0;
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}


        };
        RichestCostumer richestCostumer = new RichestCostumer();
        System.out.println(richestCostumer.maximumWealth(accounts));

    } public int maximumWealth(int[][] accounts) {
        int  result = 0;
        int temp = 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++){
            for (int j = 0; j < accounts[i].length;j++){
                result = result + accounts[i][j];
            }
            if(result > max){
                max = result;
            }
            result = 0;
        }
        return max;
    }
}
