package com.gilang.frameworkproject.test;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.gilang.frameworkproject.R;
import com.gilang.frameworkproject.framework.DataModel;
import com.gilang.frameworkproject.framework.RecyclerAdapter;
import com.gilang.frameworkproject.framework.RecyclerHolder;

/**
 * Created by macair on 1/15/16.
 */
public class HolderMahasiswa extends RecyclerHolder {

    public TextView txtNama, txtUniv;

    public HolderMahasiswa(View v, Activity activity, RecyclerAdapter adapter) {
        super(v, activity, adapter);
        txtNama = (TextView) v.findViewById(R.id.txt_nama);
        txtUniv = (TextView) v.findViewById(R.id.txt_universitas);
    }

    @Override
    public void bind(DataModel dataModel, Activity activity, int position) {
        Mahasiswa m = (Mahasiswa)dataModel;
        txtNama.setText(m.nama);
        txtUniv.setText(m.univ);
    }
}
