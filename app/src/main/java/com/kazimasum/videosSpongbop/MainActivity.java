package com.kazimasum.videosSpongbop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity
{
    TextInputLayout t1,t2;

    FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         t1=findViewById(R.id.email);
        t2=findViewById(R.id.pwd);

    }




    public void signup(View view)
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

        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        String Errormess = e.getLocalizedMessage();

                        Toast.makeText(MainActivity.this,Errormess , Toast.LENGTH_SHORT).show();
                    }
                });

         */

        startActivity(new Intent(MainActivity.this,login.class));
        Toast.makeText(this, "Done ✅", Toast.LENGTH_SHORT).show();
    }


}