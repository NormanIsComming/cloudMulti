package com.zf.thread;

/**
 * @Author: 张子锋
 * @Date: 2023/5/8 12:14
 * @Description:
 */
public class UserThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("-----come--------");
            method1();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void method1() {
        System.out.println("--method1--");
        method2();
        method3();
    }

    private void method2() {
        try {
            System.out.println("--method2--");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void method3() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        method4();
    }

    private void method4() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
