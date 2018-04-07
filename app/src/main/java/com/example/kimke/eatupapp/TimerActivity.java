package com.example.kimke.eatupapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class TimerActivity extends AppCompatActivity {

    private Button timerStartStop;
    private Boolean isRunning;
    private TextView countdownTimerText;
    private long timeLeftMilli;
    private CountDownTimer cdTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);


        this.timerStartStop = (Button) findViewById(R.id.StartStop);
        this.countdownTimerText = (TextView) findViewById(R.id.Timer);

        timeLeftMilli = 300000;
        updateCountDownText();
        isRunning = false;


        timerStartStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!isRunning)
                {
                    isRunning = true;
                    timerStartStop.setText(R.string.PauseTimer);
                    startTimer();
                }

                else
                {
                    isRunning = false;
                    timerStartStop.setText(R.string.PauseTimer);
                    pauseTimer();
                }

            }
        });
    }
    // --------------------------------- Timer Stuff ------------------------------------------
    private void startTimer()
    {
        cdTimer = new CountDownTimer(timeLeftMilli, 1000)
        {
            //@Override
            public void onTick(long millisUntilFinished)
            {
                timeLeftMilli = millisUntilFinished;
                updateCountDownText();
            }

            public void onFinish()
            {
                isRunning = false;
                timerStartStop.setText(R.string.StartTimer);
            }
        }.start();
    }

    private void pauseTimer() {
        cdTimer.cancel();
        timerStartStop.setText(R.string.StartTimer);
        //Can add functionality here to change the color of the start/stop button when paused.
    }

    private void updateCountDownText()
    {
        int minutes = (int) (timeLeftMilli / 1000) / 60;
        int seconds = (int) (timeLeftMilli / 1000) % 60;

        String remainingTimeFormatted = String.format(Locale.getDefault(), "%2d:%2d", minutes, seconds);
        countdownTimerText.setText(remainingTimeFormatted);
    }

}
