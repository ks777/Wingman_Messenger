package com.example.wingmanmessenger;

import java.util.Random;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	static Intent webintent;
	static Random randomgenerator = new Random();
	static Random falconrandom = new Random();
	static int therandom;
	EditText test;
	static TextView test1;
	String teststring;
	String[] condition = {
			"hello", //0
			"pizza", //1
			"condoms", //2
			"pickup", //3
			"drunk", 
			"wasted", 
			"plastered", 
			"destroyed", //4, 5, 6, 7
			"high", 
			"stoned", 
			"tripping", //8, 9, 10
			"math", 
			"calculator", 
			"times", 
			"plus", 
			"minus", 
			"*", 
			"+", 
			"-", 
			"/", //11-19
			"joke", //20
			"laugh", //21
			"fap", "porn", "jackoff", "horny", //22, 23, 24, 25
			"developer", "Papili", //26, 27
			"ass", "fuck", "shit", "bitch", "cunt", //28, 29, 30, 31, 32
			"girl" //33
			
			
	};
	ImageView captainfalcon;
	String words[];
	char stringarray[];
	int length;
	static int k;
	static MediaPlayer song1, song2, song3, song4;

	static class theclass {
		public static void player() {
			song1.start();
			
		}
		 static void returns() {
			 therandom = randomgenerator.nextInt(3);
			if(k == 0) {
				if(therandom == 0){
					test1.setText("CAPTAIN FALCON HERE");	
				}
				else if(therandom == 1){
					test1.setText("SHOW ME YOUR MOVES!");
				}
				else if(therandom == 2){
					test1.setText("BRO LET'S BRO ALREADY");
				}
		
			}
			else if(k == 1){
				if(therandom == 0){
					test1.setText("FOUND YOU SOME PIZZA BRO CAUSE I HEAR YOUR GIRL LIKES PIZZA");	
				}
				else if(therandom == 1){
					test1.setText("WOMEN LOVE PIZZA LETS GET PIZZA");
				}
				else if(therandom == 2){
					test1.setText("YOU'RE SO RIGHT. WE NEED PIZZA");
				}

			}
			else if(k == 2){
				if(therandom == 0){
					test1.setText("WHO USES THOSE ANYMORE? FINE... I FOUND YOU SOME.");	
				}
				else if(therandom == 1){
					test1.setText("FOUND YOU SOME DONG-BAGS BRO");
				}
				else if(therandom == 2){
					test1.setText("WHAT DO YOU HAVE AGAINST CHILDREN? FOUND YOU CONDOMS ANYWAY.");
				}
			}
			else if(k == 3){
				if(therandom == 0){
					test1.setText("I lost my number, can I have yours?");
				}
				else if(therandom == 1) {
					test1.setText("DID IT HURT WHEN YOU FELL FROM HEAVEN, BECAUSE YEESSSZZZ");
				}
				else if(therandom == 2) {
					test1.setText("TELL HER SHE LOOKS SHITTY, THEN PRETEND YOU SAID PRETTY AND SHE MISHEARD YOU.");
				}
			}
			else if(k == 4 || k == 5 || k == 6 || k == 7){
				test1.setText("JUST LIQUID CONFIDENCE BRO, ASK HER IF SHE WANTS KIDS");
			}
			else if(k == 8 || k == 9 || k == 10){
				test1.setText("FOUND YOU SOME MUNCHIES BRO");
			}

			else if(k == 20 || k == 21) {
					if(therandom == 0){
					test1.setText("Art Majors");
					}
					else if(therandom == 1){ 
					test1.setText("WHY COULDN'T THE BICYCLE STAND ON ITS OWN..?" +
							"... BECAUSE IT WAS TWO TIRED!");
					}
					else if(therandom == 2) {
					test1.setText("This app");			
					}
			}
			else if(k == 28 || k == 29 || k == 30 || k == 31 || k == 32){
				test1.setText("WATCH THE LANGUAGE, BRO");
			}
			else return;

		}
	
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		test = (EditText) findViewById(R.id.testedit);
		test1 = (TextView) findViewById(R.id.testtextview);
    	captainfalcon = (ImageView) findViewById(R.id.background);
    	captainfalcon.setImageResource(R.drawable.falconanimate);
    	AnimationDrawable ballAnimation = (AnimationDrawable) captainfalcon.getDrawable();
    	if(ballAnimation.isRunning()){
    		ballAnimation.stop();
    	}
    	ballAnimation.start();
    

    	song1 = MediaPlayer.create(this,  R.raw.yes);
	}
	private void animatecaptain() {
		captainfalcon = (ImageView) findViewById(R.id.background);
    	captainfalcon.setImageResource(R.drawable.falconanimate);
    	AnimationDrawable ballAnimation = (AnimationDrawable) captainfalcon.getDrawable();
    	if(ballAnimation.isRunning()){
    		ballAnimation.stop();
    	}
    	ballAnimation.start();
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void stringchecker(View Sender) {
		k = 0;
		teststring = test.getText().toString();
		length = strlen(teststring);
		words = teststring.split(" ");
//a working for loop that checks for a keyword condition
			for(int i = 0; i<words.length; i++) {
				for(int q = 0; q<condition.length; q++)	{

					if(words[i].equals(condition[q])) {
							if(k == 10 || k == 11 || k == 12 || k == 13 || k == 14 || k == 15 || k == 16 || k == 17 || k == 18 || k == 19  ){						
						    	startActivity(new Intent(getApplicationContext(), FalconMath.class));					    	
							}
							else if(k == 22 || k == 23 || k == 24 || k == 25){
								Uri webpage = Uri.parse("http://jesuschrist.lds.org/SonOfGod?lang=eng");
						    	webintent = new Intent(Intent.ACTION_VIEW, webpage);
						    	startActivity(webintent);
						    	test1.setText("YESZ");
							}
							else if(k == 26 || k == 27) {
								Uri number = Uri.parse("tel:9088921990");
								Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
								startActivity(callIntent);
							}
							else if(k == 33) {
						    	startActivity(new Intent(getApplicationContext(), FalconLove.class));
						    	break; //possibly deleteee?
							}

								theclass.returns();	
					}

							k++;
						}
					k=0;
					}

				
			song1.start();
			animatecaptain();
			}
	private int strlen(String teststring2) {
		// TODO Auto-generated method stub
		return 0;
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

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
