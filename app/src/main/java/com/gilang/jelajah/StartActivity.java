package com.gilang.jelajah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gilang.jelajah.fragment.LoginFragment;

public class StartActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);

		getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, LoginFragment.newInstance(this))
				.commit();
	}
}
