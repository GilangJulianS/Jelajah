package com.gilang.jelajah.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.gilang.jelajah.R;

/**
 * Created by Gilang on 24/04/2016.
 */
public class SignupFragment extends Fragment{

	AppCompatActivity activity;
	EditText formUsername, formEmail, formPassword;
	Button btnSignup, btnRegistered;

	public SignupFragment(){}

	public static SignupFragment newInstance(AppCompatActivity activity){
		SignupFragment fragment = new SignupFragment();
		fragment.activity = activity;
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.fragment_signup, parent, false);

		bindViews(v);

		return v;
	}

	public void bindViews(View v){
		formUsername = (EditText) v.findViewById(R.id.form_username);
		formEmail = (EditText) v.findViewById(R.id.form_email);
		formPassword = (EditText) v.findViewById(R.id.form_password);
		btnSignup = (Button) v.findViewById(R.id.btn_signup);
		btnRegistered = (Button) v.findViewById(R.id.btn_registered);

		btnRegistered.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				backToLogin();
			}
		});

		btnSignup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				signup();
			}
		});
	}

	public void backToLogin(){
		activity.getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, LoginFragment.newInstance(activity))
				.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
				.commit();
	}

	public void signup(){
		activity.getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, LoginFragment.newInstance(activity))
				.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)
				.commit();
	}

}
