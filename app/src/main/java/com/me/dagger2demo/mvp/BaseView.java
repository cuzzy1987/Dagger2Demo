package com.me.dagger2demo.mvp;

/**
 * Created by ${cs} on 2019/2/25.
 */
public interface BaseView<T> {
	void setPresenter(T presenter);//bind
}
