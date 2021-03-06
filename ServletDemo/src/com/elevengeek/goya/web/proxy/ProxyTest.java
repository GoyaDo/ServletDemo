package com.elevengeek.goya.web.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cj
 * @create 2020-02-14-18:12
 */
public class ProxyTest {
    public static void main(String[] args) {
        //创建真实对象
        Lenovo lenovo = new Lenovo();
        //动态代理增强lenovo对象
        /*
            三个参数：
                1. 类加载器：真实对象.getClass().getClassLoader()
                2. 接口数组：真实对象.getClass().getInterfaces()
                3. 处理器： new InvocationHandler()核心业务逻辑的处理
         */
        Computer proxyInstance = (Computer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
                代理逻辑编写的方法：代理对象调用的所有方法都会触发该方法执行
                    参数：
                        1. proxy：代理对象
                        2. method：代理对象调用的方法，被封装为对象
                        3. args：代理对象调用的方法时，传递的实际参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //是否是sale方法
                if (method.getName().equals("sale")){
                    //增强参数
                    double money = (double) args[0];
                    money = money * 0.85;
                    System.out.println("专车接送");
                    //使用真实对象调用该方法
                    String invoke = (String) method.invoke(lenovo, money);
                    //增强返回值
                    System.out.println("免费送货");
                    return invoke+"鼠标垫";
                }else{
                    //使用真实对象调用该方法
                    Object invoke = method.invoke(lenovo, args);
                    return invoke;
                }
            }
        });
        //调用方法
        String sale = proxyInstance.sale(8000);
        System.out.println(sale);
//        proxyInstance.show();
    }
}
