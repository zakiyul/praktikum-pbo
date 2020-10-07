package com.eki;

public class Kucing {
    public String warna = "orange";
    public int jumlah_kaki = 4;
    public String jenis_ekor = "panjang";
    public String makanan_kesukaan = "ikan";

    public String bersuara(){
        return "meong...";
    }

    public void berburu(){
        System.out.println("berburu ikan");
    }
}
