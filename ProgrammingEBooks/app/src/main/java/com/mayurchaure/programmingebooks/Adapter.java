package com.mayurchaure.programmingebooks;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.mayurchaure.programmingebooks.PDFShow.PDFActivity;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.PDFViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<PDFModel> productList;

    //getting the context and product list with constructor
    public Adapter(Context mCtx, List<PDFModel> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public PDFViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_products, null);
        return new PDFViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PDFViewHolder holder, final int position) {
        //getting the product of the specified position
        final PDFModel product = productList.get(position);

        //binding the data with the viewholder views

        holder.textViewTitle.setText(product.getTitle());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), PDFActivity.class);
                i.putExtra("title",productList.get(position).getTitle());
                i.putExtra("product",productList.get(position).getTitle());
                i.putExtra("link",productList.get(position).getLink());
                mCtx.startActivity(i);

            }
        });
    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class PDFViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        ImageView imageView;
        CardView cardView;
        public PDFViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);// card intial
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}