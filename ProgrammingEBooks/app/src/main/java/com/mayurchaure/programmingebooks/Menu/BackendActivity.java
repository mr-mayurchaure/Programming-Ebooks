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

public class BackendActivity extends AppCompatActivity {

    List<PDFModel> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backend);

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
                        "01..NET Framework Notes For Pros\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2F.NET%20Framework%20Notes%20For%20Pros.pdf?alt=media&token=e2b781a5-56dd-4b03-bd0f-da512057d52d"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "02.ASP.NET MVC\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FASP.NET%20MVC%20.pdf?alt=media&token=96ca73da-3204-4058-9bf5-ab5f5e3e9e08"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "03.Ajax Programming\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FAjax%20Programming.pdf?alt=media&token=639988e4-3ea2-4e1b-bf91-657d03d37cee"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "04.Codeigniter For  PHP Developers\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FCodeigniter%20For%20%20PHP%20Developers.pdf?alt=media&token=b5fcb645-843d-4d63-a35b-a13b953c4714"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "05.Django Core\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FDjango%20Core.pdf?alt=media&token=d1286208-cc8b-411b-9c17-21d860c7dbe6"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "06.Django Tutorial\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FDjango%20Tutorial%20.pdf?alt=media&token=0e35542f-bee2-4ab8-b267-d4b4dc69e268"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "07.Laravel framework\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FLaravel%20framework.pdf?alt=media&token=916aff84-2db6-45d2-a50f-ed634ec5eb9c"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "08.Learn Ruby On Rails\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FLearn%20Ruby%20On%20Rails.pdf?alt=media&token=78f8f92a-e0a3-4721-a631-e42674532fa1"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "09.Node.JS Design Patterns\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FNode.JS%20Design%20Patterns.pdf?alt=media&token=faa37923-8c21-44c6-aadf-89688090f206"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "10.Node.JS Notes For Pros\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FNode.JS%20Notes%20For%20Pros.pdf?alt=media&token=727b00e3-99fd-4b5a-8c2a-d8e99af85118"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "11.PHP And MySQL\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FPHP%20And%20MySQL.pdf?alt=media&token=c27a7a16-f697-496d-9301-de1e413ea9e7"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "12.PHP Notes For Pros\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FPHP%20Notes%20For%20Pros.pdf?alt=media&token=25e88fa8-0729-46fc-9313-9a4b7eb40240"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "13.RubyOnRails Notes For Pros\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FRubyOnRails%20Notes%20For%20Pros.pdf?alt=media&token=c5351eef-d3ba-4ba4-9c14-315c6f905ba2"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "14.Spring Framework Documentation\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FSpring%20Framework%20Documentation.pdf?alt=media&token=220e3928-dac1-4f61-9f9d-8c16e3d27f50"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "15.Spring Framework Notes For Pros\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FSpring%20Framework%20Notes%20For%20Pros.pdf?alt=media&token=0fa571e1-a7bb-4024-8e0f-6114db56495a"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "16.The  Django Development\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FThe%20%20Django%20Development.pdf?alt=media&token=b732c849-a156-40b4-a5c6-e79c6509d3be"
                ));

        productList.add(
                new PDFModel(
                        1,
                        "17.The Full Stack Developer\n",
                        60000,
                        R.drawable.ic_backend,
                        "https://firebasestorage.googleapis.com/v0/b/programming-ebooks-41111.appspot.com/o/Backend%2FThe%20Full%20Stack%20Developer.pdf?alt=media&token=a949e90b-70ec-4a64-9058-0d1bf987404e"
                ));



        //creating recyclerview adapter
        Adapter adapter = new Adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}