package com.masai.a8july_recycler_2_we1;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private ImageView mTvStudentImg;
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mtvDob;
    private TextView mTvAddress;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;

    public StudentViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvStudentImg = itemView.findViewById(R.id.ivStudentImag);
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvAddress = itemView.findViewById(R.id.tvAddress);
        mtvDob = itemView.findViewById(R.id.tvDob);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);
    }

    public void setData(StudentModel studentModel) {
        mTvStudentImg.setImageResource(studentModel.getImageId());
        mTvName.setText(studentModel.getName());
        mTvAge.setText(studentModel.getAge() + "");
        mtvDob.setText(studentModel.getDob());
        mTvAddress.setText(studentModel.getAddress());

        relativeLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(studentModel, getAdapterPosition());

            }
        });
    }
}
