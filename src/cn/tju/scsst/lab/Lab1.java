package cn.tju.scsst.lab;

import java.util.ArrayList;

public class Lab1 {

//	private int numOf50 = 1;
//	private int numOf20 = 1;
//	private int numOf5  = 2;
//	private int numOf1  = 3;
//
//	public void triangleProblem(int x) {
//		if (x <= 0) {
//			System.out.println("Finished");
//		}
//		if (numOf50 == 0 && numOf20 == 0 && numOf5 == 0 && numOf1 == 0 && x > 0) {
//			System.out.println("Can not take out");
//		}
//
//		if (x == 50 && numOf50 > 0) {
//			System.out.println("50");
//			numOf50--;
//		} else if (x == 20 && numOf20 > 0) {
//			System.out.println("20");
//			numOf20--;
//		} else if (x == 5 && numOf5 > 0) {
//			System.out.println("5");
//			numOf5--;
//		} else if (x == 1 && numOf1 > 0) {
//			System.out.println("1");
//			numOf1--;
//		} else if (x > 50 && numOf50 > 0) {
//			numOf50--;
//			triangleProblem(x - 50);
//			System.out.println("50");
//		} else if (x > 20 && numOf20 > 0) {
//			numOf20--;
//			triangleProblem(x - 20);
//			System.out.println("20");
//		} else if (x > 5 && numOf5 > 0) {
//			numOf5--;
//			triangleProblem(x - 5);
//			System.out.println("5");
//		} else if (x > 1 && numOf1 > 0) {
//			numOf1--;
//			triangleProblem(x - 1);
//			System.out.println("1");
//		} else {
//			System.out.println("Can not take out");
//			System.exit(1);
//		}
//	}
//
//	public boolean triangleProblem2(int x){
//		for (int num50 = 0; num50 <= numOf50; num50++) {
//		if (50 * num50 > x){
//			break;
//		}
//		for (int num20 = 0; num20 <= numOf20; num20++) {
//			if (20 * num20 + 50 * num50 > x){
//				break;
//			}
//			for (int num5 = 0; num5 <= numOf5; num5++) {
//				if (5 * num5 + 20 * num20 + 50 * num50 > x){
//					break;
//				}
//				for (int num1 = 0; num1 <= numOf1; num1++) {
//					if (num1 + 5 * num5 + 20 * num20 + 50 * num50 > x){
//						break;
//					}
//					if (num1 + 5 * num5 + 20 * num20 + 50 * num50 == x){
//						System.out.println("50 " + num50);
//						System.out.println("20 " + num20);
//						System.out.println("5  " + num5);
//						System.out.println("1  " + num1);
//						return true;
//					}
//				}
//			}
//		}
//	}
//	System.out.println("Can not take out " + x + " yuan!");
//	return false;
//	}

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

    public boolean triangleProblem3(int x) {
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
                } else if (cash.value > x) {
                    break;
                }
            }
        }
        if (x != 0) {
            return false;
        } else {
            return true;
        }
    }
}
