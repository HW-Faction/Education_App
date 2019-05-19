package studio.goldenapp.hr_d;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private Button currentAffair;
    private Button hgk;
    private Button eng;
    private Button reasoning;
    private Button science;
    private Button computer;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;
    private InterstitialAd nInterstitialAd;
    private InterstitialAd oInterstitialAd;
    private InterstitialAd oaInterstitialAd;
    private InterstitialAd naInterstitialAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-9437440306585224~4613729673");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        currentAffair = findViewById(R.id.ca);
        hgk = findViewById(R.id.hgk);
        reasoning = findViewById(R.id.reasoning);
        computer = findViewById(R.id.computer);
        science = findViewById(R.id.sce);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-9437440306585224/6853482845");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        oInterstitialAd = new InterstitialAd(this);
        oInterstitialAd.setAdUnitId("ca-app-pub-9437440306585224/8741279587");
        oInterstitialAd.loadAd(new AdRequest.Builder().build());

        nInterstitialAd = new InterstitialAd(this);
        nInterstitialAd.setAdUnitId("ca-app-pub-9437440306585224/1241708290");
        nInterstitialAd.loadAd(new AdRequest.Builder().build());

        oaInterstitialAd = new InterstitialAd(this);
        oaInterstitialAd.setAdUnitId("ca-app-pub-9437440306585224/8726157080");
        oaInterstitialAd.loadAd(new AdRequest.Builder().build());

        naInterstitialAd = new InterstitialAd(this);
        naInterstitialAd.setAdUnitId("ca-app-pub-9437440306585224/4403768697");
        naInterstitialAd.loadAd(new AdRequest.Builder().build());

        currentAffair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, CurrentAffair.class);
                startActivity(a);
                mInterstitialAd.show();
            }
        });

        hgk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, Hgk.class);
                startActivity(b);
                nInterstitialAd.show();
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, Science.class);
                startActivity(c);
                naInterstitialAd.show();
            }
        });

        reasoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MainActivity.this, Reasoning.class);
                startActivity(e);
                oaInterstitialAd.show();
            }
        });

        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f= new Intent(MainActivity.this, Computer.class);
                startActivity(f);
                oInterstitialAd.show();
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        if(!isNetworkAvailable(this)) {
            finish(); //Calling this method to close this activity when internet is not available.
            System.exit(0);
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager conMan = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(conMan.getActiveNetworkInfo() != null && conMan.getActiveNetworkInfo().isConnected())
            return true;
        else
            return false;
    }
}
