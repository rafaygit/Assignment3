package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.UsersResponse;
import com.example.myapplication.Apinterface;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.container, fragment1.class, null)
                    .commit();
        }


//
//        Picasso.get().load("https://square.github.io/picasso/static/sample.png").into(imageView);
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://randomuser.me/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        ApiInterface service = retrofit.create(ApiInterface.class);
//        Call<UsersResponse> call = service.getSingleUser();
//        call.enqueue(new Callback<UsersResponse>() {
//            @Override
//            public void onResponse(Call<UsersResponse> call, Response<UsersResponse> response) {
//                Log.v("", response.body().toString());
//                Picasso.get().load(response.body().getResults().get(0).getPicture().getLarge()).into(imageView);
//            }
//            @Override
//            public void onFailure(Call<UsersResponse> call, Throwable t) {
//                Log.e("", t.getLocalizedMessage());
//            }
//        });

//        Retrofit retrofit = new Retrofit.Builder()
//                .addConverterFactory(GsonConverterFactory.create())
//                .baseUrl("https://randomuser.me/")
//                .build();
//        ApiInterface service = retrofit.create(ApiInterface.class);
//        Call<UsersResponse> call = service.getSingleUser();
//        call.enqueue(new Callback<UsersResponse>() {
//            @Override
//            public void onResponse(Call<UsersResponse> call, Response<UsersResponse> response) {
//                Log.v("", response.body().toString());
//                Picasso.get().load(response.body().getResults().get(0).getPicture().getLarge()).into(imageView);
//            }
//            @Override
//            public void onFailure(Call<UsersResponse> call, Throwable t) {
//                Log.e("", t.getLocalizedMessage());
//            }
//        });
    }

//
//    Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);


    @Override
    protected void onResume() {
        super.onResume();
    }
}