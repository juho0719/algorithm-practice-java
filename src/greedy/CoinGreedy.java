package greedy;

import java.util.Scanner;

public class CoinGreedy {

    // 백준 5585
    /*
    타로는 자주 JOI잡화점에서 물건을 산다. JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고, 언제나 거스름돈 개수가 가장 적게
    잔돈을 준다. 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오
    예를 들어 380엔 물건을 살 경우 500엔 1개, 100엔 1개 10엔 2개를 출력해야 한다.

    입력
    입력은 한줄로 이루어져 있고, 타로가 지불할 돈(1이상 1000미만의 정수) 1개가 쓰여져 있다.

    출력
    제출할 출력 파일은 1행으로만 되어 있다. 잔돈에 포함된 매수를 출력하시오

    예제입력
    380

    예제출력
    4
     */

    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10, 5, 1};
        int coinCount = 0;

        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        if(inputNum < 1 || inputNum > 1000) {
            System.out.println("1이상 1000미만의 정수만 입력 가능합니다.");
            return;
        }

        int data = 1000-inputNum;

        for(int i=0; i<coins.length; i++) {
            while(data >= coins[i]) {
                if(data == coins[i]) {
                    coinCount++;
                    System.out.println(coinCount);
                    return;
                }
                data = data - coins[i];
                coinCount++;
            }
        }
    }
}
