package network.aditiya.myviewandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    //Ngenalin Button Menggunakan ButterKnife
    @BindView(R.id.Next)
    Button btnNext;

    //Pindah Intent Menggunakan ButterKnife
    @OnClick(R.id.Next)
    public void lanjut(View view){
        Intent lanjut = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(lanjut);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ngenalin ButterKnife di App
        ButterKnife.bind(this);
    }
}
