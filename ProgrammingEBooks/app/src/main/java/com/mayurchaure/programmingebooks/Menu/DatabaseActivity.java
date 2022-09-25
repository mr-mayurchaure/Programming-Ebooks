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

public class DatabaseActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);


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
                        "01.Guide to MongoDB\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FGuide%20to%20MongoDB.pdf?alt=media&token=749b3363-4de4-482c-809f-2481eeeba34c"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.Microsoft SQL Server 2012\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FMicrosoft%20SQL%20Server%202012.pdf?alt=media&token=76feb5b8-da3f-4814-8110-7319c54134f8"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Microsoft SQL Server Notes For Pros\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FMicrosoft%20SQL%20Server%20Notes%20For%20Pros.pdf?alt=media&token=322a6989-800d-4885-8f93-0fdbdb02644e"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "04.MongoDB Notes For Pros\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FMongoDB%20Notes%20For%20Pros.pdf?alt=media&token=b0ebdc2e-cedd-43a8-b733-12815f5d8157"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "05.MySQL Notes For Pros\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FMySQL%20Notes%20For%20Pros.pdf?alt=media&token=34389cf2-4986-4ec9-8acb-c85a07a4bdaa"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "06.Oracle Database Notes For Pros\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FOracle%20Database%20Notes%20For%20Pros.pdf?alt=media&token=e1b67d72-4f1a-4c89-938a-917c4a82e2a7"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "07.Oracle Database book\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FOracle%20Database%20book.pdf?alt=media&token=5f47cc0c-50aa-45b7-bb36-67ec690aa469"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "08.PostgreSQL Notes For Pros\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FPostgreSQL%20Notes%20For%20Pros.pdf?alt=media&token=e34f6dde-7115-450b-8cc0-88850573da21"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "09.PostgreSQL Tutorial\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FPostgreSQL%20Tutorial.pdf?alt=media&token=6f180c55-9555-4453-b78f-bbc425e96ca4"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "10.SQL Database (Big size PDF)\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FSQL%20Database.pdf?alt=media&token=1c031d85-f5ec-44a8-94fa-7738a8dc6c79"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "11.SQL Notes For Pros-1\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FSQL%20Notes%20For%20Pros-1.pdf?alt=media&token=e7328754-0ff6-40f1-8b9a-9ac2d930a36c"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "12.SQL Notes For Pros\n",
                        60000,
                        R.drawable.ic_database,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/database%2FSQL%20Notes%20For%20Pros.pdf?alt=media&token=17c2614d-9bb8-442d-825b-984f803aa0f3"
                ));


        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}