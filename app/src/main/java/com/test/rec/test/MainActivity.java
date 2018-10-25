package com.test.rec.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.libtest.rec.libtest.Student;


public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Student student = new Student("testLocal", "testLocal");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(student.getName());
    }
}
