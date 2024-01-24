package com.example.shonaronovconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.TV1);
        tv2 = findViewById(R.id.Tv2);
        tv3 = findViewById(R.id.Tv3);
        tv4 = findViewById(R.id.Tv4);
        tv5 = findViewById(R.id.Tv5);
        tv6 = findViewById(R.id.Tv6);
        tv7 = findViewById(R.id.Tv7);
        tv1.setText("Cars x Classic Clog Lightning McQueen");
        tv2.setText("The Cars x Crocs Classic Clog ‘Lightning McQueen’ takes inspiration from the vehicular hero of the hit 2006 Pixar film. The character’s likeness, highlighted by windshield eyes and a smiling grille.  functioning LEDs that light up with every step.");
        tv3.setText("10/10");
        tv4.setText("Sarah G. : ");
        tv5.setText("I bought these Lightning Speedy McQueen Red Crocs for my son, and he absolutely loves them! The fit is great, and they are of good quality. The best part is that they light up just as described. Highly recommended if your kids like to wear Crocs.");
        tv6.setText("Jason M. : ");
        tv7.setText("I recently purchased the Crocs Kids Crocband Cars Lightning McQueen Clogs in red for my toddler, and I am extremely satisfied with my purchase. These shoes not only look adorable, but they also light up, which my child finds fascinating. The quality is excellent, and they are comfortable for my little one to wear. I would definitely give them a 10-star rating!");

    }
}