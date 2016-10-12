package com.han.ngoc.object_intent;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText mTxtKey;
    private EditText mTxtValue;
    private Button mBtnOk;
    private Button mBtnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTxtKey = (EditText) findViewById(R.id.editTextKey2);
        mTxtValue = (EditText) findViewById(R.id.editTextValue2);
        mBtnOk = (Button) findViewById(R.id.btnOk2);
        mBtnCancel = (Button) findViewById(R.id.btCancel);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bundle");
        final Number number = (Number)bundle.getSerializable("number");
         mBtnOk.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(mTxtValue.getText().toString() != "")
                 {

                     int tong = Integer.parseInt(mTxtValue.getText().toString()) + number.getmValue();
                     AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main2Activity.this);
                     alertDialog.setTitle("Result");
                     alertDialog.setMessage(tong +"");
                     alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i) {
                             dialogInterface.cancel();
                         }
                     });
                     AlertDialog dialog = alertDialog.create();
                     dialog.show();
                 }
             }
         });
        mBtnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Main2Activity.this,MainActivity.class);
                Main2Activity.this.startActivity(intent1);
                finish();
            }
        });
    }
}
