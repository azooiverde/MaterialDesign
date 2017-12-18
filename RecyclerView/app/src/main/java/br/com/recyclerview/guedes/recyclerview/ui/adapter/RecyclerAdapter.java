package br.com.recyclerview.guedes.recyclerview.ui.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pkmmte.pkrss.Article;

import java.util.List;

import br.com.recyclerview.guedes.recyclerview.R;
import br.com.recyclerview.guedes.recyclerview.ui.ViewHolder;
import br.com.recyclerview.guedes.recyclerview.ui.config.DownloadImageTask;

/**
 * Created by azooiverde on 18/12/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<Article> list;

    public RecyclerAdapter(List<Article> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Article article = list.get(position);

        holder.title.setText(article.getTitle());
        holder.describle.setText(article.getDescription());
        new DownloadImageTask(holder.img_destaque).execute(article.getEnclosure().getUrl());
        holder.btn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, article.getSource());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
