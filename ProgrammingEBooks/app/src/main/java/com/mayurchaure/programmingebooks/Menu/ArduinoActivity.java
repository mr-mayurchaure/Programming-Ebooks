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

public class ArduinoActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arduino);

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
                        "01.Android Blueprint\n",
                        60000,
                        R.drawable.ic_arduino,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/arduino%2FAndroid%20Blueprint.pdf?alt=media&token=32ac6716-3a17-4975-b394-a777c6f548d9"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Arduino Development\n",
                        60000,
                        R.drawable.ic_arduino,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/arduino%2FArduino%20Development%20.pdf?alt=media&token=63529304-8160-48e2-9c66-a3722f41e014"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Arduino Workshop\n",
                        60000,
                        R.drawable.ic_arduino,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/arduino%2FArduino%20Workshop.pdf?alt=media&token=988ec409-9bdb-4b42-bd81-81760288376a"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "04.Home Security System\n",
                        60000,
                        R.drawable.ic_arduino,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/arduino%2FHome%20Security%20System.pdf?alt=media&token=f01e0620-983f-4291-8065-1980ab8d6e0b"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "05.Internet of Things with the Arduino Yun\n",
                        60000,
                        R.drawable.ic_arduino,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/arduino%2FInternet%20of%20Things%20with%20the%20Arduino%20Yun.pdf?alt=media&token=c0f44c96-7051-42b1-90a0-33778b957d6a"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "06.Programming Arduino with LabView\n",
                        60000,
                        R.drawable.ic_arduino,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/arduino%2FProgramming%20Arduino%20with%20LabView.pdf?alt=media&token=8b440566-742d-44d6-b99b-b81ecf6d865d"
                ));


        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}