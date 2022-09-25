package com.mayurchaure.programmingebooks;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.mayurchaure.programmingebooks.Menu.AlgorithumActivity;
import com.mayurchaure.programmingebooks.Menu.AndroidActivity;
import com.mayurchaure.programmingebooks.Menu.ArduinoActivity;
import com.mayurchaure.programmingebooks.Menu.BackendActivity;
import com.mayurchaure.programmingebooks.Menu.CActivity;
import com.mayurchaure.programmingebooks.Menu.CMSActivity;
import com.mayurchaure.programmingebooks.Menu.CplusplusActivity;
import com.mayurchaure.programmingebooks.Menu.CsharpActivity;
import com.mayurchaure.programmingebooks.Menu.DatabaseActivity;
import com.mayurchaure.programmingebooks.Menu.FrontendActivity;
import com.mayurchaure.programmingebooks.Menu.ISOActivity;
import com.mayurchaure.programmingebooks.Menu.JavaActivity;
import com.mayurchaure.programmingebooks.Menu.LinuxActivity;
import com.mayurchaure.programmingebooks.Menu.MatlabActivity;
import com.mayurchaure.programmingebooks.Menu.PythonActivity;
import com.mayurchaure.programmingebooks.Menu.Rispberry_piActivity;
import com.mayurchaure.programmingebooks.Menu.RubyActivity;
import com.mayurchaure.programmingebooks.Menu.SwiftActivity;

public class DashboardActivity extends AppCompatActivity {

    LinearLayout algorithum, android, c, cplusplus, csharp, database, java, python, arduino, cms, backend, frontend, iso, linux, matlab, rispberry_pi, ruby, swift,commingsoon;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        algorithum = findViewById(R.id.algorithum);
        android = findViewById(R.id.android);
        c = findViewById(R.id.c);
        cplusplus = findViewById(R.id.cplusplus);
        csharp = findViewById(R.id.csharp);
        database = findViewById(R.id.database);
        java = findViewById(R.id.java);
        python = findViewById(R.id.python);
        arduino = findViewById(R.id.arduino);
        cms = findViewById(R.id.cms);
        backend = findViewById(R.id.backend);
        frontend = findViewById(R.id.frontend);
        iso = findViewById(R.id.iso);
        linux = findViewById(R.id.linux);
        matlab = findViewById(R.id.matlab);
        rispberry_pi = findViewById(R.id.rispberry_pi);
        ruby = findViewById(R.id.ruby);
        swift = findViewById(R.id.swift);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });

        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,getString(R.string.IntAdUnit), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        mInterstitialAd = null;
                    }
                });



        algorithum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AlgorithumActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, AndroidActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, CActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }
            }
        });

        cplusplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, CplusplusActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        csharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, CsharpActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DatabaseActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, JavaActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, PythonActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        arduino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, ArduinoActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        cms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, CMSActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        backend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, BackendActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        frontend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, FrontendActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, ISOActivity.class));
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, LinuxActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        matlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MatlabActivity.class));
                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        rispberry_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, Rispberry_piActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        ruby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, RubyActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

        swift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, SwiftActivity.class));

                if (mInterstitialAd != null) {
                    mInterstitialAd.show(DashboardActivity.this);
                }

            }
        });

    }
}