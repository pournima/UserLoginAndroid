package com.pack.login;

import android.R.integer;
import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class UserFormActivity extends Activity {

	TextView Name;
	EditText Address;
	CheckBox chkSinging;
	CheckBox chkDancing;
	CheckBox chkReading;
	RadioButton radioMale;
	RadioButton radioFemale;
	Button buttonDisplay;
	Intent intent;
	String user;
	String userAdd;
	String gender;
	StringBuffer hobbies;
	int flag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

        super.onCreate(savedInstanceState);
        setContentView(R.layout.userform);
        intent=new Intent(UserFormActivity.this,DisplayUserFormActivity.class);
 
    	Name=(TextView)findViewById(R.id.Name);
    	user=getIntent().getExtras().getString("username");
    	Name.setText(user);	
        Address=(EditText)findViewById(R.id.Address);
        radioFemale=(RadioButton) findViewById(R.id.radioFemale);
        radioMale=(RadioButton) findViewById(R.id.radioMale);
        
        chkSinging=(CheckBox) findViewById(R.id.chkSinging);	
		chkDancing=(CheckBox) findViewById(R.id.chkDancing);
		chkReading=(CheckBox) findViewById(R.id.chkReading);
        
		buttonDisplay=(Button) findViewById(R.id.buttonDisplay);
		
		buttonDisplay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if ((Address.getText().toString().equals(""))){
					Toast.makeText(getApplicationContext(),"Please enter user address", Toast.LENGTH_SHORT).show();
				}
				else{
				setValues();
							
				loginClass loginCls=new loginClass(user,userAdd,gender,hobbies.toString());
				intent.putExtra("data",loginCls);
				
				startActivity(intent);
				}
			}
		});
		

		
	}


public void setValues(){
		
		userAdd=Address.getText().toString();
		gender=radioFemale.isChecked()?"Female":"Male";

		hobbies=new StringBuffer();
		if(chkDancing.isChecked()){
			hobbies.append(chkDancing.getText().toString());
			flag=1;		
			
		}
		
		if (chkSinging.isChecked()){
			if(flag==1){
				hobbies.append(",");
			}
			flag=1;
			hobbies.append(chkSinging.getText().toString());
			hobbies.append("");
		}
		if(chkReading.isChecked()){
			if(flag==1){
				hobbies.append(",");
			}
			hobbies.append(chkReading.getText().toString());
			hobbies.append("");
		}
		
}
	
	

}
