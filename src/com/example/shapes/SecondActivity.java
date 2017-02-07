package com.example.shapes;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity{
	ShapeView shapeview;
	String data,data1;
	int side;
	protected void onCreate(Bundle  savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	shapeview=new ShapeView(this);
	setContentView(shapeview);
	Intent i=getIntent();
	data= i.getStringExtra("username");
	data1=i.getStringExtra("username1");
	side=Integer.parseInt(data1);
	}
	public class ShapeView extends View
	{

		public ShapeView(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		
		
		protected void onDraw(Canvas canvas)
		{
		super.onDraw(canvas);
		 
		// custom drawing code here
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);

		// make the entire canvas white
		paint.setColor(Color.BLACK);
		canvas.drawPaint(paint);

		
		// draw green circle with anti aliasing turned on
		if(data.equals("circle"))
		{
		paint.setAntiAlias(true);
		paint.setColor(Color.BLUE);
		canvas.drawCircle(60, 20, 15, paint);
		}

		// draw red rectangle with anti aliasing turned off
		if(data.equals("rectangle"))
		{
		paint.setAntiAlias(false);
		paint.setColor(Color.MAGENTA);
		canvas.drawRect(100, 5, 200, 30, paint);
		}
		if(data.equals("square"))
		{
		paint.setAntiAlias(false);
		paint.setColor(Color.MAGENTA);
		canvas.drawRect(10, 10, side, side, paint);
		}

	
		
	}	
	}
	
	
}
