package com.awelless;

import java.util.ArrayList;

public class Treasures {

    ArrayList<Treasure> treasures;

    Treasures() {
        treasures = new ArrayList<Treasure>();
    }

    Treasures(Treasure ...treasures) {
        this();

        for (Treasure treasure : treasures) {
            this.treasures.add(treasure);
        }
    }

    public Treasure[] getAllTreasures() {

        Treasure[] treasures = new Treasure[this.treasures.size()];

        for (int i = 0; i < treasures.length; ++i) {
            treasures[i] = this.treasures.get(i);
        }

        return treasures;
    }

    public Treasure mostValuableTreasure() {

        Treasure mostValuableTreasure = treasures.get(0);

        for (Treasure treasure : treasures) {
            if (treasure.compareTo(mostValuableTreasure) > 0) {
                mostValuableTreasure = treasure;
            }
        }

        return mostValuableTreasure;
    }

    public Treasure[] getTreasuresByTotalValue(int totalValue) {

        boolean[][] isReachable = new boolean[treasures.size()][totalValue + 10];
        int[][]     ancestor    = new int    [treasures.size()][totalValue + 10];

        for (int i = 0; i < ancestor.length; ++i) {
            for(int j = 0; j < ancestor[i].length; ++j) {
                ancestor[i][j] = -1;
            }
        }

        isReachable[0][0] = true;
        if (treasures.get(0).getValue() <= totalValue) {
            isReachable[0][treasures.get(0).getValue()] = true;
            ancestor   [0][treasures.get(0).getValue()] = 0;
        }

        for (int curTreasure = 1; curTreasure < treasures.size(); ++curTreasure) {

            isReachable[curTreasure][0] = true;

            int curTreasureValue = treasures.get(curTreasure).getValue();

            for (int curValue = 0; curValue <= totalValue; ++curValue) {

                if (isReachable[curTreasure - 1][curValue]) {
                    isReachable[curTreasure][curValue] = true;
                    ancestor   [curTreasure][curValue] = ancestor[curTreasure - 1][curValue];
                    continue;
                }

                if (curValue - curTreasureValue >= 0 &&
                   isReachable[curTreasure - 1][curValue - curTreasureValue]) {
                    isReachable[curTreasure][curValue] = true;
                    ancestor   [curTreasure][curValue] = curTreasure;
                }
            }
        }

        for (int[] x : ancestor) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        if (!isReachable[treasures.size() - 1][totalValue]) {
            return null;
        }

        ArrayList<Treasure> answer = new ArrayList<Treasure>();

        int curValue = totalValue;
        for (int curTreasure = treasures.size() - 1; curTreasure >= 0 && curValue > 0; --curTreasure) {
            if(ancestor[curTreasure][curValue] == curTreasure) {
                answer.add(treasures.get(curTreasure));
                curValue -= treasures.get(curTreasure).getValue();
            }
        }

        return answer.toArray(new Treasure[answer.size()]);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        for (Treasure treasure : treasures) {
            builder.append(treasure.toString() + "\n");
        }

        return builder.toString();
    }
}
