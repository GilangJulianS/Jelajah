package com.gilang.jelajah.custom;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerAdapter;
import com.gilang.frameworkproject.framework.RecyclerHolder;
import com.gilang.jelajah.R;
import com.gilang.jelajah.model.Add;

/**
 * Created by Gilang on 24/04/2016.
 */
public class AddHolder extends RecyclerHolder {

	public ImageView img;

	public AddHolder(View v, Activity activity, RecyclerAdapter adapter) {
		super(v, activity, adapter);
		img = (ImageView) v.findViewById(R.id.img);
	}

	@Override
	public void bind(DataModel dataModel, Activity activity, int position) {
		img.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				gotoAddPage();
			}
		});
	}

	public void gotoAddPage(){

	}
}
