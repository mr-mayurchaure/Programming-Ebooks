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

public class SwiftActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swift);

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
                        "01.Learn Swift\n",
                        60000,
                        R.drawable.ic_swift,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Swift%2FLearn%20Swift.pdf?alt=media&token=d89440ea-bfef-4c6d-ace3-5a84e94c9a71"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Swift Notes For Profs\n",
                        60000,
                        R.drawable.ic_swift,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Swift%2FSwift%20Notes%20For%20Profs.pdf?alt=media&token=eda2c8ef-a451-4cad-bf92-2c89d735b814"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Swift for Beginners\n",
                        60000,
                        R.drawable.ic_swift,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Swift%2FSwift%20for%20Beginners.pdf?alt=media&token=8adef562-b657-49d7-8738-b3bc1063bd8b"
                ));


        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}