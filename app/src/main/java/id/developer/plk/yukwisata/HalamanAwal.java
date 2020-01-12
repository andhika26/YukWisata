package id.developer.plk.yukwisata;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

public class HalamanAwal extends AppCompatActivity {



    //method untuk cek koneksi
    public boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        //jika ada koneksi return true
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        }
        //jika tidak ada koneksi return false
        return false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (isOnline()== true)
        {
            Thread logoTimer = new Thread() {
                public void run() {
                    try {
                        sleep(1500);
                    } catch (InterruptedException e) {
                        Log.d("Exception", "Exception" + e);
                    } finally {
                        startActivity(new Intent(HalamanAwal.this, HomeActivity.class));
                    }
                    finish();
                }
            };
            logoTimer.start();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Aplikasi ini Membutuhkan Koneksi Internet dan GPS", Toast.LENGTH_LONG).show();
        }
    }




}
