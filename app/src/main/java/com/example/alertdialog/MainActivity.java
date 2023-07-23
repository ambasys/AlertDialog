package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alert=findViewById(R.id.button);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog();
            }
        });
    }

    private void alertDialog() {
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("test for alert");
        alert.setIcon(android.R.drawable.sym_def_app_icon);
        alert.setMessage("choose your option");
        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"positive button is pressed",Toast.LENGTH_SHORT).show();

            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"negative button is pressed",Toast.LENGTH_SHORT).show();
            }
        });
        alert.setNeutralButton("neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.dismiss();
            }
        });
        alert.create().show();
    }
}
