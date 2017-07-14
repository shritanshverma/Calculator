package com.example.calculator;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Cal extends Activity {

	//Defining Variables
	EditText e1,e2,e3;
	int a,b,c;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cal);

	}
	
	public void Add(View v)
	{
		e1=(EditText)findViewById(R.id.editText1);
   	    e2=(EditText)findViewById(R.id.editText2);
   	    e3=(EditText)findViewById(R.id.editText3);
    	
   	    String s1=e1.getText().toString();
	    String s2=e2.getText().toString();

 	   a=Integer.parseInt(s1);
       b=Integer.parseInt(s2);
       
       c=a+b;
       
       String s3=Integer.toString(c);
      
       e3.setText(s3);
      
		
		
	}
	    
	public void Sub(View v)
	{
		e1=(EditText)findViewById(R.id.editText1);
   	    e2=(EditText)findViewById(R.id.editText2);
   	    e3=(EditText)findViewById(R.id.editText3);
    	
   	    String s1=e1.getText().toString();
	    String s2=e2.getText().toString();

 	   a=Integer.parseInt(s1);
       b=Integer.parseInt(s2);
       
       c=a-b;
       
       String s3=Integer.toString(c);
      
       e3.setText(s3);
      
		
		
	}
	
	public void Mul(View v)
	{
		e1=(EditText)findViewById(R.id.editText1);
   	    e2=(EditText)findViewById(R.id.editText2);
   	    e3=(EditText)findViewById(R.id.editText3);
    	
   	    String s1=e1.getText().toString();
	    String s2=e2.getText().toString();

 	   a=Integer.parseInt(s1);
       b=Integer.parseInt(s2);
       
       c=a*b;
       
       String s3=Integer.toString(c);
      
       e3.setText(s3);
      
		
		
	}
	
	public void Div(View v)
	{
		e1=(EditText)findViewById(R.id.editText1);
   	    e2=(EditText)findViewById(R.id.editText2);
   	    e3=(EditText)findViewById(R.id.editText3);
    	
   	    String s1=e1.getText().toString();
	    String s2=e2.getText().toString();

 	   a=Integer.parseInt(s1);
       b=Integer.parseInt(s2);
       
       c=a/b;
       
       String s3=Integer.toString(c);
      
       e3.setText(s3);
      
		
		
	}
	public void Percentage(View v)
	{
		e1=(EditText)findViewById(R.id.editText1);
   	    e2=(EditText)findViewById(R.id.editText2);
   	    e3=(EditText)findViewById(R.id.editText3);
    	
   	    String s1=e1.getText().toString();
	    String s2=e2.getText().toString();

 	   a=Integer.parseInt(s1);
       b=Integer.parseInt(s2);
       
       c=(a*b)/100;
       
       String s3=Integer.toString(c);
      
       e3.setText(s3);
      
		
		
	}


	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cal, menu);
		return true;
	}

}
