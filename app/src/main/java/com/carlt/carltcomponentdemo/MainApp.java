package com.carlt.carltcomponentdemo;

import android.app.Application;

import com.carlt.commonlibs.AppConfig;
import com.carlt.commonlibs.IAppComponent;

/**
 * Description:
 * Company    : carlt
 * Author     : zhanglei
 * Date       : 2019/2/25 15:29
 */
public class MainApp extends Application implements IAppComponent {
    private static MainApp mainApp;

    public static MainApp getInstance() {
        return mainApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    @Override
    public void init(Application application) {
        mainApp = (MainApp) application;
        for (String component : AppConfig.COMPONENTS) {
            Class<?> aClass = null;
            try {
                aClass = Class.forName(component);
                Object newInstance = aClass.newInstance();
                if (newInstance instanceof IAppComponent) {
                    ((IAppComponent) newInstance).init(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
