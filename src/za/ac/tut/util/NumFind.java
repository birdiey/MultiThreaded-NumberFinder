package za.ac.tut.util;

import java.util.Random;

public class NumFind implements Runnable {

    private NumGenerated ng;
    private int num1 = new Random().nextInt(10);

    @Override
    public void run() {

        int gottenNum = ng.getNum();
        System.out.println(Thread.currentThread().getName()+" trying to find number...");
        if (num1 == gottenNum) {
            System.out.println(Thread.currentThread().getName() + " has found " + num1);
        }

    }

    public NumFind(NumGenerated ng) {
        this.ng = ng;
    }

}
