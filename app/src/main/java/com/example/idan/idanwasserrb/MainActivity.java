package com.example.idan.idanwasserrb;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
LinearLayout l;
Button b,bb;
RadioButton rb1,rb2,rb3;
int circle, lgo, tri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb1 = (RadioButton) findViewById(R.id.rba);
        rb2 = (RadioButton) findViewById(R.id.rbb);
        rb3 = (RadioButton) findViewById(R.id.rbc);
        l = (LinearLayout) findViewById(R.id.ll);
        b = (Button) findViewById(R.id.b1);
        bb = (Button) findViewById(R.id.b2);
        circle = R.drawable.circles;
        tri = R.drawable.triangles;
        lgo = R.drawable.lego;
    }
    public void cc (View view){
        if (rb1.isChecked())
            l.setBackgroundResource(circle);
        if (rb2.isChecked())
            l.setBackgroundResource(tri);
        if (rb3.isChecked())
            l.setBackgroundResource(lgo);
    }
    public void cl (View view) {
        l.setBackgroundColor(Color.WHITE);
    }
}
