package com.recepgemalmaz.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor(val adres: Adres) {

    fun gonder() {
        Log.e("Sonuc", "Kargo gönderildi${adres.adresBilgisi}")

    }
}