package com.peterwachira.wazinsureapiclient.UI;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.peterwachira.wazinsureapiclient.R;
import com.peterwachira.wazinsureapiclient.service.PostService;
import java.io.IOException;
import butterknife.BindView;
import butterknife.ButterKnife;
public class LoginActivity extends AppCompatActivity {
    public  String status="";
    @BindView(R.id.username)
    EditText _usernameText;
    @BindView(R.id.password)
    EditText _passwordText;
    @BindView(R.id.btn_login)
    Button _loginButton;
    @BindView(R.id.link_signup)
    TextView _signupLink;
    Context context =this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        _signupLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        _loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    try {
                        userSignin();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void userSignin() throws IOException, InterruptedException {
        String user_name = _usernameText.getText().toString();
        String password = _passwordText.getText().toString();
        PostService postService = new PostService();
        postService.login(user_name, password);
    }
}