package com.masai.a8july_recycler_2_we1;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private ArrayList<StudentModel> studentList;
    private ItemClickListener itemClickListener;

    public StudentAdapter(ArrayList<StudentModel> studentList,
                          ItemClickListener itemClickListener) {
        this.studentList = studentList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("Avadhut", "onCreate View holder");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new StudentViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Log.d("Avadhut", "onBind View holder");
        StudentModel studentModel = studentList.get(position);
        holder.setData(studentModel);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
