package com.recepgemalmaz.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Internet @Inject constructor(val adres: Adres) {

    fun basvuruYap() {
        Log.e("Sonuc", "Başvuru yapıldı${adres.adresBilgisi}")
    }
}