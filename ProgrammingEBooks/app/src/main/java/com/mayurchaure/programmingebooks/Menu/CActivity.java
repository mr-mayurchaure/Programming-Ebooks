package com.mayurchaure.programmingebooks.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.mayurchaure.programmingebooks.Adapter;
import com.mayurchaure.programmingebooks.PDFModel;
import com.mayurchaure.programmingebooks.R;

import java.util.ArrayList;
import java.util.List;

public class CActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactivity);

        ConstraintLayout relativeLayout = findViewById(R.id.firestore_list1);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.itemslist1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new PDFModel(
                        1,
                        "01.C Notes For Pros\n",
                        60000,
                        R.drawable.ic_c,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/c%2FC%20Notes%20For%20Pros.pdf?alt=media&token=6c749c67-766b-4ee5-97c8-8798ea2e06f4"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "C Programming Tutorial\n",
                        60000,
                        R.drawable.ic_c,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/c%2FC%20Programming%20Tutorial.pdf?alt=media&token=3c0fdb1b-bbf8-4fdd-b1ae-900df278572c"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Learn to Code with C\n",
                        60000,
                        R.drawable.ic_c,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/c%2FLearn%20to%20Code%20with%20C.pdf?alt=media&token=ea9f99d1-b6c6-40b4-94ac-d37299463891"
                ));


        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}