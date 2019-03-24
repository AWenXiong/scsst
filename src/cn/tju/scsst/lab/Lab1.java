package cn.tju.scsst.lab;

import java.util.ArrayList;

public class Lab1 {

    private class Cash implements Comparable<Cash>{
        public int num;
        public int value;
        public Cash(int value, int num){
            this.value = value;
            this.num = num;
        }

        @Override
        public int compareTo(Cash o) {
            if (this.value >= o.value) {
                return  -1;
            } else {
                return 1;
            }
        }
    }

    // 用ArrayList而非HashMap是因为算法triangleProblem2需要对面值进行排序
    private ArrayList<Cash> cashes = null;

    public boolean triangleProblem(int x) {
        this.cashes = new ArrayList<>();
        this.cashes.add(new Cash(50, 1));
        this.cashes.add(new Cash(20, 1));
        this.cashes.add(new Cash(1, 3));
        this.cashes.add(new Cash(5, 2));
        cashes.sort(null);
        for (Cash cash : this.cashes) {
            for (int i = 0 ; i < cash.num; i++) {
                if (cash.value < x) {
                    x -= cash.value;
                } else if (cash.value == x) {
                    x -= cash.value;
                } else {
                    break;
                }
            }
        }
        return x == 0;
    }
}
