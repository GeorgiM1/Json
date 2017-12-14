package com.example.android.json;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.json.imagelist.Image;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by pc on 12/7/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHoldeer>{
    Context context;

    List<Image> imageList = new ArrayList<>();
    OnRecycleviewImageClickListener onRecycleviewImageClickListener;

    public void setItems(List<Image> images) {
        imageList =  images;
        notifyDataSetChanged();
    }

    public CustomAdapter(Context _context, OnRecycleviewImageClickListener onRecycleviewImageClickListener1) {
        context = _context;
        onRecycleviewImageClickListener = onRecycleviewImageClickListener1;
    }

    @Override
    public ViewHoldeer onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // inflate the custom layout
        View view = inflater.inflate(R.layout.recycle, parent, false);

        // return a new holder instance
        ViewHoldeer viewHoldeer = new ViewHoldeer(view);
        return viewHoldeer;
    }

    @Override
    public void onBindViewHolder(ViewHoldeer holder, int position) {
        // Get the data model based on position
        final Image image = imageList.get(position);
        holder.textView.setText(image.getTags());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRecycleviewImageClickListener.onRowClick(image);
            }
        });
        Picasso.with(context).load(image.getPreviewURL()).centerCrop().fit().into(holder.imageView);

    }

    //Return total count of items in the list
    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class ViewHoldeer extends RecyclerView.ViewHolder{
        @BindView(R.id.imageView)
        ImageView imageView;
        @BindView(R.id.textView)
        TextView textView;
        public ViewHoldeer(View itemView) {
            super(itemView);
           ButterKnife.bind(this, itemView);

        }
    }
}
