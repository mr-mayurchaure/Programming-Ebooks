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

public class AndroidActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ConstraintLayout relativeLayout = findViewById(R.id.firestore_list1);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.itemslist1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new PDFModel(
                        1,
                        "01.Android Development\n",
                        60000,
                        R.drawable.ic_android,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/android%2FAndroid%20Development.pdf?alt=media&token=dafca374-9bef-49b4-b640-356ce85a22f2"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Android Notes For Profs\n",
                        60000,
                        R.drawable.ic_android,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/android%2FAndroid%20Notes%20For%20Profs.pdf?alt=media&token=c039a434-5eb2-4e00-997e-f310b74db6b9"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Android Programmer Guide\n",
                        60000,
                        R.drawable.ic_android,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/android%2FAndroid%20Programmer%20Guide.pdf?alt=media&token=8c51d210-9a87-46f1-a80d-38e0606b68bc"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "04.Android Programming\n",
                        60000,
                        R.drawable.ic_android,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/android%2FAndroid%20Programming.pdf?alt=media&token=81777c39-28b6-420b-a100-5fc9800b7d8e"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "05.Head First Android Development (large size file)\n",
                        60000,
                        R.drawable.ic_android,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/android%2FHead%20First%20Android%20Development.pdf?alt=media&token=4e7d93dc-ba2b-499f-a89f-3180d193cb5a"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "06.Professional Android Application Development\n",
                        60000,
                        R.drawable.ic_android,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/android%2FProfessional%20Android%20Application%20Development.pdf?alt=media&token=ba8dafb6-5c0d-4978-ad20-663e0c493fce"
                ));


        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}