package id.developer.plk.yukwisata;


import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import id.developer.plk.yukwisata.R.id;
import id.developer.plk.yukwisata.R.layout;

public class WisataBaruTuban extends AppCompatActivity {

    /*Deklarasi variable*/
    View btn_prataan;
    View btn_museumkambangputih;
    View btn_nglirip;
    View btn_sendangasmoro;
    View btn_asmoroqondi;
    View btn_sowan;
    View btn_bejagung;
    String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri;
    Intent mapIntent;
    String prataan = "-7.0358903,111.8558125"; // koordinat Prataan
    String kambangputih = "-6.8323972,111.6065035"; // koordinat Prataan
    String nglirip = "-6.9681185,111.7915984"; // koordinat Nglirip
    String sendangasmoro = "-6.9943045,112.0632807"; // koordinat SendangAsmoro
    String asmoroqondi = "-6.9055291,112.125519"; // koordinat Asmoroqondi
    String sowan = "-6.7761402,111.7606489"; // koordinat Pantai Sowan
    String bejagung = "-6.9142188,112.0530608"; // koordinat Pantai Sowan
    /*Deklarasi variable*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_wisata_baru_tuban);

        // menyamakan variable pada layout activity_main.xml
        btn_prataan = findViewById(id.btn_prataan);
        // tombol untuk menjalankan navigasi goolge maps intents
        btn_prataan.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + prataan);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataBaruTuban.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });

        // menyamakan variable pada layout activity_main.xml
        btn_museumkambangputih = findViewById(id.btn_museumkambangputih);
        // tombol untuk menjalankan navigasi goolge maps intents
        btn_museumkambangputih.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + kambangputih);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataBaruTuban.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });

        // menyamakan variable pada layout activity_main.xml
        btn_nglirip = findViewById(id.btn_nglirip);
        // tombol untuk menjalankan navigasi goolge maps intents
        btn_nglirip.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + nglirip);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataBaruTuban.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        // menyamakan variable pada layout activity_main.xml
        btn_nglirip = findViewById(id.btn_nglirip);
        // tombol untuk menjalankan navigasi goolge maps intents
        btn_nglirip.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + nglirip);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataBaruTuban.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        // menyamakan variable pada layout activity_main.xml
        btn_sendangasmoro = findViewById(id.btn_sendangasmoro);
        // tombol untuk menjalankan navigasi goolge maps intents
        btn_sendangasmoro.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + sendangasmoro);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataBaruTuban.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        // menyamakan variable pada layout activity_main.xml
        btn_asmoroqondi = findViewById(id.btn_asmoroqondi);
        // tombol untuk menjalankan navigasi goolge maps intents
        btn_asmoroqondi.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + asmoroqondi);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataBaruTuban.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });

        // menyamakan variable pada layout activity_main.xml
        btn_sowan = findViewById(id.btn_sowan);
        // tombol untuk menjalankan navigasi goolge maps intents
        btn_sowan.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + sowan);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataBaruTuban.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });

        // menyamakan variable pada layout activity_main.xml
        btn_bejagung = findViewById(id.btn_bejagung);
        // tombol untuk menjalankan navigasi goolge maps intents
        btn_bejagung.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + bejagung);
                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(WisataBaruTuban.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
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
        Intent intent = new Intent(WisataBaruTuban.this, HomeActivity.class);
        WisataBaruTuban.this.finish();
        startActivity(intent);
    }
}
