package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.next_button);
        SeekBar seek1 = findViewById(R.id.seekBar);
        SeekBar seek2 = findViewById(R.id.seekBar2);
        SeekBar seek3 = findViewById(R.id.seekBar3);
        seek1.setOnSeekBarChangeListener(new SeekBar1Listener());
        seek2.setOnSeekBarChangeListener(new SeekBar2Listener());
        seek3.setOnSeekBarChangeListener(new SeekBar3Listener());
    }

    public void switch_action(View view){
        Intent activity2 = new Intent(this, Activity2.class);
        SeekBar seek1 = findViewById(R.id.seekBar);
        SeekBar seek2 = findViewById(R.id.seekBar2);
        SeekBar seek3 = findViewById(R.id.seekBar3);
        int[] rgb = {seek1.getProgress(), seek2.getProgress(), seek3.getProgress()};
        activity2.putExtra("val", rgb);
        startActivity(activity2);
    }

    private class SeekBar1Listener implements SeekBar.OnSeekBarChangeListener {

        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            TextView text = findViewById(R.id.seek1Text);
            text.setText(""+progress);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {}
        public void onStopTrackingTouch(SeekBar seekBar) {}

    }

    private class SeekBar2Listener implements SeekBar.OnSeekBarChangeListener {

        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            TextView text = findViewById(R.id.seek2Text);
            text.setText(""+progress);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {}
        public void onStopTrackingTouch(SeekBar seekBar) {}

    }

    private class SeekBar3Listener implements SeekBar.OnSeekBarChangeListener {

        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            TextView text = findViewById(R.id.Seek3Text);
            text.setText(""+progress);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {}
        public void onStopTrackingTouch(SeekBar seekBar) {}

    }
}