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

public class AlgorithumActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithum);

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
                        "01.Algorithm Notes for Pros\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FAlgorithm%20Notes%20for%20Pros.pdf?alt=media&token=be2d58e5-a98a-4982-8e3c-5efaffb40927"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Algorithms For Dummies\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FData%20Structure%20and%20Algorithms.pdf?alt=media&token=7da44eee-1682-41a7-a3a3-fb989ed25e79"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Data Structure and Algorithms\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FData%20Structure%20and%20Algorithms.pdf?alt=media&token=7da44eee-1682-41a7-a3a3-fb989ed25e79"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "04.Data Structure into Java\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FData%20Structure%20into%20Java.pdf?alt=media&token=109ffdb7-b2a1-49f6-b882-5abb9dec8362"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "05.Data Structures and Algorithms in Python\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FData%20Structures%20and%20Algorithms%20in%20Python.pdf?alt=media&token=505cf4fc-44ac-409d-aed6-84fdf9fa677f"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "06.Essential Algorithms\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FEssential%20Algorithms.pdf?alt=media&token=765a364e-7c65-4cd9-8b9c-005a2a3a7232"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "07.How to Think About Algorithms\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FHow%20to%20Think%20About%20Algorithms.pdf?alt=media&token=4b28fc99-d6a5-4524-bd6f-41de9e87f492"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "08.Introduction to Algorithms\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FIntroduction%20to%20Algorithms.pdf?alt=media&token=4cb42db0-e759-49a5-b1bb-694923a8ab93"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "09.JavaScript Data Structures and Algorithms\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FJavaScript%20Data%20Structures%20and%20Algorithms.pdf?alt=media&token=dd691b13-8a2d-45b6-a47f-7e2b2201ef7f"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "10.Learning Algorithms Through Programming and Puzzle Solving\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FLearning%20Algorithms%20Through%20Programming%20and%20Puzzle%20Solving.pdf?alt=media&token=d2e1c811-bd05-4173-81e2-2896a1939de0"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "11.Teach Yourself Data Structures And Algorithms In 24 hours\n",
                        60000,
                        R.drawable.ic_algorithum,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/algorithum%2FTeach%20Yourself%20Data%20Structures%20And%20Algorithms%20In%2024%20hours.pdf?alt=media&token=a2ba4387-6602-4c05-bc45-f642ef28b84d"
                ));

        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

}