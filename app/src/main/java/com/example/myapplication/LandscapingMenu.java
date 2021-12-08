package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LandscapingMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landscaping_menu);
    }

    //Landscaping gravel calculation
    //Size of rock, square footage of lot, depth of gravel
    /* cubic yard chart
        Gravel (¼” – 2″) 	2,800 – 3,400 lbs 	1.4 – 1.7 tons 	1,660 – 2,020 kg 	1.66 – 2.02 tonnes
        Rock (2″ – 6″) 	3,000 – 3,400 lbs 	1.5 – 1.7 tons 	1,780 – 2,020 kg 	1.78 – 2.02 tonnes
        Sand (wet) 	3,000 – 3,400 lbs 	1.5 – 1.7 tons 	1,780 – 2,020 kg 	1.78 – 2.02 tonnes
        Sand (dry) 	2,600 – 3,000 lbs 	1.3 – 1.5 tons 	1,540 – 1,780 kg 	1.54 – 1.78 tonnes
        Topsoil (wet) 	3,000 – 3,400 lbs 	1.5 – 1.7 tons 	1,780 – 2,020 kg 	1.78 – 2.02 tonnes
        Topsoil (dry) 	2,000 – 2,600 lbs 	1 – 1.3 tons 	1,190 – 1,540 kg 	1.19 – 1.54 tonnes
        Riprap 	3,400 – 4,000 lbs 	1.7 – 2 tons 	2,020 – 2,370 kg 	2.02 – 2.37 tonnes
     */
    /*
                 volume = length × width × depth
            volume = 10′ × 10′ × 1′ = 100 cu ft
            cu yds = 100 cu ft / 27 = 3.7

            weight = cu yds × density
            weight min = 3.7 × 1.4 = 5.2 tons
            weight max = 3.7 × 1.7 = 6.3 tons
     */

    public void getTons(View view){

        EditText squareFeet = findViewById(R.id.squareFeet);;
        EditText depth =  findViewById(R.id.depth);;
        EditText rockType =  findViewById(R.id.density);;
        double density = 1.6;
        double cubicYards = Double.valueOf((depth.getText().toString())) * (Double.valueOf(squareFeet.getText().toString())/81);

        TextView gravelResult = (TextView) findViewById(R.id.GravelResult);

        double result =  cubicYards / density;
        result = Math.floor(result * 100) / 100;

        gravelResult.setText("" + result + " Tons");

    }

}