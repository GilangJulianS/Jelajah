package com.gilang.jelajah.model;

import android.app.Activity;
import android.view.View;

import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerAdapter;
import com.gilang.frameworkproject.framework.RecyclerHolder;
import com.gilang.jelajah.R;
import com.gilang.jelajah.custom.PlanHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gilang on 24/04/2016.
 */
public class Plan extends DataModel {

	public String origin, destination;
	public List<String> transportations;
	public List<Integer> images;
	public boolean finished;

	public Plan(String origin, String destination, List<String> transportations) {
		this.origin = origin;
		this.destination = destination;
		if(transportations != null) {
			this.transportations = transportations;
		}else{
			transportations = new ArrayList<>();
		}
		images = new ArrayList<>();
		finished = false;
	}

	public void addTransport(String transport){
		transportations.add(transport);
	}

	public void addImage(int imgRes){
		images.add(imgRes);
	}

	@Override
	public int getViewResId() {
		return R.layout.card_plan;
	}

	@Override
	public RecyclerHolder createViewHolder(View v, Activity activity, RecyclerAdapter adapter) {
		return new PlanHolder(v, activity, adapter);
	}
}
