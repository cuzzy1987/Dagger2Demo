package com.me.dagger2demo.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.me.dagger2demo.R;
import com.me.dagger2demo.dagger.DaggerCommonComponent;
import com.me.dagger2demo.entity.CommonModule;
import com.me.dagger2demo.entity.User;
import com.me.dagger2demo.mvp.login.ICommonView;
import com.me.dagger2demo.mvp.login.LoginPresenter;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity
		implements View.OnClickListener,ICommonView {


	static final String TAG ="LoginActivity";

	@Inject
	LoginPresenter loginPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		initView();
	}

	private void initView() {
		findViewById(R.id.loginTv).setOnClickListener(this);
		DaggerCommonComponent
				.builder()
				.commonModule(new CommonModule(this))
				.build()
				.inject(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.loginTv:
				Log.d(TAG,"-=login=-");
				loginPresenter.login(new User());
				break;
			default:break;
		}
	}

	@Override
	public Context getContext() {
		return this;
	}
}
