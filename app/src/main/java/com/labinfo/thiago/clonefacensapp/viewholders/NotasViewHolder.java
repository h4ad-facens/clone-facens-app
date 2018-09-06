package com.labinfo.thiago.clonefacensapp.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.labinfo.thiago.clonefacensapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotasViewHolder extends RecyclerView.ViewHolder  {

    @BindView(R.id.text_course)
    TextView textCourse;

    @BindView(R.id.text_m1)
    TextView textM1;

    @BindView(R.id.text_m2)
    TextView textM2;

    @BindView(R.id.text_sub)
    TextView textSub;

    @BindView(R.id.text_media)
    TextView textMedia;

    public NotasViewHolder(@NonNull View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }

    public void setCourse(String course){
        textCourse.setText(course);
    }

    public void setM1(String m1){
        textM1.setText(m1);
    }

    public void setM2(String m2){
        textM2.setText(m2);
    }

    public void setSub(String sub){
        textSub.setText(sub);
    }

    public void setMedia(String media){
        textMedia.setText(media);
    }

}
