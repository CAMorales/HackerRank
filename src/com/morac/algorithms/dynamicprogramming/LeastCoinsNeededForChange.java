package com.morac.algorithms.dynamicprogramming;

/**
 * Created by Claudio Morales on 29/04/2016.
 */
public class LeastCoinsNeededForChange {
    private static int getLeastCoinsNeededForChange(int coins[], int change) {
        //arrayOfChanges consists of all type of changes up to "change"
        //i.e. arrayOfChanges[0] = 0. Number of coins needed to give change of zero
        //arrayOfChanges[1] = 1 number of coins needed to give change of 1
        //arrayOfChanges[5] = 2 number of coins needed to give change of 5, 1 coin of value 1 && 1 coin of value 4
        int arrayOfChanges[] = new int[change + 1];
        arrayOfChanges[0] = 0;
        int currCoin;
        for (int curChange = 1; curChange <= change; curChange++) {
            arrayOfChanges[curChange] = curChange;
            for (int idxCoinType = 0; idxCoinType < coins.length; idxCoinType++) {
                currCoin = coins[idxCoinType];
                if (currCoin <= curChange &&
                        1 + arrayOfChanges[curChange - currCoin] < arrayOfChanges[curChange]) {
                    arrayOfChanges[curChange] = 1 + arrayOfChanges[curChange - currCoin];
                }
            }
        }
        return arrayOfChanges[change];
    }

    public static void main(String[] args) {
        int coins[] = {1, 4, 2};
        int change = 15;
        System.out.println(getLeastCoinsNeededForChange(coins, change));
    }
}
