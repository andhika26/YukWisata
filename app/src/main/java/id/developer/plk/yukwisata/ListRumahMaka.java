package id.developer.plk.yukwisata;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ListRumahMaka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_rumah_maka);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //konfigurasi menu toolbar
        getSupportActionBar().setSubtitle("Daftar Rumah Makan");
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);

        CardView fab1 = (CardView) findViewById(R.id.wahyuutama);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListRumahMaka.this, RMWahyuUtama.class);
                ListRumahMaka.this.finish();
                startActivity(intent);
            }
        });

        CardView fab2 = (CardView) findViewById(R.id.bajaklaut);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListRumahMaka.this, RMBajakLaut.class);
                ListRumahMaka.this.finish();
                startActivity(intent);
            }
        });

        CardView fab3 = (CardView) findViewById(R.id.apungrahmawati);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListRumahMaka.this, RMApungRahmawati.class);
                ListRumahMaka.this.finish();
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                kembali();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void kembali() {
        Intent intent = new Intent(ListRumahMaka.this, HomeActivity.class);
        ListRumahMaka.this.finish();
        startActivity(intent);
    }

}
