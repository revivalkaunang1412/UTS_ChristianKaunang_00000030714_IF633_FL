package umn.ac.a00030714_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public EditText username, password;
    public Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btnlogin);


        btnlogin.setOnClickListener(this);
    }

    @Override

    public void onClick(View view) {
        if (view.getId() == R.id.btnlogin){
            String ambilUsername = username.getText().toString().trim();
            String ambilPassword = password.getText().toString().trim();

            if (ambilUsername.equals("uasmobile") && ambilPassword.equals("uasmobilegenap")){
                Toast.makeText(this, "Selamat Datang, Christian RH Kaunang 00000030714", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Daftarlagu.class);
                startActivity(intent);

            } else {
                Toast.makeText(this, "Username atau Password yang anda masukkan salah!!!", Toast.LENGTH_SHORT).show();
            }

        }
    }

    public void intent (View view)
    {
        Intent i = new Intent(MainActivity.this, Profile.class);
        startActivity(i);
    }
}