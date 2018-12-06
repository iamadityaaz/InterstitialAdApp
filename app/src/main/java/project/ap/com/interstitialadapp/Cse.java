package project.ap.com.interstitialadapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cse extends AppCompatActivity {

    InterstitialAdClass interstitialAdClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        interstitialAdClass = new InterstitialAdClass(this);
        interstitialAdClass.loadinterstitial();

    }

    @Override
    public void onBackPressed() {
        interstitialAdClass.showInterstitialAd();
        super.onBackPressed();
    }

}
