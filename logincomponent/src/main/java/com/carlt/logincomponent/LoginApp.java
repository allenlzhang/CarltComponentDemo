package com.carlt.logincomponent;

import android.app.Application;

import com.carlt.commonlibs.IAppComponent;
import com.carlt.commonlibs.ServiceFactory;

/**
 * Description:
 * Company    : carlt
 * Author     : zhanglei
 * Date       : 2019/2/25 15:34
 */
public class LoginApp extends Application implements IAppComponent {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    @Override
    public void init(Application app) {
        application = app;
        ServiceFactory.getInstance().setiLoginService(new LoginService());
    }
}
