package com.mycompany.myapp;
import android.view.View.*;
import android.app.*;
import android.view.*;
import android.os.*;

public class TestFrag extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.test_frag,container,false);
	}
	
}
