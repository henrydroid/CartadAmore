package com.example.jpuente.cartadamore;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private static int state = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Message TextView
        final TextView messageTextView =  findViewById(R.id.messageText);

        //Floating Action Button
        final FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


        switch (state) {

            case 0: {
                messageTextView.setText("Ms. Writer");
                fab.setImageResource(getResources().getIdentifier("pen", "drawable", getPackageName()));

                state = 1;
                break;
            }

            case 1: {
                messageTextView.setText("Mia Lyka");
                fab.setImageResource(getResources().getIdentifier("goldilocks", "drawable", getPackageName()));

                state = 2;
                break;

            }

            case 2: {
                messageTextView.setText("Happy Valentines!");
                fab.setImageResource(getResources().getIdentifier("coco", "drawable", getPackageName()));

                state = 0;
                break;
            }

            default: {
                messageTextView.setText("Happy Valentines!");
                fab.setImageResource(getResources().getIdentifier("ic_launcher_dog", "drawable", getPackageName()));
            }

         }
            }
        });
    }
}
