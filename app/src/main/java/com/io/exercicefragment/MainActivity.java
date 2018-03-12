package com.io.exercicefragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.io.distancelib.LatLonDistanceCalculator;
import com.io.distancelib.Point;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Point buenosAiresObeliscoPoint =
                new Point((float) 0.6037389, (float) 28.3815704);

        Point nycStatueOfLibertyPoint =
                new Point((float) 0.5892494, (float) 28.0445004);

        float distanceBetweenPoints = LatLonDistanceCalculator.calculateDistance(
                buenosAiresObeliscoPoint,
                nycStatueOfLibertyPoint);

        TextView kilometersLabel = (TextView) findViewById(R.id.kilometor_tv);

        kilometersLabel.setText("Between the Obelisco and the Statue of Liberty there are: \n" + distanceBetweenPoints + "KM");

    }
}
