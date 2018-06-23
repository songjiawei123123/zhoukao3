package com.bwie.unit1111.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.bwie.unit1111.dao.DaoMaster;
import com.bwie.unit1111.dao.DaoSession;
import com.facebook.drawee.backends.pipeline.Fresco;


public class App extends Application {
    private DaoSession daoSession;
    private static App instance;
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    /*    x.Ext.init(this);
        x.Ext.setDebug(false);*/ //输出debug日志，开启会影响性能
        instance=this;
        initDao();
    }
    public static  App getInstance(){
        return instance;
    }
    private void initDao() {
        //创建数据库
        SQLiteDatabase db = new DaoMaster.DevOpenHelper(this, "data.db").getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }
    public DaoSession getDao(){
        return daoSession;
    }
}
