package com.kazimasum.videosSpongbop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {

    TextInputLayout t1,t2;

    FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

      t1=(TextInputLayout)findViewById(R.id.email_login);
       t2=(TextInputLayout)findViewById(R.id.pwd_login);



    }

    public void singIn(View view)
    {
/*
        String email=t1.getEditText().getText().toString();
        String password=t2.getEditText().getText().toString();

        if(email.isEmpty()){
            Toast.makeText(this, "Required Email", Toast.LENGTH_SHORT).show();
            return;
        }

        if(password.isEmpty()){
            Toast.makeText(this, "Required password", Toast.LENGTH_SHORT).show();
            return;
        }

        firebaseAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            Intent intent=new Intent(login.this, dashboard.class);
                            startActivity(intent);
                        }
                        else {
                            String Errormess = task.getException().getLocalizedMessage();

                            Toast.makeText(login.this,Errormess , Toast.LENGTH_SHORT).show();
                        }
                    }
                });

 */

        startActivity(new Intent(login.this,dashboard.class));
    }

    public void Register(View view) {

        startActivity(new Intent(login.this,MainActivity.class));
    }



}