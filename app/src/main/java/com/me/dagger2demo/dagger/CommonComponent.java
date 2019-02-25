package com.me.dagger2demo.dagger;

import com.me.dagger2demo.entity.CommonModule;
import com.me.dagger2demo.ui.LoginActivity;

import dagger.Component;

/**
 * Created by ${cs} on 2019/2/25.
 */


@ActivityScope
@Component (modules = CommonModule.class)
public interface CommonComponent {

	void inject(LoginActivity activity);

}
