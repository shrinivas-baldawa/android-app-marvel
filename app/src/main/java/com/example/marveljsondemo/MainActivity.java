package com.example.marveljsondemo;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Timestamp;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    long timeStamp = System.currentTimeMillis();
    String privateKey = "602d4c0dcdc3b721cd6fa16b82dba0481b0aeff9";
    String publicKey = "297c8495b7c9134b33ece235850bbcc0";
    String marvelHash = timeStamp + privateKey + publicKey;
    String hash = DigestUtils.md5Hex(marvelHash);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listitem);
        getUsers();
    }

    private void getUsers() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RestApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RestApi marvelAPI = retrofit.create(RestApi.class);

        Call<List<Users>> call = marvelAPI.getUsers(timeStamp, publicKey, hash);
        call.enqueue(new Callback<List<Users>>() {
            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                List<Users> users = response.body();
                String[] heroes = new String[users.size()];
                for (int i=0;i<users.size();i++){
                    heroes[i] = users.get(i).getName();
                    heroes[i] = users.get(i).getDesp();
                }
                listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,heroes));
            }

            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
