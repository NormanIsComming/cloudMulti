package com.zf.controller;

import com.zf.pojo.User;
import com.zf.thread.UserThread;
import org.omg.CORBA.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.Object;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: 张子锋
 * @Date: 2023/5/1 12:32
 * @Description:
 */
@RestController
public class OrderController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private RestTemplate restTemplate;

    private Object a = new Object();

    private Object b = new Object();

    @GetMapping("/getOrder")
    public String getOrder() throws Exception, InvocationTargetException, IllegalAccessException, InterruptedException {

//
//        logger.info("------------come!!!------");
////        return "order1";
////        return restTemplate.getForObject("http://stockservice/getStock", String.class);
//        System.out.println(Thread.currentThread().getName());
        User user = new User();
        Method getUserName = User.class.getDeclaredMethod("getUserName");
        Method setUserName = User.class.getDeclaredMethod("setUserName", String.class);
        for(int i = 1; i < 100; i++){
            Thread thread = new UserThread();
            thread.start();
        }
        Thread thread2 = new Thread(new Runnable(){
            public void run() {
                synchronized (b){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (a){
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        });
        thread2.start();

        synchronized (a){
            Thread.sleep(2000);
            synchronized (b){
                Thread.sleep(2000);
            }
        }

        Thread thread1 = new Thread(new Runnable(){

            public void run() {
                while (true){
                    int i = 0;
                    i = i + 1;
                }
            }
        });
        thread1.start();

        for (int i = 1; i <= 70000; i++) {
            // 3个类6个方法，每个方法会生成一个单独的类加载器
            getUserName.invoke(user, null);
            setUserName.invoke(user, "haha");
            System.out.println("------continue------");
            Thread.sleep(500);
//            reflector1.getSetInvoker("field" + i).invoke(testModel, setArgs);
//            reflector1.getGetInvoker("field" + i).invoke(testModel, getArgs);
//            reflector2.getSetInvoker("field" + i).invoke(testModel2, setArgs);
//            reflector2.getGetInvoker("field" + i).invoke(testModel2, getArgs);
//            reflector3.getSetInvoker("field" + i).invoke(testModel3, setArgs);
//            reflector3.getGetInvoker("field" + i).invoke(testModel3, getArgs);
        }
        return "success";
    }



}
