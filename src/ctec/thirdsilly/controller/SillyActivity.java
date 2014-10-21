package ctec.thirdsilly.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class SillyActivity extends Activity
{
	private Button firstScreenButton;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		firstScreenButton = (Button) findViewById(R.id.firstScreenButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		firstScreenButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentView)
			{
				Intent otherScreenIntent = new Intent(currentView.getContext(), SecondScreenActivity.class);
				startActivityForResult(otherScreenIntent, 0);
			}
		});
	}
}
