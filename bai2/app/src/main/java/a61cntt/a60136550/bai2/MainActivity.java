package a61cntt.a60136550.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenManhinh(View v){
        Intent iManhinhKhac = new Integer( MainActivity.this, SubActivity.class );
        startActivity(iManhinhKhac);
    }

}