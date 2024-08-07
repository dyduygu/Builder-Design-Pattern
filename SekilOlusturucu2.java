/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.odev33;

/**
 *
 * @author DUYGU
 */
public class SekilOlusturucu2 implements SekilOlusturucu {
    private int kenarSayisi;
    private Nokta baslangicNoktasi;
    private int kenarUzunlugu;
    private int kenarKalinligi;
    private String kenarRengi;
    private String icRengi;

    public SekilOlusturucu2(int kenarSayisi) {
        this.kenarSayisi = kenarSayisi;
    }

    @Override
    public SekilOlusturucu baslangicNoktasiAyarla(Nokta baslangicNoktasi) {
        this.baslangicNoktasi = baslangicNoktasi;
        return this;
    }

    @Override
    public SekilOlusturucu kenarUzunluguAyarla(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
        return this;
    }

    @Override
    public SekilOlusturucu kenarKalinligiAyarla(int kenarKalinligi) {
        this.kenarKalinligi = kenarKalinligi;
        return this;
    }

    @Override
    public SekilOlusturucu kenarRengiAyarla(String kenarRengi) {
        this.kenarRengi = kenarRengi;
        return this;
    }

    @Override
    public SekilOlusturucu icRengiAyarla(String icRengi) {
        this.icRengi = icRengi;
        return this;
    }

    @Override
    public Sekil oluştur() {
        return new Sekil(this);
    }
}