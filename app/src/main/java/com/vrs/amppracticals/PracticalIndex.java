package com.vrs.amppracticals;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class PracticalIndex extends AppCompatActivity {
    Button practical1Button, practical2Button, practical3Button, practical4Button, practical5Button;
    Button practical6Button, practical7Button, practical8Button, practical9Button, practical10Button;
    Button practical3_1Button, practical3_2Button, practical3_3Button, practical3_4Button;
    LinearLayout practical3SubPracticalsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViewId();
        initialTask();

        practical3Button.setOnClickListener(view -> onPractical3Clicked());

        practical3_1Button.setOnClickListener(view -> goToPractical3_1());
    }

    private void goToPractical3_1() {

    }

    private void onPractical3Clicked() {
        if (practical3SubPracticalsLayout.getVisibility() == View.VISIBLE) {
            practical3SubPracticalsLayout.setVisibility(View.GONE);
        } else {
            practical3SubPracticalsLayout.setVisibility(View.VISIBLE);
        }
    }

    private void initialTask() {
        practical3SubPracticalsLayout.setVisibility(View.GONE);
    }

    private void setViewId() {
        practical1Button = findViewById(R.id.practical_1_button);
        practical2Button = findViewById(R.id.practical_2_button);
        practical3Button = findViewById(R.id.practical_3_button);
        practical4Button = findViewById(R.id.practical_4_button);
        practical5Button = findViewById(R.id.practical_5_button);
        practical6Button = findViewById(R.id.practical_6_button);
        practical7Button = findViewById(R.id.practical_7_button);
        practical8Button = findViewById(R.id.practical_8_button);
        practical9Button = findViewById(R.id.practical_9_button);
        practical10Button = findViewById(R.id.practical_10_button);

        practical3_1Button = findViewById(R.id.practical_3_1_button);
        practical3_2Button = findViewById(R.id.practical_3_2_button);
        practical3_3Button = findViewById(R.id.practical_3_3_button);
        practical3_4Button = findViewById(R.id.practical_3_4_button);

        practical3SubPracticalsLayout = findViewById(R.id.practical_3_sub_practicals);
    }
}