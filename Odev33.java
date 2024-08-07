/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odev33;

/**
 *
 * @author DUYGU
 */
public class Odev33 {

    public static void main(String[] args) {
      Sekil sekil = new SekilOlusturucu2(4)
                .baslangicNoktasiAyarla(new Nokta(0, 0))
                .kenarUzunluguAyarla(10)
                .kenarKalinligiAyarla(2)
                .kenarRengiAyarla("Siyah")
                .icRengiAyarla("Kırmızı")
                .oluştur();
        System.out.println("Şekil oluştu");
    }
}
    



