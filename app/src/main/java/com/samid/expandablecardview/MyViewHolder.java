package com.samid.expandablecardview;

import android.animation.LayoutTransition;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.samid.expandablecardview.R;

class MyViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    private View body;

    MyViewHolder(View itemView) {
        super(itemView);

        this.title = itemView.findViewById(R.id.title);
        View toggle = itemView.findViewById(R.id.toggle);
        this.body = itemView.findViewById(R.id.body);

        toggle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                body.setVisibility(body.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
            }
        });

        CardView card = itemView.findViewById(R.id.card);
        card.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

    }
}