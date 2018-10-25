package com.libtest.rec.libtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hello;
    Student student = new Student("neuqsoft","neuq");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = (TextView)findViewById(R.id.hello);
        hello.setText(student.getName());
    }
}
