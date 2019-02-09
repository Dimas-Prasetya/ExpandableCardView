package com.samid.expandablecardview;

import android.animation.LayoutTransition;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class MyViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    private View body;

    MyViewHolder(View itemView) {
        super(itemView);

        this.title = itemView.findViewById(R.id.title);
        final View toggle = itemView.findViewById(R.id.toggle);
        this.body = itemView.findViewById(R.id.body);

        final CardView card = itemView.findViewById(R.id.card);
        card.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        toggle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (body.getVisibility() == View.GONE) {
                    toggle.animate().rotation(180).start();
                    body.setVisibility(View.VISIBLE);
                } else {
                    toggle.animate().rotation(0).start();
                    body.setVisibility(View.GONE);
                }
            }
        });


    }
}