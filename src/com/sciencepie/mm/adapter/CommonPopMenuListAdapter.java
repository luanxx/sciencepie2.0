package com.sciencepie.mm.adapter;

import java.util.List;
import java.util.Map;

import com.sciencepie.mm.R;
import com.sciencepie.mm.util.Resource;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CommonPopMenuListAdapter extends BaseAdapter {

	private List<Resource> res_list;
	private Context context;
	
	public CommonPopMenuListAdapter(Context context){
		this.context = context;
	}
	
	public CommonPopMenuListAdapter(Context context,List<Resource> subject_list){
		this.context = context;
		this.res_list = subject_list;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		if(res_list != null)
			return res_list.size();
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return res_list.get(position);
	}

	@Override
	public long getItemId(int id) {
		// TODO Auto-generated method stub
		return id;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		// TODO Auto-generated method stub
		LinearLayout layout = new LinearLayout(context);
		
		
		if(position == selected_position){
			
			ImageView iv = new ImageView(context);
			//iv.setImageResource(R.drawable.icon_green_point);
			layout.addView(iv);
			 //layout.setBackground(context.getResources().getDrawable(R.color.background_grey));
<<<<<<< HEAD
			layout.setBackgroundColor(context.getResources().getColor(R.color.background_grey));
=======
			layout.setBackgroundColor(context.getResources().getColor(R.color.white));
>>>>>>> d1ad3f11477eaceac83626f44825046d2fbec0c6
			 }
		else
		{
			 //layout.setBackground(context.getResources().getDrawable(R.color.white));
<<<<<<< HEAD
			 layout.setBackgroundColor(context.getResources().getColor(R.color.white));
=======
			 layout.setBackgroundColor(context.getResources().getColor(R.color.background_grey));
			// layout.setBackground(context.getResources().getDrawable(R.drawable.listitem_background));
>>>>>>> d1ad3f11477eaceac83626f44825046d2fbec0c6
		}
	   
	    layout.setGravity(Gravity.CENTER);
		TextView tv = new TextView(context);
		Resource res = res_list.get(position);
		String item = res.getResName();
<<<<<<< HEAD
		tv.setText(item);
		tv.setPadding(5, 10, 0, 10);
		tv.setTextColor(Color.WHITE);
		tv.setTextSize(15);
		layout.addView(tv);
=======
		
		tv.setText(item);
		tv.setPadding(5, 10, 0, 10);
		tv.setTextColor(Color.GRAY);
		tv.setTextSize(15);
		//tv.setBackgroundColor(R.drawable.listitem_background);
		layout.addView(tv);
		
>>>>>>> d1ad3f11477eaceac83626f44825046d2fbec0c6
		return layout;
	}

	
	private int selected_position = -1;
	public void setSelectedPosition(int selected_position){
		this.selected_position = selected_position;
	}
	
	public int getSelectedPosition(){
		
		return this.selected_position;
	}
	
}
