package com.shrifd.ls149.splash.mvp.model

import android.app.Application
import com.google.gson.Gson
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel

import com.jess.arms.di.scope.ActivityScope
import javax.inject.Inject

import com.shrifd.ls149.splash.mvp.contract.SplashContract


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 02/20/2021 13:35
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
class SplashModel
@Inject
constructor(repositoryManager: IRepositoryManager) : BaseModel(repositoryManager), SplashContract.Model{
    @Inject
    lateinit var mGson:Gson;
    @Inject
    lateinit var mApplication:Application;

    override fun onDestroy() {
          super.onDestroy();
    }
}
