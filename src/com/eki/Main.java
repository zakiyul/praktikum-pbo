package com.eki;

public class Main {

    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("purple",3,"belang");
        System.out.println("warna kucing1 adalah "+ kucing1.warna);
        System.out.println("jumlah kaki "+kucing1.jumlah_kaki);
        System.out.println("jenis ekor "+kucing1.jenis_ekor);
        System.out.println(kucing1.bersuara());
        kucing1.berburu("pepaya");

        kucing1.warna = "hijau";
        System.out.println("kucing1 sekarang berubah warna menjadi "+kucing1.warna);
    }
}
