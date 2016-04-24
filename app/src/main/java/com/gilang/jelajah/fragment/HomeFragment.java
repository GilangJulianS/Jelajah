package com.gilang.jelajah.fragment;

import android.support.v7.app.AppCompatActivity;

import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerFragment;
import com.gilang.jelajah.model.Add;
import com.gilang.jelajah.model.Plan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gilang on 24/04/2016.
 */
public class HomeFragment extends RecyclerFragment {

	public HomeFragment(){}

	public static HomeFragment newInstance(AppCompatActivity activity){
		HomeFragment fragment = new HomeFragment();
		fragment.activity = activity;
		return fragment;
	}

	@Override
	public int getColumnNumber() {
		return 3;
	}

	@Override
	public List<DataModel> getDatas() {
		List<DataModel> datas = new ArrayList<>();
		datas.add(new Plan("Jakarta", "Lombok", null));
		datas.add(new Add());
		return datas;
	}
}
