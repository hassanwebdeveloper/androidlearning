package com.mycompany.myapp;
import android.app.*;
import android.view.*;
import android.os.*;

public class Test2Frag extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.test2_frag, container,false);
	}
	
}
