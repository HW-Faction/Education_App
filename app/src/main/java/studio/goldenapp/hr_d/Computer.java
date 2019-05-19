package studio.goldenapp.hr_d;

import android.bluetooth.BluetoothDevice;
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

public class Computer extends AppCompatActivity {


    private ComputerQuestions mQuestionLibrary = new ComputerQuestions();

    private TextView mQuestionView;
    private TextView pcScore;
    private TextView pcQueNum;
    private Button mButtonChoice1;
    private AdView mAdView;


    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    private int mQueNum = 1;
    private int Score = 0;
    private int mQuestionNumber = ThreadLocalRandom.current().nextInt(1, 69 + 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        mQuestionView = findViewById(R.id.pc);
        mButtonChoice1 = findViewById(R.id.pc1);
        mButtonChoice2 = findViewById(R.id.pc2);
        mButtonChoice3 = findViewById(R.id.pc3);
        mButtonChoice4 = findViewById(R.id.pc4);
        pcScore = findViewById(R.id.pcscore);
        pcQueNum = findViewById(R.id.pcQueNum);

        pcScore.setText(""+Score);
        pcQueNum.setText(""+mQueNum);
        updateQuestion();

        mAdView = findViewById(R.id.adViewc);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice1.getText() == mAnswer){
                    Score = Score+2;

                    Toasty.success(Computer.this, "Right Answer!", Toast.LENGTH_SHORT, true).show();

                    if (mQueNum == 15) {
                        Toasty.warning(Computer.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Computer.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }

                }else {
                    Toasty.error(Computer.this, "Wrong. Right answer is " + mAnswer, Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Computer.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Computer.this, MainActivity.class);
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
                    Toasty.success(Computer.this, "Right Answer!", Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Computer.this, "Game Over.", Toast.LENGTH_SHORT, true).show();
                        Intent i = new Intent(Computer.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }

                }else {
                    Toasty.error(Computer.this, "Wrong. Right answer is " + mAnswer, Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Computer.this, "Game Over.", Toast.LENGTH_SHORT, true).show();
                        Intent i = new Intent(Computer.this, MainActivity.class);
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
                    Toasty.success(Computer.this, "Right Answer!", Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Computer.this, "Game Over.", Toast.LENGTH_SHORT, true).show();
                        Intent i = new Intent(Computer.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }

                }else {
                    Toasty.error(Computer.this, "Wrong. Right answer is " + mAnswer, Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Computer.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Computer.this, MainActivity.class);
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
                    Toasty.success(Computer.this, "Right Answer!", Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Computer.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Computer.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    } else {
                        updateQuestion();
                    }
                }else {
                    Toasty.error(Computer.this, "Wrong. Right answer is " + mAnswer, Toast.LENGTH_SHORT, true).show();
                    if (mQueNum == 15) {
                        Toasty.warning(Computer.this, "Game Over.", Toast.LENGTH_SHORT, true).show();

                        Intent i = new Intent(Computer.this, MainActivity.class);
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
        pcScore.setText(""+Score);
        pcQueNum.setText(""+mQueNum);
        mQueNum++;
        mQuestionNumber = ThreadLocalRandom.current().nextInt(1, 69 + 1);

    }
}
