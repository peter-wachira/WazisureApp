package com.peterwachira.wazinsureapiclient.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.peterwachira.wazinsureapiclient.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegistrationActivity extends AppCompatActivity {
    @BindView(R.id.fullname)
    EditText _fullnameText;
    @BindView(R.id.id_no)
    EditText _idnoText;
    @BindView(R.id.mobile_no)
    EditText _mobilenoText;
    @BindView(R.id.profileurl)
    EditText _profileurlText;
    @BindView(R.id.email)
    EditText _emailText;
    @BindView(R.id.username)
    EditText _usernameText;
    @BindView(R.id.password)
    EditText _passwordText;
    @BindView(R.id.btn_register)
    Button _registerButton;
    @BindView(R.id.link_signin)
    TextView _signinLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        ButterKnife.bind(this);


        _signinLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}
