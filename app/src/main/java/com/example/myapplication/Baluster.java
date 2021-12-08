package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

//TODO clean up this class now that it is working
public class Baluster extends AppCompatActivity {

    static int runFraction = 0;
    static int balusterFraction = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baluster);
        setRunSeekbar();
        setFractionSeekbar();
        setBalusterFractionSeekbar();
        setBalusterWidthSeekbar();


    }

    private void setRunSeekbar() {
        int step = 1;
        int max = 108;
        int min = 1;

        SeekBar seekbar = findViewById(R.id.RunLengthInteger);
        seekbar.setMax((max - min) / step);

        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                        double value = min + (progress * step);
                        setRunLength((int) value);
                        updateResults();
                    }
                }
        );
    }

    private void setBalusterWidthSeekbar() {
        int step = 1;
        int max = 6;
        int min = 1;

        SeekBar seekbar = findViewById(R.id.BalusterLengthInteger);
        seekbar.setMax((max - min) / step);

        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                        double value = min + (progress * step) - 1;
                        setBalusterWidth((int) value);

                    }
                }
        );
    }


    private void setFractionSeekbar() {
        int step = 1;
        int max = 16;
        int min = 1;

        SeekBar seekbar = findViewById(R.id.RunLengthFraction);
        seekbar.setMax((max - min) / step);

        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                        double value = min + (progress * step) - 1;
                        setRunLengthFraction((int) value);

                    }
                }
        );
    }

    private void setBalusterFractionSeekbar() {
        int step = 1;
        int max = 16;
        int min = 1;

        SeekBar seekbar = findViewById(R.id.BalusterLengthFraction);
        seekbar.setMax((max - min) / step);

        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                        double value = min + (progress * step) - 1;
                        setBalusterWidthFraction((int) value);
                        updateResults();

                    }
                }
        );
    }

    public void setRunLength(int length) {
        TextView runLength = (TextView) findViewById(R.id.RunLength);
        runLength.setText("" + length);
        updateResults();
    }


    public void setRunLengthFraction(int length) {
        TextView runLength = (TextView) findViewById(R.id.runLengthFraction);
        String fractionValue = "";

        Baluster.runFraction = length;

        switch (length) {
            case 0:
                fractionValue = fractionValue;
                break;
            case 1:
                fractionValue = " \u00B9" + "/" + "\u2081" + "\u2086";
                break;
            case 2:
                fractionValue = " " + (char) 8539;
                break;
            case 3:
                fractionValue = " \u00B3" + "/" + "\u2081" + "\u2086";
                break;
            case 4:
                fractionValue = " \u00BC";
                break;
            case 5:
                fractionValue = " \u2075" + "/" + "\u2081" + "\u2086";
                break;
            case 6:
                fractionValue = " " + (char) 8540;
                break;
            case 7:
                fractionValue = " \u2077" + "/" + "\u2081" + "\u2086";
                break;
            case 8:
                fractionValue = " " + (char) 189;
                break;
            case 9:
                fractionValue = " \u2079" + "/" + "\u2081" + "\u2086";
                break;
            case 10:
                fractionValue = " \u215D";
                break;
            case 11:
                fractionValue = " \u00B9" + "\u00B9" + "/" + "\u2081" + "\u2086";
                break;
            case 12:
                fractionValue = " \u00BE";
                break;
            case 13:
                fractionValue = " \u00B9" + "\u00B3" + "/" + "\u2081" + "\u2086";
                break;
            case 14:
                fractionValue = " \u215E";
                break;
            case 15:
                fractionValue = " \u00B9" + "\u2075" + "/" + "\u2081" + "\u2086";
                break;

        }
        runLength.setText(fractionValue + "\" ");
        updateResults();
    }

    public void setBalusterWidth(int length) {
        TextView runLength = (TextView) findViewById(R.id.BalusterWidth);
        runLength.setText("" + length);
        updateResults();
    }

    public void setBalusterWidthFraction(int length) {
        TextView runLength = (TextView) findViewById(R.id.BalusterWidthFraction);
        String fractionValue = "";
        Baluster.balusterFraction = length;

        switch (length) {
            case 0:
                fractionValue = fractionValue;
                break;
            case 1:
                fractionValue = " \u00B9" + "/" + "\u2081" + "\u2086";
                break;
            case 2:
                fractionValue = " " + (char) 8539;
                break;
            case 3:
                fractionValue = " \u00B3" + "/" + "\u2081" + "\u2086";
                break;
            case 4:
                fractionValue = " \u00BC";
                break;
            case 5:
                fractionValue = " \u2075" + "/" + "\u2081" + "\u2086";
                break;
            case 6:
                fractionValue = " " + (char) 8540;
                break;
            case 7:
                fractionValue = " \u2077" + "/" + "\u2081" + "\u2086";
                break;
            case 8:
                fractionValue = " " + (char) 189;
                break;
            case 9:
                fractionValue = " \u2079" + "/" + "\u2081" + "\u2086";
                break;
            case 10:
                fractionValue = " \u215D";
                break;
            case 11:
                fractionValue = " \u00B9" + "\u00B9" + "/" + "\u2081" + "\u2086";
                break;
            case 12:
                fractionValue = " \u00BE";
                break;
            case 13:
                fractionValue = " \u00B9" + "\u00B3" + "/" + "\u2081" + "\u2086";
                break;
            case 14:
                fractionValue = " \u215E";
                break;
            case 15:
                fractionValue = " \u00B9" + "\u2075" + "/" + "\u2081" + "\u2086";
                break;

        }
        runLength.setText(fractionValue + "\" ");
        updateResults();
    }


    public void increaseBaluster(View view) {
        TextView currentBalusters = (TextView) findViewById(R.id.TotalBalusters);
        int total = 1 + Integer.parseInt(currentBalusters.getText().toString());
        currentBalusters.setText("" + total);
        updateResults();
    }

    public void decreaseBaluster(View view) {
        TextView currentBalusters = (TextView) findViewById(R.id.TotalBalusters);
        int total = Integer.parseInt(currentBalusters.getText().toString()) - 1;
        total = total < 1 ? 1 : total;
        currentBalusters.setText("" + total);
        updateResults();
    }

    private void updateResults() {
        calculateBetweenSpacing();
        calculateOnCenter();
    }

    public void calculateBetweenSpacing() {
        TextView currentBalusters = (TextView) findViewById(R.id.TotalBalusters);
        int totalBalusters = Integer.parseInt(currentBalusters.getText().toString());
        TextView runLengthInteger = (TextView) findViewById(R.id.RunLength);
        double runLength = Integer.parseInt(runLengthInteger.getText().toString());
        TextView balusterWidthInteger = (TextView) findViewById(R.id.BalusterWidth);
        double BalusterWidth = Integer.parseInt(balusterWidthInteger.getText().toString());

        TextView betweenSpacing = (TextView) findViewById(R.id.SpaceBetween);
        double balusterSpace = totalBalusters * 5.5;

        double integerResult = (runLength + (((double) Baluster.runFraction) / 16) - balusterSpace) / (totalBalusters + 1);
        String fraction = getFractionResult(integerResult - Math.floor(integerResult));
        betweenSpacing.setText((int) Math.floor(integerResult) + " " + fraction + "\"");
    }

    public String getFractionResult(double fraction) {
        System.out.println("fractioin: " + fraction);
        double measured = fraction;
        double oneSixteenth = 1.0 / 16.0;
        int counter = 0;
        while (measured >= oneSixteenth) {
            counter++;
            measured = measured - oneSixteenth;
        }

        String fractionValue = "";
        switch (counter) {
            case 0:
                fractionValue = fractionValue;
                break;
            case 1:
                fractionValue = " \u00B9" + "/" + "\u2081" + "\u2086";
                break;
            case 2:
                fractionValue = " " + (char) 8539;
                break;
            case 3:
                fractionValue = " \u00B3" + "/" + "\u2081" + "\u2086";
                break;
            case 4:
                fractionValue = " \u00BC";
                break;
            case 5:
                fractionValue = " \u2075" + "/" + "\u2081" + "\u2086";
                break;
            case 6:
                fractionValue = " " + (char) 8540;
                break;
            case 7:
                fractionValue = " \u2077" + "/" + "\u2081" + "\u2086";
                break;
            case 8:
                fractionValue = " " + (char) 189;
                break;
            case 9:
                fractionValue = " \u2079" + "/" + "\u2081" + "\u2086";
                break;
            case 10:
                fractionValue = " \u215D";
                break;
            case 11:
                fractionValue = " \u00B9" + "\u00B9" + "/" + "\u2081" + "\u2086";
                break;
            case 12:
                fractionValue = " \u00BE";
                break;
            case 13:
                fractionValue = " \u00B9" + "\u00B3" + "/" + "\u2081" + "\u2086";
                break;
            case 14:
                fractionValue = " \u215E";
                break;
            case 15:
                fractionValue = " \u00B9" + "\u2075" + "/" + "\u2081" + "\u2086";
                break;
        }
        return fractionValue;
    }

    public void calculateOnCenter() {
        TextView currentBalusters = (TextView) findViewById(R.id.TotalBalusters);
        int totalBalusters = Integer.parseInt(currentBalusters.getText().toString());
        TextView runLengthInteger = (TextView) findViewById(R.id.RunLength);
        int runLength = Integer.parseInt(runLengthInteger.getText().toString());
        TextView balusterWidthInteger = (TextView) findViewById(R.id.BalusterWidth);
        int balusterWidth = Integer.parseInt(balusterWidthInteger.getText().toString());

        double balusterSpace = totalBalusters * ((balusterWidth*1.0) + (1.0 * Baluster.balusterFraction/16));
        double integerResult = (runLength + (((double) Baluster.runFraction) / 16) - balusterSpace) / (totalBalusters + 1);
        integerResult += ((balusterWidth*1.0) + (1.0 * Baluster.balusterFraction/16));
        String fraction = getFractionResult(integerResult - Math.floor(integerResult));

        TextView onCenter = (TextView) findViewById(R.id.SpaceOnCenter);
        onCenter.setText((int) Math.floor(integerResult) + " " + fraction + "\"");

    }

}