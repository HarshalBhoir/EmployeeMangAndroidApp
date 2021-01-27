package com.example.employeemanagement;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter <EmployeeAdapter.ViewHolder> {


    public  static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView fname,lname;
        private ImageView myimg;
        private Button btn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fname = itemView.findViewById(R.id.fname);
            lname = itemView.findViewById(R.id.lname);
            btn = itemView.findViewById(R.id.more);
            myimg = itemView.findViewById(R.id.myimg);
        }
    }

    private Context context;
    private List<Employee> Employees;
    public EmployeeAdapter (Context c , List<Employee> EmployeesList){
        this.context = c;
        this.Employees = EmployeesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_ligne,parent,false);
        return new ViewHolder(v);    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Employee p = Employees.get(position);
        holder.fname.setText(p.getLname());
        holder.lname.setText(p.getFname());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, EditEmployeeActivity.class);
                i.putExtra("eid", p.getLname());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Employees.size();
    }

}
