package a61cntt.a60136550.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nut = (Button) findViewById(R.id.btnlogin);
        nut.setOnClickListener(sanglogin);
    }
    View.OnClickListener sanglogin = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent Login = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(Login);
        }
    };
}