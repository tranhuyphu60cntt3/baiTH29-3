package a61cntt.a60136550.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent iHome = getIntent();
        TextView textView= (TextView) findViewById(R.id.tvusername);
        textView.setText(String.valueOf(iHome.getStringExtra("ten")));

    }
}