package com.example.georgedominic.learn;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.georgedominic.learn.LoginActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Account extends AppCompatActivity{
 TextView name;
 TextView email;
 Button login;
 Button verify;
 Button logout;

    private static final String TAG = "Account";
    private FirebaseAuth mAuth;
    //FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        name=findViewById(R.id.name);
        name.setText("Name : "+user.getDisplayName());

        email=findViewById(R.id.email);
        email.setText("E-mail : "+user.getEmail());

        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Account.this, LoginActivity.class);
                startActivity(i);

            }
        });
     final LoginActivity  loginActivity = new LoginActivity();
        verify=findViewById(R.id.verify);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               loginActivity.sendEmailVerification();
            }
        });

        logout=findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(Account.this, LoginActivity.class);
                startActivity(i);

                //loginActivity.signOut();
            }
        });

    }

}
