package com.example.learning.helloconstraint;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    //When the TOAST button is clicked, show a toast
    public void showToast(View view) {
        //What happens when user clicks on the button_count Button goes here.
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context,getString(R.string.toast_message), Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view){
        //What happens when user clicks on the button_toast Button goes here.
        this.mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
