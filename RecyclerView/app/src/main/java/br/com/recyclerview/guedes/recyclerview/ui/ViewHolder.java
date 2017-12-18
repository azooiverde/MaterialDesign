package br.com.recyclerview.guedes.recyclerview.ui;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.recyclerview.guedes.recyclerview.R;

/**
 * Created by azooiverde on 18/12/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView img_destaque;
    public TextView title;
    public TextView describle;
    public AppCompatButton btn_link;

    public ViewHolder(View itemView) {
        super(itemView);

        this.img_destaque = itemView.findViewById(R.id.img_destaque);
        this.title        = itemView.findViewById(R.id.title);
        this.describle    = itemView.findViewById(R.id.describle);
        this.btn_link     = itemView.findViewById(R.id.btn_link);

    }
}
