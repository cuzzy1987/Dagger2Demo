package com.me.dagger2demo.entity;

import com.me.dagger2demo.dagger.ActivityScope;
import com.me.dagger2demo.mvp.login.ICommonView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ${cs} on 2019/2/25.
 */

@Module
public class CommonModule {

	private ICommonView iCommonView;

	public CommonModule(ICommonView iCommonView) {
		this.iCommonView = iCommonView;
	}

	@Provides
	@ActivityScope
	public ICommonView provideICommonView(){
		return this.iCommonView;
	}
}
