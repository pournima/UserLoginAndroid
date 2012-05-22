package com.pack.login;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserLoginAssignmentActivity extends Activity {
	
	EditText txtUserName;
	EditText txtUserPassword;
	Button buttonNext;
	
    /** Called when the activity is first created. */
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
     
        txtUserName=(EditText)findViewById(R.id.userName);
        txtUserPassword=(EditText)findViewById(R.id.userPassword);
        buttonNext=(Button)findViewById(R.id.buttonNext);
       
        buttonNext.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//String name=txtUserName.getText().toString();
				
				if ((txtUserName.getText().toString()).matches("pournima") && (txtUserPassword.getText().toString().matches("gujar"))){
					
					Intent i=new Intent(UserLoginAssignmentActivity.this,UserFormActivity.class);
					i.putExtra("username", txtUserName.getText().toString());
					startActivity(i);
				}
				else{
					Toast.makeText(getApplicationContext(),"Please enter valid user", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
        
        
    }
}