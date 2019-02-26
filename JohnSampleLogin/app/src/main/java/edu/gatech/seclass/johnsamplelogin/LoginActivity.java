package edu.gatech.seclass.johnsamplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView usernameEntry;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEntry = (TextView) findViewById(R.id.usernameEntry);
        loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                loginFunction();
            }
        });
    }

    public void loginFunction(){
        String username = usernameEntry.getText().toString();
        System.out.println("Attempting login with: " + username);
        if(username.equals("John")){
            Toast toast = Toast.makeText(this, "Happy Birthday John.", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            Toast toast = Toast.makeText(this, "Get outta here.", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
