package com.han.ngoc.object_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mTxtKey;
    private EditText mTxtValue;
    private Button mBtnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxtKey = (EditText) findViewById(R.id.editTextKey);
        mTxtValue = (EditText) findViewById(R.id.editTextValue);
        mBtnOk = (Button) findViewById(R.id.btnOk1);
        mBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mTxtKey.getText().toString() !="" && mTxtValue.getText().toString() != ""){
                Number number = new Number(mTxtKey.getText().toString(),Integer.parseInt(mTxtValue.getText().toString()));
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("number",number);
                intent.putExtra("bundle",bundle);
                MainActivity.this.startActivity(intent);
                finish();
                }
            }
        });
    }
}
