package com.example.myducument.demogallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ImageGalleryAdapter extends RecyclerView.Adapter<ImageGalleryAdapter.MyViewHolder> {
    private List<HinhAnh> mHinhAnh;
    private Context mContext;

    public ImageGalleryAdapter(Context context, List hinhAnh) {
        mContext = context;
        mHinhAnh = hinhAnh;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View photoView = inflater.inflate(R.layout.demo, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(photoView);
        return viewHolder;
    }


    @Override
    public int getItemCount() {
           return (mHinhAnh.size());
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView mPhotoImageView;

        public MyViewHolder(View itemView) {

            super(itemView);
            mPhotoImageView = itemView.findViewById(R.id.im);

        }
    }
    @Override
    public void onBindViewHolder(ImageGalleryAdapter.MyViewHolder holder, int position) {

        HinhAnh hinhAnh =  mHinhAnh.get(position);
        ImageView imageView = holder.mPhotoImageView;
        Glide.with(mContext)
                .load(hinhAnh.getUrl())
                .into(imageView);
    }


}
