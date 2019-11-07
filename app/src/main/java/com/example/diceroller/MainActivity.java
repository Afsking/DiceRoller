package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void on_button_click(View view){

        roll_the_dice();

        TextView tv = this.findViewById(R.id.numberView);
        TextView gs = this.findViewById(R.id.guessing);
        TextView ms = this.findViewById(R.id.msg);
        TextView sc = this.findViewById(R.id.score2);

        int newnumber = Integer.valueOf(tv.getText().toString());
        int userIN = Integer.valueOf(gs.getText().toString());

        int ScoreUpdater =0;
        int score1 =0;

        if (newnumber == userIN){
            ms.setText("Congratulations");
            ScoreUpdater = ((ScoreUpdater +score1));

            sc.setText(Integer.toString(ScoreUpdater));

        }

    }

    public void on_buttonclick2(View view){

        roll_the_dice();

       TextView tv = this.findViewById(R.id.numberView);
        TextView ms2 = this.findViewById(R.id.textView);

        int newnumber = Integer.valueOf(tv.getText().toString());

       if (newnumber == 1) {
           ms2.setText("If you could go anywhere in the world, where would you go?" );
       } else if (newnumber == 2){
           ms2.setText("If you were stranded on a desert island, what three things would you want to take with you?");
       }else if (newnumber == 3){
           ms2.setText("If you could eat only one food for the rest of your life, what would that be?");
       }else if (newnumber == 4){
           ms2.setText("If you won a million dollars, what is the first thing you would buy?");
       }else if (newnumber == 5){
           ms2.setText("If you could spend the day with one fictional character, who would it be?");
       }else if (newnumber == 6){
           ms2.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
       }

    }

    public void roll_the_dice(){

        TextView tv = this.findViewById(R.id.numberView);

        Random numberGenerated = new Random();

        int number = numberGenerated.nextInt(6 ) +1;

        tv.setText(Integer.toString(number));
    }


}
