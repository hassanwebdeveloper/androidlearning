package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.widget.*;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity 
{
	public final static String Data="data";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
    }
	
	public void SendMessage(View view){
		Intent intent=new Intent(this, Activity2.class);
		
		EditText edit = (EditText)findViewById(R.id.name);
		
		intent.putExtra(Data,edit.getText().toString());
		startActivity(intent);
	}
}
