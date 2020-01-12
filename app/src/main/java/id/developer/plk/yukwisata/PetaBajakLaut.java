package id.developer.plk.yukwisata;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class PetaBajakLaut extends AppCompatActivity {

    WebView mainWebView = null;

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
        setContentView(R.layout.activity_peta_bajak_laut);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //konfigurasi menu toolbar
        getSupportActionBar().setSubtitle("Cari Rute Antar Wisata");
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);


        if (isOnline()== true)
        {

            mainWebView = (WebView) findViewById(R.id.mainWebView);
            mainWebView.getSettings().setJavaScriptEnabled(true);
            mainWebView.getSettings().setAllowFileAccess(true);
            mainWebView.loadUrl("file:///android_asset/peta/petalesehanbajaklaut.html");
            mainWebView.setWebViewClient(new MainWebViewClient());
            getWindow().setFeatureInt(Window.PROGRESS_VISIBILITY_ON, Window.FEATURE_PROGRESS);
            mainWebView.setWebChromeClient(new WebChromeClient() {

                public void onProgressChanged(WebView view, int progress) {
                    PetaBajakLaut.this.setTitle("Beranda");
                    PetaBajakLaut.this.setProgress(progress * 100);
                    if (progress == 100) {
                        PetaBajakLaut.this.setTitle(view.getTitle());
                    }
                }
            });

        }
        else
        {
            Toast.makeText(getApplicationContext(), "Aplikasi ini Membutuhkan Koneksi Internet dan GPS", Toast.LENGTH_LONG).show();
        }


    }

    private class MainWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Log.i("Log", "loading: " + url);
            view.loadUrl(url);
            return true;
        }


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
        Intent intent = new Intent(PetaBajakLaut.this, HomeActivity.class);
        PetaBajakLaut.this.finish();
        startActivity(intent);
    }

}