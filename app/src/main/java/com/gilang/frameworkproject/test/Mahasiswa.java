package com.gilang.frameworkproject.test;

import android.app.Activity;
import android.view.View;

import com.gilang.frameworkproject.R;
import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerAdapter;
import com.gilang.frameworkproject.framework.RecyclerHolder;

/**
 * Created by macair on 1/15/16.
 */
public class Mahasiswa extends DataModel {

    public static final int LAYOUT_PROFILE_LIST = 100;
    public static final int LAYOUT_HOME = 101;
    private int layoutType;
    public String nama;
    public String univ;

    public Mahasiswa(String nama, String univ, int layoutType){
        this.nama = nama;
        this.univ = univ;
        this.layoutType = layoutType;
    }

    @Override
    public int getViewResId() {
        switch (layoutType){
            case LAYOUT_PROFILE_LIST: return R.layout.item_mahasiswa_profile;
            case LAYOUT_HOME: return R.layout.item_mahasiswa_home;
            default: return -1;
        }
    }

    @Override
    public RecyclerHolder createViewHolder(View v, Activity activity, RecyclerAdapter adapter) {
        return new HolderMahasiswa(v, activity, adapter);
    }
}
