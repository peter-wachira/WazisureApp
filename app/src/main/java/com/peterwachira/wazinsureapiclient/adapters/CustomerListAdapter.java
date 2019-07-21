package com.peterwachira.wazinsureapiclient.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.peterwachira.wazinsureapiclient.R;
import com.peterwachira.wazinsureapiclient.models.Customers;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomerListAdapter  extends RecyclerView.Adapter<CustomerListAdapter.CustomerViewHolder> {
    private ArrayList<Customers> mCustomers = new ArrayList<>();

    private Context mContext;



    public  CustomerListAdapter(Context context,ArrayList<Customers> customers){

        mContext =context;
        mCustomers = customers;
    }

    @NonNull
    @Override
    public CustomerListAdapter.CustomerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_list_item, parent, false);

        CustomerListAdapter.CustomerViewHolder viewHolder = new CustomerViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CustomerListAdapter.CustomerViewHolder holder, int position) {
        holder.bindCustomer(mCustomers.get(position));
    }

    @Override
    public int getItemCount() {
        return mCustomers.size();
    }
    public class CustomerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.profileImageView)
        ImageView mCustomerImageView;
        @BindView(R.id.customer_name)
        TextView mCustomerNameTextView;
        @BindView(R.id.customer_id)
        TextView  mCustomerId;
        @BindView(R.id.mobile_no)
        TextView  mCustomerMobileNo;
        @BindView(R.id.email)
        TextView  mCustomerEmail;

        public CustomerViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        public void bindCustomer(Customers customer) {
            mCustomerId.setText(customer.getCustomer_id());
            mCustomerMobileNo.setText(customer.getMobile_no());
            mCustomerEmail.setText(customer.getEmail());
            mCustomerNameTextView.setText(customer.getFirst_name());
        }
        @Override
        public void onClick(View v) {
//            int itemPosition = getLayoutPosition();
//            Intent intent = new Intent(mContext, CustomerDetailActivity.class);
//            intent.putExtra("position", itemPosition);
//            intent.putExtra("games", Parcels.wrap(mCustomers));
//            mContext.startActivity(intent);
        }
    }


}
