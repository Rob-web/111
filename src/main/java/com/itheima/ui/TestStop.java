package com.itheima.ui;

public class TestStop implements Runnable {

    //1.设置一个标志位
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("线程1...." + i++);
        }
    }

    //2. 设置一个公开的方法停止线程，转换标志位
    public void stop() {
        this.flag = false;
    }

}