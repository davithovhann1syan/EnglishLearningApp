package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StudyOptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_options);
        TextView grammar = findViewById(R.id.grammar);
        TextView back = findViewById(R.id.back);
        TextView grammarTest = findViewById(R.id.grammar_test);
        TextView vocabularyTest = findViewById(R.id.vocabulary_test);
        TextView translate = findViewById(R.id.Translate);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        grammar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GrammarActivity.class);
                startActivity(intent);
            }
        });

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TranslateActivity.class);
                startActivity(intent);
            }
        });

        grammarTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GrammarTestActivity.class);
                startActivity(intent);

            }
        });

        vocabularyTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), VocabularyTestActivity.class);
                startActivity(intent);
            }
        });

    }
}