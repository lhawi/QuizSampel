package com.tech.hawi.quiztest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    Button btnQuizA, btnQuizB, btnQuizC;

    private String mAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQuizA = (Button) findViewById(R.id.btnQuizA);
        btnQuizB = (Button) findViewById(R.id.btnQuizB);
        btnQuizC = (Button) findViewById(R.id.btnQuizC);

        btnQuizA.setOnClickListener(this);
        btnQuizB.setOnClickListener(this);
        btnQuizC.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnQuizA:
                Intent iA = new Intent(MainActivity.this, QuizA.class);
                startActivity(iA);

                break;

            case R.id.btnQuizB:
                Intent iB = new Intent(MainActivity.this, QuizB.class);
                startActivity(iB);
                break;
            case R.id.btnQuizC:
                Intent iC = new Intent(MainActivity.this, QuizC.class);
                startActivity(iC);
                break;
        }
    }
}
