package com.coolweather.android.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.coolweather.android.R;

/**
 * Created by xlj on 10/22/2017.
 */

public class PopMenu extends PopupWindow {

    private Context mContext;

    private View view;

    private LinearLayout menuLayout;

    public PopMenu(Context context) {
        super(context);

        mContext = context;
        view = LayoutInflater.from(context).inflate(R.layout.pop_menu,null);

        this.setContentView(view);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setHeight(RelativeLayout.LayoutParams.WRAP_CONTENT);
        setFocusable(true);
        setOutsideTouchable(true);

        this.view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int height = view.findViewById(R.id.menu_layout).getTop();

                int y = (int) event.getY();
                if (event.getAction() == MotionEvent.ACTION_UP)
                {
                    if (y < height)
                    {
                        dismiss();
                    }
                }

                return true;
            }
        });

        this.setAnimationStyle(R.style.pop_menu_style);
        menuLayout = (LinearLayout) view.findViewById(R.id.menu_layout);

    }

    public void clearMenus()
    {
        menuLayout.removeAllViews();
    }

    public void addMenu(int iconId , String name , View.OnClickListener listener)
    {
        View menuItem = LayoutInflater.from(mContext).inflate(R.layout.item_menu,menuLayout,false);
        ImageView iconMg = (ImageView) menuItem.findViewById(R.id.icon);
        TextView menuTV = (TextView) menuItem.findViewById(R.id.menu_name);
        iconMg.setImageResource(iconId);
        menuTV.setText(name);
        menuItem.setOnClickListener(listener);
        menuLayout.addView(menuItem);
    }

}
