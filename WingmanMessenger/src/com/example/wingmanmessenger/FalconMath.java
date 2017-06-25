package com.example.wingmanmessenger;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class FalconMath extends ActionBarActivity {
	TextView disp;
	ImageView captainfalconsmart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_falcon_math);
        disp=(TextView)findViewById(R.id.textView1);
        disp.setText("0");
    	captainfalconsmart = (ImageView) findViewById(R.id.falconsmart);
    	captainfalconsmart.setImageResource(R.drawable.flatsmartfalcon);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.falcon_math, menu);
		return true;
	}
	
	 static int accumulator=0;
	    static boolean isempty=true;
	    static short operationToDo=0;
	    public void clear_Clicked(View sender)
	    {
	    	disp.setText("0");
	    	accumulator=0;
	    }
	    public void op_Clicked(View sender) 
	    {
	    	if(isempty){
	    		disp.setText("Be cool man, I'm working on it...");
	    		
	    		return;
	    	}
	  
	    	else {
	    	Button bt=(Button)sender;
	    	switch (operationToDo)
	    	{
	    	case 0:
	    		accumulator+=Integer.parseInt(disp.getText().toString());
	    		isempty=true;
	    	break;
	    	case 1:
	    		accumulator-=Integer.parseInt(disp.getText().toString());
	    		isempty=true;
	    	break;
	    	case 2:
	    		accumulator/=Integer.parseInt(disp.getText().toString());
	    		isempty=true;
	    	break;
	    	case 3:
	    		accumulator*=Integer.parseInt(disp.getText().toString());
	    		isempty=true;
	    	break;
	    	case 4:
	    		//notice that now, isempty is assigned to all parses but equals
	    		//This is how you do an equal sign
	    		//parsing pulls string text into integer values
	    		accumulator=Integer.parseInt(disp.getText().toString());
	    		isempty=true;
	    		//changing isempty to false
	    	break;
	    	}
	    	disp.setText(Integer.toString(accumulator));
	    	if(bt.getText().toString().equals("+")) operationToDo=0;
	    	if(bt.getText().toString().equals("-")) operationToDo=1;
	    	if(bt.getText().toString().equals("/")) operationToDo=2;
	    	if(bt.getText().toString().equals("*")) operationToDo=3;
	    	if(bt.getText().toString().equals("=")) operationToDo=4;
	    	}
	    }

	    public void num_Clicked(View sender)
	    {
	    	
	    	Button bt=(Button)sender;
	    	if(disp.getText().length()>7)return;
	    	if(isempty)
	    	{

	    		if(bt.getText().toString().equals("0"))return;
	    		disp.setText(bt.getText());	
	    		isempty=false;
	    	}
	    	else {
	    	
	    	disp.append(bt.getText());
	    	}
	    	
	    }
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {

	}

}
}
