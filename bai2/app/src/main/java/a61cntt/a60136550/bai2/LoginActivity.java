package a61cntt.a60136550.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button nut = (Button) findViewById(R.id.btnok);
        nut.setOnClickListener(sangHome);
    }
    View.OnClickListener sangHome = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText tk = (EditText) findViewById(R.id.edtusername);
            EditText mk = (EditText) findViewById(R.id.edtpass);
            EditText ml = (EditText) findViewById(R.id.edtemail);
            String user = "phu";
            String pass = "123";
            String mail = "";
            String t = tk.getText().toString();
            String m = mk.getText().toString();
            String e = ml.getText().toString();
            if ((t.equals(user)) && (m.equals(pass)) && (e.equals(mail)==false)){
                Toast.makeText(LoginActivity.this, "Đăng nhập thành công", Toast.LENGTH_LONG).show();
                Intent Home = new Intent(LoginActivity.this, HomeActivity.class);
                Home.putExtra("ten", t);
                startActivity(Home);
            }
            else {
                Toast.makeText(LoginActivity.this, "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
            }
        }
    };
}