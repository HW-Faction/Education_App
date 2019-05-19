package studio.goldenapp.hr_d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import es.dmoral.toasty.Toasty;

public class Hgk extends AppCompatActivity {

    private HgkQuestions mQuestionLibrary = new HgkQuestions();

    private TextView mQuestionView;
    private TextView pcScore;
    private TextView pcQueNum;
    private AdView mAdView;

    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mQueNum = 1;
    private int Score = 0;
    private int mQuestionNumber = ThreadLocalRandom.current().nextInt(1, 80 + 1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hgk);

        mQuestionView = findViewById(R.id.hgk);
        mButtonChoice1 = findViewById(R.id.hgk1);
        mButtonChoice2 = findViewById(R.id.hgk2);
        mButtonChoice3 = findViewById(R.id.hgk3);
        mButtonChoice4 = findViewById(R.id.hgk4);
        pcScore = findViewById(R.id.hgkScore);
        pcQueNum = findViewById(R.id.pcQueNum);

        pcQueNum.setText(""+mQueNum);
        pcScore.setText(""+Score);

        updateQuestion();

        mAdView = findViewById(R.id.adViewhk);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice1.getText() == mAnswer){
                    Score = Score+2;

                    Toasty.success(Hgk.this, "Right Answer!", Toast.LENGTH_SHORT, true).show();

                    if (mQueNum == 15) {
                        Toasty.warning(Hgk.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Hgk.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }

                }else {
                    Toasty.error(Hgk.this, "Wrong. Right answer is " + mAnswer, Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Hgk.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Hgk.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }
                }
            }
        });


        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice2.getText() == mAnswer){
                    Score = Score+2;
                    Toasty.success(Hgk.this, "Right Answer!", Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Hgk.this, "Game Over.", Toast.LENGTH_SHORT, true).show();
                        Intent i = new Intent(Hgk.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }

                }else {
                    Toasty.error(Hgk.this, "Wrong. Right answer is " + mAnswer, Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Hgk.this, "Game Over.", Toast.LENGTH_SHORT, true).show();
                        Intent i = new Intent(Hgk.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }
                }
            }
        });


        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice3.getText() == mAnswer){
                    Score = Score+2;
                    Toasty.success(Hgk.this, "Right Answer!", Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Hgk.this, "Game Over.", Toast.LENGTH_SHORT, true).show();
                        Intent i = new Intent(Hgk.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }

                }else {
                    Toasty.error(Hgk.this, "Wrong. Right answer is " + mAnswer, Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Hgk.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Hgk.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }
                }

            }
        });


        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice4.getText() == mAnswer){
                    Score = Score+2;
                    Toasty.success(Hgk.this, "Right Answer!", Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Hgk.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Hgk.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }
                }else {
                    Toasty.error(Hgk.this, "Wrong. Right answer is " + mAnswer, Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Hgk.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Hgk.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
    }


    private void updateQuestion(){

        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        pcQueNum.setText(""+mQueNum);
        pcScore.setText(""+Score);
        mQueNum++;
        mQuestionNumber = ThreadLocalRandom.current().nextInt(1, 80 + 1);

    }
}
