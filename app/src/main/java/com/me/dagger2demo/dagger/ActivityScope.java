package com.me.dagger2demo.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by ${cs} on 2019/2/25.
 */


@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
