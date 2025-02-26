package za.ac.tut.util;

import java.util.Random;

public class NumFind2 implements Runnable {

    private NumGenerated ng;
    private int num2 = new Random().nextInt(10);

    @Override
    public void run() {
        int gottenNum = ng.getNum();

        if (num2 == gottenNum) {
            System.out.println(Thread.currentThread().getName() + " has found " + num2);
        }

    }

    public NumFind2(NumGenerated ng) {
        this.ng = ng;
    }

}
