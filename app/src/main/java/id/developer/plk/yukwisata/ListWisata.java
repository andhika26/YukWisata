package id.developer.plk.yukwisata;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ListWisata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_wisata);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //konfigurasi menu toolbar
        getSupportActionBar().setSubtitle("Daftar Wisata");
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);

        CardView fab2 = (CardView) findViewById(R.id.nglirip);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListWisata.this, Nglirip.class);
                ListWisata.this.finish();
                startActivity(intent);
            }
        });


        CardView fab4 = (CardView) findViewById(R.id.bejagungkidul);
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListWisata.this, MakamBejagungKidul.class);
                ListWisata.this.finish();
                startActivity(intent);
            }
        });

        CardView fab5 = (CardView) findViewById(R.id.asmoroqondi);
        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListWisata.this, MakamAsmoroqondi.class);
                ListWisata.this.finish();
                startActivity(intent);
            }
        });

        CardView fab6 = (CardView) findViewById(R.id.museumkambangputih);
        fab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListWisata.this, MuseumKambangPutih.class);
                ListWisata.this.finish();
                startActivity(intent);
            }
        });


        CardView fab7 = (CardView) findViewById(R.id.perataan);
        fab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListWisata.this, Perataan.class);
                ListWisata.this.finish();
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
        Intent intent = new Intent(ListWisata.this, HomeActivity.class);
        ListWisata.this.finish();
        startActivity(intent);
    }

}
