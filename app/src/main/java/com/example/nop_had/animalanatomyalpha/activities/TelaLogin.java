package com.example.nop_had.animalanatomyalpha.activities;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nop_had.animalanatomyalpha.R;

public class TelaLogin extends AppCompatActivity {

    private EditText edtlogin;
    private EditText edtsenha;
    private TextView txt;
    private Button btnLogin;
    private Button btnRegistrar01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        edtlogin = (EditText)findViewById(R.id.boxlogin);
        edtsenha = (EditText)findViewById(R.id.boxpass);
        btnLogin = (Button) findViewById(R.id.btnentrar);
        btnRegistrar01 = (Button) findViewById(R.id.btnregistro);

    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnentrar :{
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    if((edtlogin.getText().toString().equals("root")&&(edtsenha.getText().toString().equals("a123456")))){
                        break;//código para abrir nova activity
                    }else {
                        edtlogin.setText("algo deu errado mano");//msg de erro
                    }
                    break;
                }else{
                    Toast.makeText(getApplicationContext(), "Não há conexção com a internet", Toast.LENGTH_LONG).show();
                }
            }

            case R.id.btnregistro : {
                break;//abrir activity registro
            }
        }
    }
}
