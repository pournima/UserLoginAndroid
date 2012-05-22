package com.pack.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayUserFormActivity extends Activity {

	TextView txtdisplayUser;
	TextView txtdisplayAddress;
	TextView txtdisplayGender;
	TextView txtdisplayHobbies;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.displayuserform);
		
		txtdisplayUser=(TextView) findViewById(R.id.displayUser);
		txtdisplayAddress=(TextView) findViewById(R.id.displayAddress);
		txtdisplayGender=(TextView) findViewById(R.id.displayGender);
		txtdisplayHobbies=(TextView) findViewById(R.id.displayHobbies);
		
		loginClass loginClass=getIntent().getExtras().getParcelable("data");
		
		txtdisplayUser.setText(loginClass.getName());
		txtdisplayAddress.setText(loginClass.getAddress());
		txtdisplayGender.setText(loginClass.getGender());
		txtdisplayHobbies.setText(loginClass.getHobbies());
		
//		String displayuser=getIntent().getExtras().getString("username");
//		
//		txtdisplayUser.setText(displayuser);		
//		
		
	}
	
	

}
