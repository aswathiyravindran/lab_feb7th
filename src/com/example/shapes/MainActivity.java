package com.example.shapes;


import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	
	ShapeView shapeview;
	EditText ed;
	Button r,c,s,t;
	String sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText) findViewById(R.id.ed);
        r=(Button) findViewById(R.id.b1);
        c=(Button) findViewById(R.id.b2);
        s=(Button) findViewById(R.id.b3);
        t=(Button) findViewById(R.id.b4);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="rectangle";
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="circle";
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="square";
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="triangle";
            }
        });
    }
public class ShapeView extends View{

	public ShapeView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
   
    
}
