package za.ac.tut.util;

import java.util.Random;

public class NumGenerated {

    private int num;

    public NumGenerated(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int num4Generator() {
        num = new Random().nextInt(10) ;
        return num;
    }
}
