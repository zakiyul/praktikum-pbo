package com.eki;

public class Main {

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        System.out.println("warna kucing1 adalah "+ kucing1.warna);
        System.out.println(kucing1.bersuara());
        kucing1.berburu();
    }
}
