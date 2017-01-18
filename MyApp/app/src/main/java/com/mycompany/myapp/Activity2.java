package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.widget.*;
import android.animation.*;
import android.support.v4.app.FragmentActivity;

public class Activity2 extends FragmentActivity
{
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submain);
		
		Intent intent = getIntent();
		
		String name=intent.getStringExtra(MainActivity.Data);
		
		TextView text = new TextView(this);
		
		text.setTextSize(40);
		text.setText(name);
		
		ViewGroup vg = (ViewGroup)findViewById(R.id.submainLinearLayout);
		vg.addView(text);
    }
}
