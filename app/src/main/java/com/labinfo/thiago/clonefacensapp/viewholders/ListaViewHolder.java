package com.labinfo.thiago.clonefacensapp.viewholders;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.labinfo.thiago.clonefacensapp.NotasActivity;
import com.labinfo.thiago.clonefacensapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListaViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.text_title)
    TextView textTitle;

    @BindView(R.id.text_message)
    TextView textMessage;

    View view;

    public ListaViewHolder(@NonNull View itemView) {
        super(itemView);
        this.view = itemView;

        ButterKnife.bind(this, itemView);
    }

    @OnClick(R.id.item_portal)
    public void onClickItemPortal(){
        if(textTitle.getText().toString().equals("Notas"))
        {
            view.getContext().startActivity(new Intent(view.getContext(), NotasActivity.class));
        }
    }

    public void setTitle(String title)
    {
        textTitle.setText(title);
    }

    public void setMessage(String message)
    {
        textMessage.setText(message);
    }

}
