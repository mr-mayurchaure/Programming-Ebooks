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

public class FrontendActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontend);

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
                        "01.CSS Notes For Pros\n",
                        60000,
                        R.drawable.ic_frontend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Frontend%2FCSS%20Notes%20For%20Pros.pdf?alt=media&token=8626f3d5-63fb-4a9e-ba8b-8ba516b121ce"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Getting to Know Vue js\n",
                        60000,
                        R.drawable.ic_frontend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Frontend%2FGetting%20to%20Know%20Vue%20js.pdf?alt=media&token=e0b97dd1-097e-43f9-8ab2-c9fe1b601129"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.HTML5 Canvas Notes For Pros\n",
                        60000,
                        R.drawable.ic_frontend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Frontend%2FHTML5%20Canvas%20Notes%20For%20Pros.pdf?alt=media&token=2f215b6f-30ec-4860-be2f-39b2b99d756a"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "04.HTML5 Notes For Pros\n",
                        60000,
                        R.drawable.ic_frontend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Frontend%2FHTML5%20Notes%20For%20Pros.pdf?alt=media&token=df61f6eb-01ce-4413-96e3-a0b69c17e99b"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "05.Learning Bootstrap\n",
                        60000,
                        R.drawable.ic_frontend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Frontend%2FLearning%20Bootstrap.pdf?alt=media&token=6be36cbc-475c-4f6e-9262-2f0ebbc55a14"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "06.Sass for web Designers\n",
                        60000,
                        R.drawable.ic_frontend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Frontend%2FSass%20for%20web%20Designers.pdf?alt=media&token=96210efe-6c67-408c-b05b-d58c1c06ee3b"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "07.Twitter Bootstrap guide\n",
                        60000,
                        R.drawable.ic_frontend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Frontend%2FTwitter%20Bootstrap%20guide.pdf?alt=media&token=ec23b373-4efa-4651-a74e-abdb5fef169c"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "08.jQuery Notes For Pros\n",
                        60000,
                        R.drawable.ic_frontend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Frontend%2FjQuery%20Notes%20For%20Pros.pdf?alt=media&token=45b5f663-e7c1-4a83-a17e-0182aaee9978"
                ));




        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}