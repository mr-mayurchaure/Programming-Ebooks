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

public class PythonActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);


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
                        "01.Fundamentals Python -1\n",
                        60000,
                        R.drawable.ic_python,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/python%2FFundamentals%20Python%20-1.pdf?alt=media&token=637a5e62-6a97-423a-b53b-661e60f21c96"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Fundamentals Python\n",
                        60000,
                        R.drawable.ic_python,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/python%2FFundamentals%20Python%20.pdf?alt=media&token=266b0545-71eb-4cac-9ff6-592f64f2f1b5"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Learning Python Design Patterns\n",
                        60000,
                        R.drawable.ic_python,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/python%2FLearning%20Python%20Design%20Patterns%20.pdf?alt=media&token=22173d8c-19f1-4cb4-b470-1d61b06b4f93"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "04.Python Notes For Profs\n",
                        60000,
                        R.drawable.ic_python,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/python%2FPython%20Notes%20For%20Profs.pdf?alt=media&token=55c2c8bd-f5b9-4aaa-ac47-e9bd5a5f1508"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "05.Python Pocket Reference 4th Edition Book\n",
                        60000,
                        R.drawable.ic_python,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/python%2FPython%20Pocket%20Reference%204th%20Edition%20Book.pdf?alt=media&token=cdae93ff-45ed-47e1-8087-09a2f132d07f"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "06.Python Programming\n",
                        60000,
                        R.drawable.ic_python,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/python%2FPython%20Programming%20.pdf?alt=media&token=1469b16e-0726-4f55-9a71-eb1301ffcd75"
                ));



        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}