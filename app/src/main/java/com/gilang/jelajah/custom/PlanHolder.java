package com.gilang.jelajah.custom;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerAdapter;
import com.gilang.frameworkproject.framework.RecyclerHolder;
import com.gilang.jelajah.R;
import com.gilang.jelajah.model.Plan;

/**
 * Created by Gilang on 24/04/2016.
 */
public class PlanHolder extends RecyclerHolder {

	public ImageView img;
	public TextView txt;

	public PlanHolder(View v, Activity activity, RecyclerAdapter adapter) {
		super(v, activity, adapter);
		img = (ImageView) v.findViewById(R.id.img);
		txt = (TextView) v.findViewById(R.id.text);
	}

	@Override
	public void bind(DataModel dataModel, Activity activity, int position) {
		Plan p = (Plan) dataModel;
		txt.setText(p.origin + " - " + p.destination);
	}
}
