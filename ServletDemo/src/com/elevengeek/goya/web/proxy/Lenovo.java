package com.elevengeek.goya.web.proxy;

/**
 * 真实类
 * @author cj
 * @create 2020-02-14-18:11
 */
public class Lenovo implements Computer{
    @Override
    public String sale(double money) {
        System.out.println("buy...by"+money);
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.println("show...computer...");
    }
}
