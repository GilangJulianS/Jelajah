package com.gilang.jelajah.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.gilang.jelajah.MainActivity;
import com.gilang.jelajah.R;

/**
 * Created by Gilang on 24/04/2016.
 */
public class LoginFragment extends Fragment {

	AppCompatActivity activity;
	EditText formUsername, formPassword;
	Button btnSignin, btnForget, btnSignup;
	ImageView btnTwitter, btnFacebook, btnGoogle;

	public LoginFragment(){}

	public static LoginFragment newInstance(AppCompatActivity activity){
		LoginFragment fragment = new LoginFragment();
		fragment.activity = activity;
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.fragment_login, parent, false);

		bindViews(v);

		return v;
	}

	public void bindViews(View v){
		formUsername = (EditText) v.findViewById(R.id.form_username);
		formPassword = (EditText) v.findViewById(R.id.form_password);
		btnSignin = (Button) v.findViewById(R.id.btn_signin);
		btnForget = (Button) v.findViewById(R.id.btn_forgot);
		btnSignup = (Button) v.findViewById(R.id.btn_signup);


		btnSignin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				login();
			}
		});

		btnSignup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				signup();
			}
		});
	}

	public void login(){
		Intent i = new Intent(activity, MainActivity.class);
		activity.startActivity(i);
	}

	public void signup(){
		activity.getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, SignupFragment.newInstance(activity))
				.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
				.addToBackStack(null)
				.commit();
	}
}
