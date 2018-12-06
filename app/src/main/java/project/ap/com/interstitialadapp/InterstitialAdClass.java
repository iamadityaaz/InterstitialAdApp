package project.ap.com.interstitialadapp;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialAdClass {

    public InterstitialAd interstitial;
    public Context mContext;

    public InterstitialAdClass(Context mContext) {
        this.mContext = mContext;
    }

    public void loadinterstitial()
    {

        // Create the interstitial.
        interstitial = new InterstitialAd(mContext);
        interstitial.setAdUnitId(mContext.getResources().getString(R.string.interstitial_ad_unit_id));

        // Create ad request.
        AdRequest adRequest = new AdRequest.Builder().build();

        // Begin loading your interstitial.
        interstitial.loadAd(adRequest);

    }

    // Show Interstitial Ad
    public void showInterstitialAd()
    {
        // return, if Ad data is no loaded
        if (!interstitial.isLoaded()) {
            return;
        }

        // Show Ad
        interstitial.show();
    }

}
