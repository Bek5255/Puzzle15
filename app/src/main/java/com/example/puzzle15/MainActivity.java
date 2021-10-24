package com.example.puzzle15;

import static java.lang.Integer.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public Button button12;
    public Button button13;
    public Button button14;
    public Button button15;
    public Button button16;
    public Chronometer chronometer;
    public Button restart;
    int wereEmpty;
    String empty = "16";
    TextView clicks;
    int numberOfClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        chronometer = findViewById(R.id.chronometer);
        restart = findViewById(R.id.restart);
        clicks = findViewById(R.id.numberOfClick);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        restart.setOnClickListener(this);


        chronometer.start();
        // button13.setEnabled(false);
        // button14.setEnabled(false);
        // button2.setText(button1.getText());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        button1.setText(String.valueOf(numbers.get(0)));
        button2.setText(String.valueOf(numbers.get(1)));
        button3.setText(String.valueOf(numbers.get(2)));
        button4.setText(String.valueOf(numbers.get(3)));
        button5.setText(String.valueOf(numbers.get(4)));
        button6.setText(String.valueOf(numbers.get(5)));
        button7.setText(String.valueOf(numbers.get(6)));
        button8.setText(String.valueOf(numbers.get(7)));
        button9.setText(String.valueOf(numbers.get(8)));
        button10.setText(String.valueOf(numbers.get(9)));
        button11.setText(String.valueOf(numbers.get(10)));
        button12.setText(String.valueOf(numbers.get(11)));
        button13.setText(String.valueOf(numbers.get(12)));
        button14.setText(String.valueOf(numbers.get(13)));
        button15.setText(String.valueOf(numbers.get(14)));
        button16.setText(String.valueOf(numbers.get(15)));

        if (button1.getText().equals(empty)) {
            wereEmpty = 1;
            setBluer(button1);
        } else if (button2.getText().equals(empty)) {
            wereEmpty = 2;
            setBluer(button2);
        } else if (button3.getText().equals(empty)) {
            wereEmpty = 3;
            setBluer(button3);
        } else if (button4.getText().equals(empty)) {
            wereEmpty = 4;
            setBluer(button4);
        } else if (button5.getText().equals(empty)) {
            wereEmpty = 5;
            setBluer(button5);
        } else if (button6.getText().equals(empty)) {
            wereEmpty = 6;
            setBluer(button6);
        } else if (button7.getText().equals(empty)) {
            wereEmpty = 7;
            setBluer(button7);
        } else if (button8.getText().equals(empty)) {
            wereEmpty = 8;
            setBluer(button8);
        } else if (button9.getText().equals(empty)) {
            wereEmpty = 9;
            setBluer(button9);
        } else if (button10.getText().equals(empty)) {
            wereEmpty = 10;
            setBluer(button10);
        } else if (button11.getText().equals(empty)) {
            wereEmpty = 11;
            setBluer(button11);
        } else if (button12.getText().equals(empty)) {
            wereEmpty = 12;
            setBluer(button12);
        } else if (button13.getText().equals(empty)) {
            wereEmpty = 13;
            setBluer(button13);
        } else if (button14.getText().equals(empty)) {
            wereEmpty = 14;
            setBluer(button14);
        } else if (button15.getText().equals(empty)) {
            wereEmpty = 15;
            setBluer(button15);
        } else {
            wereEmpty = 16;
            setBluer(button16);
        }


    }

    @SuppressLint("ResourceAsColor")
    public void setBluer(Button button) {
        button.setText(empty);
        button.setEnabled(false);
    }

    @SuppressLint("ResourceAsColor")
    public void setWieter(Button button) {
        button.setEnabled(true);
    }


    public void onClick(View view) {
        numberOfClick++;
        clicks.setText(String.valueOf(numberOfClick));

        switch (view.getId()) {
            case R.id.restart:
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                numberOfClick = 0;
                clicks.setText(String.valueOf(numberOfClick));

                List<Integer> solution = new ArrayList<>();
                for (int i = 1; i <= 16; i++) {
                    solution.add(i);
                }
                Collections.shuffle(solution);
                button1.setText(String.valueOf(solution.get(0)));
                button2.setText(String.valueOf(solution.get(1)));
                button3.setText(String.valueOf(solution.get(2)));
                button4.setText(String.valueOf(solution.get(3)));
                button5.setText(String.valueOf(solution.get(4)));
                button6.setText(String.valueOf(solution.get(5)));
                button7.setText(String.valueOf(solution.get(6)));
                button8.setText(String.valueOf(solution.get(7)));
                button9.setText(String.valueOf(solution.get(8)));
                button10.setText(String.valueOf(solution.get(9)));
                button11.setText(String.valueOf(solution.get(10)));
                button12.setText(String.valueOf(solution.get(11)));
                button13.setText(String.valueOf(solution.get(12)));
                button14.setText(String.valueOf(solution.get(13)));
                button15.setText(String.valueOf(solution.get(14)));
                button16.setText(String.valueOf(solution.get(15)));
                break;

            case R.id.button1:
                if (wereEmpty == 2) {
                    button2.setText(String.valueOf(button1.getText()));
                    setBluer(button1);
                    wereEmpty = 1;
                    setWieter(button2);
                } else if (wereEmpty == 5) {
                    button5.setText(String.valueOf(button1.getText()));
                    setBluer(button1);
                    wereEmpty = 1;
                    setWieter(button5);
                }
                break;
            case R.id.button2:
                if (wereEmpty == 1) {
                    button1.setText(String.valueOf(button2.getText()));
                    setBluer(button2);
                    wereEmpty = 2;
                    setWieter(button1);
                } else if (wereEmpty == 3) {
                    button3.setText(String.valueOf(button2.getText()));
                    setBluer(button2);
                    wereEmpty = 2;
                    setWieter(button3);
                } else if (wereEmpty == 6) {
                    button6.setText(String.valueOf(button2.getText()));
                    setBluer(button2);
                    wereEmpty = 2;
                    setWieter(button6);
                }
                break;
            case R.id.button3:
                if (wereEmpty == 2) {
                    button2.setText(String.valueOf(button3.getText()));
                    setBluer(button3);
                    wereEmpty = 3;
                    setWieter(button2);
                } else if (wereEmpty == 4) {
                    button4.setText(String.valueOf(button3.getText()));
                    setBluer(button3);
                    wereEmpty = 3;
                    setWieter(button4);
                } else if (wereEmpty == 7) {
                    button7.setText(String.valueOf(button3.getText()));
                    setBluer(button3);
                    wereEmpty = 3;
                    setWieter(button7);
                }
                break;
            case R.id.button4:
                if (wereEmpty == 3) {
                    button3.setText(String.valueOf(button4.getText()));
                    setBluer(button4);
                    wereEmpty = 4;
                    setWieter(button3);
                } else if (wereEmpty == 8) {
                    button8.setText(String.valueOf(button4.getText()));
                    setBluer(button4);
                    wereEmpty = 4;
                    setWieter(button8);
                }
                break;

            case R.id.button5:
                if (wereEmpty == 1) {
                    button1.setText(String.valueOf(button5.getText()));
                    setBluer(button5);
                    wereEmpty = 5;
                    setWieter(button1);
                } else if (wereEmpty == 6) {
                    button6.setText(String.valueOf(button5.getText()));
                    setBluer(button5);
                    wereEmpty = 5;
                    setWieter(button6);
                } else if (wereEmpty == 9) {
                    button9.setText(String.valueOf(button5.getText()));
                    setBluer(button5);
                    wereEmpty = 5;
                    setWieter(button9);
                }
                break;
            case R.id.button6:
                if (wereEmpty == 2) {
                    button2.setText(String.valueOf(button6.getText()));
                    setBluer(button6);
                    wereEmpty = 6;
                    setWieter(button2);
                } else if (wereEmpty == 5) {
                    button5.setText(String.valueOf(button6.getText()));
                    setBluer(button6);
                    wereEmpty = 6;
                    setWieter(button5);
                } else if (wereEmpty == 7) {
                    button7.setText(String.valueOf(button6.getText()));
                    setBluer(button6);
                    wereEmpty = 6;
                    setWieter(button7);
                } else if (wereEmpty == 10) {
                    button10.setText(String.valueOf(button6.getText()));
                    setBluer(button6);
                    wereEmpty = 6;
                    setWieter(button10);
                }
                break;
            case R.id.button7:
                if (wereEmpty == 3) {
                    button3.setText(String.valueOf(button7.getText()));
                    setBluer(button7);
                    wereEmpty = 7;
                    setWieter(button3);
                } else if (wereEmpty == 6) {
                    button6.setText(String.valueOf(button7.getText()));
                    setBluer(button7);
                    wereEmpty = 7;
                    setWieter(button6);
                } else if (wereEmpty == 8) {
                    button8.setText(String.valueOf(button7.getText()));
                    setBluer(button7);
                    wereEmpty = 7;
                    setWieter(button8);
                } else if (wereEmpty == 11) {
                    button11.setText(String.valueOf(button7.getText()));
                    setBluer(button7);
                    wereEmpty = 7;
                    setWieter(button11);
                }
                break;
            case R.id.button8:
                if (wereEmpty == 4) {
                    button4.setText(String.valueOf(button8.getText()));
                    setBluer(button8);
                    wereEmpty = 8;
                    setWieter(button4);
                } else if (wereEmpty == 7) {
                    button7.setText(String.valueOf(button8.getText()));
                    setBluer(button8);
                    wereEmpty = 8;
                    setWieter(button7);
                } else if (wereEmpty == 12) {
                    button12.setText(String.valueOf(button8.getText()));
                    setBluer(button8);
                    wereEmpty = 8;
                    setWieter(button12);
                }
                break;

            case R.id.button9:
                if (wereEmpty == 5) {
                    button5.setText(String.valueOf(button9.getText()));
                    setBluer(button9);
                    wereEmpty = 9;
                    setWieter(button5);
                } else if (wereEmpty == 10) {
                    button10.setText(String.valueOf(button9.getText()));
                    setBluer(button9);
                    wereEmpty = 9;
                    setWieter(button10);
                } else if (wereEmpty == 13) {
                    button13.setText(String.valueOf(button9.getText()));
                    setBluer(button9);
                    wereEmpty = 9;
                    setWieter(button13);
                }
                break;
            case R.id.button10:
                if (wereEmpty == 6) {
                    button6.setText(String.valueOf(button10.getText()));
                    setBluer(button10);
                    wereEmpty = 10;
                    setWieter(button6);
                } else if (wereEmpty == 9) {
                    button9.setText(String.valueOf(button10.getText()));
                    setBluer(button10);
                    wereEmpty = 10;
                    setWieter(button9);
                } else if (wereEmpty == 11) {
                    button11.setText(String.valueOf(button10.getText()));
                    setBluer(button10);
                    wereEmpty = 10;
                    setWieter(button11);
                } else if (wereEmpty == 14) {
                    button14.setText(String.valueOf(button10.getText()));
                    setBluer(button10);
                    wereEmpty = 10;
                    setWieter(button14);
                }
                break;
            case R.id.button11:
                if (wereEmpty == 7) {
                    button7.setText(String.valueOf(button11.getText()));
                    setBluer(button11);
                    wereEmpty = 11;
                    setWieter(button7);
                } else if (wereEmpty == 10) {
                    button10.setText(String.valueOf(button11.getText()));
                    setBluer(button11);
                    wereEmpty = 11;
                    setWieter(button10);
                } else if (wereEmpty == 12) {
                    button12.setText(String.valueOf(button11.getText()));
                    setBluer(button11);
                    wereEmpty = 11;
                    setWieter(button12);
                } else if (wereEmpty == 15) {
                    button15.setText(String.valueOf(button11.getText()));
                    setBluer(button11);
                    wereEmpty = 11;
                    setWieter(button15);
                }
                break;
            case R.id.button12:
                if (wereEmpty == 8) {
                    button8.setText(String.valueOf(button12.getText()));
                    setBluer(button12);
                    wereEmpty = 12;
                    setWieter(button8);
                } else if (wereEmpty == 11) {
                    button11.setText(String.valueOf(button12.getText()));
                    setBluer(button12);
                    wereEmpty = 12;
                    setWieter(button11);
                } else if (wereEmpty == 16) {
                    button16.setText(String.valueOf(button12.getText()));
                    setBluer(button12);
                    wereEmpty = 12;
                    setWieter(button16);
                }
                break;
            case R.id.button13:
                if (wereEmpty == 9) {
                    button9.setText(String.valueOf(button13.getText()));
                    setBluer(button13);
                    wereEmpty = 13;
                    setWieter(button9);
                } else if (wereEmpty == 14) {
                    button14.setText(String.valueOf(button13.getText()));
                    setBluer(button13);
                    wereEmpty = 13;
                    setWieter(button14);
                }
                break;
            case R.id.button14:
                if (wereEmpty == 10) {
                    button10.setText(String.valueOf(button14.getText()));
                    setBluer(button14);
                    wereEmpty = 14;
                    setWieter(button10);
                } else if (wereEmpty == 13) {
                    button13.setText(String.valueOf(button14.getText()));
                    setBluer(button14);
                    wereEmpty = 14;
                    setWieter(button13);
                } else if (wereEmpty == 15) {
                    button15.setText(String.valueOf(button14.getText()));
                    setBluer(button14);
                    wereEmpty = 14;
                    setWieter(button15);
                }
                break;
            case R.id.button15:
                if (wereEmpty == 11) {
                    button11.setText(String.valueOf(button15.getText()));
                    setBluer(button15);
                    wereEmpty = 15;
                    setWieter(button11);
                } else if (wereEmpty == 14) {
                    button14.setText(String.valueOf(button15.getText()));
                    setBluer(button15);
                    wereEmpty = 15;
                    setWieter(button14);
                } else if (wereEmpty == 16) {
                    button16.setText(String.valueOf(button15.getText()));
                    setBluer(button15);
                    wereEmpty = 15;
                    setWieter(button16);
                }
                break;
            case R.id.button16:
                if (wereEmpty == 12) {
                    button12.setText(String.valueOf(button16.getText()));
                    setBluer(button16);
                    wereEmpty = 16;
                    setWieter(button12);
                } else if (wereEmpty == 15) {
                    button15.setText(String.valueOf(button16.getText()));
                    setBluer(button16);
                    wereEmpty = 16;
                    setWieter(button15);
                }
                break;
        }

    }


}