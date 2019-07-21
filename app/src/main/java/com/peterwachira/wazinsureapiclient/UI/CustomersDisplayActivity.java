package com.peterwachira.wazinsureapiclient.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.peterwachira.wazinsureapiclient.R;
import com.peterwachira.wazinsureapiclient.adapters.CustomerListAdapter;
import com.peterwachira.wazinsureapiclient.models.Customers;
import com.peterwachira.wazinsureapiclient.service.RetrievalService;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class CustomersDisplayActivity extends AppCompatActivity {

    public static final String TAG = CustomersDisplayActivity.class.getSimpleName();
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    private CustomerListAdapter mAdapter;
    public ArrayList<Customers> mCustomers =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toast.makeText(CustomersDisplayActivity.this,"Finding Customer...", Toast.LENGTH_LONG).show();
        getAllCustomers();
    }

    private void getAllCustomers() {
        final RetrievalService getService = new RetrievalService();
        getService.allCustomers(new Callback(){
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                getService.processResults(response);
            }
        });
    }


}
