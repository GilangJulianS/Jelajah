package com.gilang.jelajah.model;

import android.app.Activity;
import android.view.View;

import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerAdapter;
import com.gilang.frameworkproject.framework.RecyclerHolder;
import com.gilang.jelajah.R;
import com.gilang.jelajah.custom.AddHolder;

/**
 * Created by Gilang on 24/04/2016.
 */
public class Add extends DataModel {

	public Add(){}

	@Override
	public int getViewResId() {
		return R.layout.card_add;
	}

	@Override
	public RecyclerHolder createViewHolder(View v, Activity activity, RecyclerAdapter adapter) {
		return new AddHolder(v, activity, adapter);
	}
}
