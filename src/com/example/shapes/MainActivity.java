package com.example.shapes;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {
	ShapeView shapeview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public class ShapeView extends View{

	public ShapeView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
}
   
    
}
