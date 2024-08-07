/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.odev33;

/**
 *
 * @author DUYGU
 */
public interface SekilOlusturucu {
    SekilOlusturucu baslangicNoktasiAyarla(Nokta baslangicNoktasi);
    SekilOlusturucu kenarUzunluguAyarla(int kenarUzunlugu);
    SekilOlusturucu kenarKalinligiAyarla(int kenarKalinligi);
    SekilOlusturucu kenarRengiAyarla(String kenarRengi);
    SekilOlusturucu icRengiAyarla(String icRengi);
    Sekil oluştur();
}