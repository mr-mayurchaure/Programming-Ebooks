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

public class JavaActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);


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
                        "01.Functional Programming in Java\n",
                        60000,
                        R.drawable.ic_java,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/java%2FFunctional%20Programming%20in%20Java.pdf?alt=media&token=0db17307-2492-49d5-9349-66aa01c6d611"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Head First Java\n",
                        60000,
                        R.drawable.ic_java,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/java%2FHead%20First%20Java.pdf?alt=media&token=fb9dd79b-6b55-499f-ab4e-5de289a8f113"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Java Notes For Profs\n",
                        60000,
                        R.drawable.ic_java,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/java%2FJava%20Notes%20For%20Profs.pdf?alt=media&token=390f7c37-b5e5-4c4d-9578-42568eba39c2"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "04.Java Programming 24 Hour Trainer\n",
                        60000,
                        R.drawable.ic_java,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/java%2FJava%20Programming%2024%20Hour%20Trainer.pdf?alt=media&token=2f4a02fb-439d-4a07-afe5-31981f7a082d"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "05.Java Programming\n",
                        60000,
                        R.drawable.ic_java,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/java%2FJava%20Programming.pdf?alt=media&token=275f60e6-79bb-446c-95b6-e99cb8345c25"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "06.OOP using Java\n",
                        60000,
                        R.drawable.ic_java,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/java%2FOOP%20using%20Java.pdf?alt=media&token=b737b14a-797f-4687-9329-96a35bb5b562"
                ));


        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}