package com.example.rubyesgi.tpcalculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
Activity :  1
Fragment : 2
- HistoryFragment
- PadFragment

PadFragment -> Activity -> HistoryFragment

PadEvent (Interface):
- clickedOnNumber(int nb)
- clickedOnOperation(Operation op)
- delete()
- clearAll()

HistoryEvent (Interface):
- append(String text)
- newLine()
- deleteLastChar()
- clearAll()

CalculusOperation:
- exec(int a, int b): int
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
