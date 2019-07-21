package com.peterwachira.wazinsureapiclient.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.peterwachira.wazinsureapiclient.R;
import android.content.Intent;
import android.os.Handler;
import butterknife.ButterKnife;

public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);

        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {

                        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(intent);


                        finish();

                    }
                },
                1500);

    }
}
