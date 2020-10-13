package com.eki;

public class Main {

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("merah");
        Kucing kucing2 = new Kucing("hijau");
        Kucing kucing3 = new Kucing("biru");
        System.out.println("warna kucing1 "+kucing1.warna);
        System.out.println("warna kucing2 "+kucing2.warna);
        System.out.println("warna kucing3 "+kucing3.warna);
    }
}
