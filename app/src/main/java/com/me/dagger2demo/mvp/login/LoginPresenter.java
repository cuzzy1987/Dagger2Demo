package com.me.dagger2demo.mvp.login;

import android.content.Context;
import android.widget.Toast;

import com.me.dagger2demo.entity.User;

import javax.inject.Inject;

/**
 * Created by ${cs} on 2019/2/25.
 */
public class LoginPresenter {

	private ICommonView commonView;
	private String login = "login";

	@Inject
	public LoginPresenter(ICommonView iCommonView){
		this.commonView = iCommonView;
	}

	public void login(User user){
		Context context = commonView.getContext();
		Toast.makeText(context,login,Toast.LENGTH_SHORT).show();
	}


}
