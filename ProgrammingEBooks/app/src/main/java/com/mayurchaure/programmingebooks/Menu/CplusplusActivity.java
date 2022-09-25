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

public class CplusplusActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplusplus);


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
                        "01.Cpp  Notes For Profs\n",
                        60000,
                        R.drawable.ic_cplusplus,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/c%2B%2B%2FCpp%20%20Notes%20For%20Profs.pdf?alt=media&token=745c0cf0-ee00-480b-bba5-282d7000448a"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Learn  Cpp\n",
                        60000,
                        R.drawable.ic_cplusplus,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/c%2B%2B%2FLearn%20%20Cpp.pdf?alt=media&token=1ccb2a58-9300-4971-bae1-dab4a3527def"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Structured Programming with C pp\n",
                        60000,
                        R.drawable.ic_cplusplus,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/c%2B%2B%2FStructured%20Programming%20with%20C%20pp.pdf?alt=media&token=685f571a-dbfb-400e-846b-ed8ca1a7b56b"
                ));


        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}