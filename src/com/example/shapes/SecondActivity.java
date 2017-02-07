package com.example.shapes;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity{
	ShapeView shapeview;
	protected void onCreate(Bundle  savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.second_activity);
	Intent i=getIntent();
	String data_main= i.getStringExtra("username");
	
	}
	
	public class ShapeView extends View
	{

		public ShapeView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		
	}
	
}
