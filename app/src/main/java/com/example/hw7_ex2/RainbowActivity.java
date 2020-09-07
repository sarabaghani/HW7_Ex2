package com.example.hw7_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class RainbowActivity extends AppCompatActivity {

    TextView mTextViewLemonda;
    TextView mTextViewRose;
    TextView mTextViewScarlet;
    TextView mTextViewMerigold;
    TextView mTextViewTiger;
    TextView mTextViewYellow;
    TextView mTextViewTuscany;
    TextView mTextViewLime;
    TextView mTextViewMoss;
    TextView mTextViewAzure;
    TextView mTextViewCerulean;
    TextView mTextViewArctic;
    TextView mTextViewLilac;
    TextView mTextViewMagenta;
    TextView mTextViewSangria;

    String mTemp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rainbow);
        findViews();
        setListeners();
    }

    public void findViews() {
        mTextViewLemonda = findViewById(R.id.lemonda);
        mTextViewRose = findViewById(R.id.rose);
        mTextViewScarlet = findViewById(R.id.scarlet);
        mTextViewMerigold = findViewById(R.id.merigold);
        mTextViewTiger = findViewById(R.id.tiger);
        mTextViewYellow = findViewById(R.id.yellow);
        mTextViewTuscany = findViewById(R.id.tuscany);
        mTextViewLime = findViewById(R.id.lime);
        mTextViewMoss = findViewById(R.id.moss);
        mTextViewAzure = findViewById(R.id.azure);
        mTextViewCerulean = findViewById(R.id.cerulean);
        mTextViewArctic = findViewById(R.id.arctic);
        mTextViewLilac = findViewById(R.id.lilac);
        mTextViewMagenta = findViewById(R.id.magenta);
        mTextViewSangria = findViewById(R.id.sangria);
    }

    public void setListeners() {
        mTextViewLemonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewLemonda);
                mTemp = "Lemonda";
                textChanges();
                mainText();
            }
        });
        mTextViewRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewRose);
                mTemp = "Rose";
                textChanges();
                mainText();
            }
        });
        mTextViewScarlet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewScarlet);
                mTemp = "Scarlet";
                textChanges();
                mainText();
            }
        });
        mTextViewMerigold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewMerigold);
                mTemp = "Merigold";
                textChanges();
                mainText();
            }
        });
        mTextViewTiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewTiger);
                mTemp = "Tiger";
                textChanges();
                mainText();
            }
        });
        mTextViewYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewYellow);
                mTemp = "Yellow";
                textChanges();
                mainText();
            }
        });
        mTextViewTuscany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewTuscany);
                mTemp = "Tuscany";
                textChanges();
                mainText();
            }
        });
        mTextViewLime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewLime);
                mTemp = "Lime";
                textChanges();
                mainText();
            }
        });
        mTextViewMoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewMoss);
                mTemp = "Moss";
                textChanges();
                mainText();
            }
        });
        mTextViewAzure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewAzure);
                mTemp = "Azure";
                textChanges();
                mainText();
            }
        });
        mTextViewCerulean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewCerulean);
                mTemp = "Cerulean";
                textChanges();
                mainText();
            }
        });
        mTextViewArctic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewArctic);
                mTemp = "Arctic";
                textChanges();
                mainText();
            }
        });
        mTextViewLilac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewLilac);
                mTemp = "Lilac";
                textChanges();
                mainText();
            }
        });
        mTextViewMagenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewMagenta);
                mTemp = "Magenta";
                textChanges();
                mainText();
            }
        });
        mTextViewSangria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideVisibility(mTextViewSangria);
                mTemp = "Sangria";
                textChanges();
                mainText();
            }
        });
    }


    public void hideVisibility(TextView textView) {
        textView.setVisibility(View.GONE);
    }

    public void backToMain(final TextView textView, final String txt) {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText(txt);
            }
        }, 5000);
    }
    public void mainText(){
        backToMain(mTextViewLemonda , "Lemonda");
        backToMain(mTextViewRose, "Rose");
        backToMain(mTextViewScarlet,"Scarlet");
        backToMain(mTextViewMerigold,"Merigold");
        backToMain(mTextViewTiger , "Tiger");
        backToMain(mTextViewYellow , "Yellow");
        backToMain(mTextViewTuscany , "Tuscany");
        backToMain(mTextViewLime , "Lime");
        backToMain(mTextViewMoss, "Moss");
        backToMain(mTextViewAzure,"Azure");
        backToMain(mTextViewCerulean,"Cerulean");
        backToMain(mTextViewArctic, "Arctic");
        backToMain(mTextViewLilac,"Lilac");
        backToMain(mTextViewMagenta,"Magenta");
        backToMain(mTextViewSangria,"Sangria");
    }

    public  void textChange(TextView textView){
        textView.setText(mTemp);
    }
    public void textChanges(){
        textChange(mTextViewLemonda);
        textChange(mTextViewRose);
        textChange(mTextViewScarlet);
        textChange(mTextViewMerigold);
        textChange(mTextViewTiger);
        textChange(mTextViewYellow);
        textChange(mTextViewTuscany);
        textChange(mTextViewLime);
        textChange(mTextViewMoss);
        textChange(mTextViewAzure);
        textChange(mTextViewCerulean);
        textChange(mTextViewArctic);
        textChange(mTextViewLilac);
        textChange(mTextViewMagenta);
        textChange(mTextViewSangria);

    }
}