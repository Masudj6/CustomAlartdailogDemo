package com.example.mdmaud.customalartdailogdemo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        //create object alart dailoge.......
        final AlertDialog.Builder alertdailog=new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater=LayoutInflater.from(this);

        //custom layout inflate .......
        final View inflate=inflater.inflate(R.layout.custom,null);
        alertdailog.setView(inflate);

        //create alertdialog.....
        final  AlertDialog alt=alertdailog.create();

        final  EditText email=inflate.findViewById(R.id.email);
        final  EditText passward=inflate.findViewById(R.id.password);
        final  Button login=inflate.findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=email.getText().toString();
                String value2=passward.getText().toString();
                Toast.makeText(MainActivity.this,value+value2 +"show", Toast.LENGTH_SHORT).show();

                //dialoge dismiss koredibe button click er por
                alt.dismiss();
            }
        });



        alt.show();

    }
}
