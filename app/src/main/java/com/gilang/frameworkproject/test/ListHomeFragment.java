package com.gilang.frameworkproject.test;

import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macair on 1/15/16.
 */
public class ListHomeFragment extends RecyclerFragment {

    public static ListHomeFragment newInstance(){
        ListHomeFragment fragment = new ListHomeFragment();
        return fragment;
    }

    @Override
    public List<DataModel> getDatas() {
        List<DataModel> dataModels = new ArrayList<>();
        dataModels.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_HOME));
        dataModels.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_HOME));
        dataModels.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_HOME));
        dataModels.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_HOME));
        dataModels.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_HOME));
        dataModels.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_HOME));
        dataModels.add(new Mahasiswa("Gilang Julian Suherik", "Institut Teknologi Bandung", Mahasiswa.LAYOUT_HOME));
        return dataModels;
    }

    @Override
    public int getColumnNumber() {
        return 2;
    }
}
