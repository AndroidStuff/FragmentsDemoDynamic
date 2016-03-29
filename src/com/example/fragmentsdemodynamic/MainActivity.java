package com.example.fragmentsdemodynamic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction().add(R.id.container, new DynamicFragment()).commit();
		}
	}

	public void displayMessage() {
		//Do couple functions like this in your production code unless you've a reason to.
		Toast.makeText(this, "I am invoked by some Fragment code..", Toast.LENGTH_LONG).show();
	}
}
