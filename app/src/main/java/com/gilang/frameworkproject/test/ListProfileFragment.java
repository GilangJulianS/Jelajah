package com.gilang.frameworkproject.test;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macair on 1/15/16.
 */
public class ListProfileFragment extends RecyclerFragment{

    public ListProfileFragment(){}

    public static ListProfileFragment newInstance(){
        ListProfileFragment fragment = new ListProfileFragment();
        return fragment;
    }

    @Override
    public List<DataModel> getDatas() {
        List<DataModel> list = new ArrayList<>();
        list.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_PROFILE_LIST));
        list.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_PROFILE_LIST));
        list.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_PROFILE_LIST));
        list.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_PROFILE_LIST));
        list.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_PROFILE_LIST));
        return list;
    }

    @Override
    public void onCreateView(View v, ViewGroup parent, Bundle savedInstanceState) {

    }
}
