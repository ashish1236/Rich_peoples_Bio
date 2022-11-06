package com.mengadevelopers.allbio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;


import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.mengadevelopers.allbio.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private AdView mAdView;
    private AdView mAdView2;
    private AdView mAdView3;
    private AdView mAdView4;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();



        InterstitialAd.load(this, "ca-app-pub-9986980606552169/4392676894", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdClicked() {
                                super.onAdClicked();
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Set the ad reference to null so you don't show the ad a second time.

                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.

                                mInterstitialAd = null;
                            }

                            @Override
                            public void onAdImpression() {
                                // Called when an impression is recorded for an ad.
                                super.onAdImpression();
                            }

                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.

                            }
                        });

                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error

                        mInterstitialAd = null;
                    }
                });



        mAdView = findViewById(R.id.adView1);
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                super.onAdClicked();
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {

                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                binding.lisasssasaasanearaaLayout6s12a.setVisibility(View.VISIBLE);
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        });




        mAdView4 = findViewById(R.id.adView4);
        mAdView4.loadAd(adRequest);
        mAdView4.setAdListener(new AdListener() {
            @Override
            public void onAdClicked() {
                super.onAdClicked();
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                super.onAdFailedToLoad(adError);
                mAdView4.loadAd(adRequest);
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                binding.lisasssasaasanearaaLayout6s12d.setVisibility(View.VISIBLE);
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        });


        binding.bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "bill");
                startActivity(intent);
            }
        });
        binding.elon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adshow();
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "elon");
                startActivity(intent);
            }
        });
        binding.JeffBezos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "jef");
                startActivity(intent);
            }
        });
        binding.LarryPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "larry");
                startActivity(intent);
            }
        });
        binding.LarryEllison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "Larryellison");
                startActivity(intent);
            }
        });
        binding.mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "mark");
                startActivity(intent);
            }
        });
        binding.SergeyBrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adshow();
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "serginbrin");
                startActivity(intent);
            }
        });
        binding.WarrenBuffet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "warren");
                startActivity(intent);
            }
        });
        binding.BernardArnault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adshow();
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("key", "bernard");
                startActivity(intent);
            }
        });
    }

    public void adshow() {
        if (mInterstitialAd != null) {
            mInterstitialAd.show(MainActivity.this);
        } else {

        }
    }
}