package com.techakram.retrofitusingputvalue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder>
{
    private Context mContext;
    private List<Model> modelList;

    public Adapter(Context mContext, List<Model> modelList) {
        this.mContext = mContext;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(mContext).inflate(R.layout.card,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position)
    {
      Model model=modelList.get(position);
      holder.textView1.setText("First Name: "+model.getFname());
      holder.textView2.setText("Last Name: "+model.getLname());
      holder.textView3.setText("Type: "+model.getType());
      holder.textView4.setText("Mobile No: "+model.getNumber());
      holder.textView5.setText("Address:"+model.getAddress());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView1,textView2,textView3,textView4,textView5;
        public AdapterViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView1=itemView.findViewById(R.id.tv1);
            textView2=itemView.findViewById(R.id.tv2);
            textView3=itemView.findViewById(R.id.tv3);
            textView4=itemView.findViewById(R.id.tv4);
            textView5=itemView.findViewById(R.id.tv5);
        }
    }
}
