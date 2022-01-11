package com.dsa.secondminimumexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.dsa.secondminimumexample.API.Repo;
import com.dsa.secondminimumexample.API.User;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private List<Repo> data;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<Repo> repoList, Context context) {
        this.data = repoList;
        this.mInflater = LayoutInflater.from((Context) context);
        this.context = (Context) context;
    }


    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mInflater.inflate(R.layout.activity_repo_list, null);
        return new ListAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListAdapter.MyViewHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setItems(List<Repo> items){
        data=items;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView repoName;
        TextView repoLanguage;

        MyViewHolder(View itemView){
            super(itemView);
            repoName=itemView.findViewById(R.id.RepoTextView);
            repoLanguage=itemView.findViewById(R.id.LanguageTextView);
        }

        void bindData(final Repo repo){
            repoName.setText(repo.getName());
            repoLanguage.setText(repo.getLanguage());
        }

    }
}
