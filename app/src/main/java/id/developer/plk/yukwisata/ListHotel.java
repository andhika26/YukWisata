package id.developer.plk.yukwisata;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class ListHotel extends AppCompatActivity {

    WebView mainWebView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_hotel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        getSupportActionBar().setSubtitle("Daftar Nama Hotel");
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);


        CardView fab1 = (CardView) findViewById(R.id.mustika);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListHotel.this, HotelMustika.class);
                ListHotel.this.finish();
                startActivity(intent);
            }
        });

        CardView fab2 = (CardView) findViewById(R.id.irwan);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListHotel.this, HotelIrwan.class);
                ListHotel.this.finish();
                startActivity(intent);
            }
        });

        CardView fab3 = (CardView) findViewById(R.id.ratna);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListHotel.this, HotelRatna.class);
                ListHotel.this.finish();
                startActivity(intent);
            }
        });


        CardView fab4 = (CardView) findViewById(R.id.balirich);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListHotel.this, HotelBaliRich2.class);
                ListHotel.this.finish();
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
        Intent intent = new Intent(ListHotel.this, HomeActivity.class);
        ListHotel.this.finish();
        startActivity(intent);
    }


}
