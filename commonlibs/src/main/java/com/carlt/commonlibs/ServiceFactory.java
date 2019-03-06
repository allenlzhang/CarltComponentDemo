package com.carlt.commonlibs;

import com.carlt.commonlibs.service.EmptyLoginService;
import com.carlt.commonlibs.service.EmptyMineService;
import com.carlt.commonlibs.service.ILoginService;
import com.carlt.commonlibs.service.IMineService;

/**
 * Description:
 * Company    : carlt
 * Author     : zhanglei
 * Date       : 2019/2/25 16:06
 */
public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return instance;
    }

    private ServiceFactory() {
    }

    private IMineService  iMineService;
    private ILoginService iLoginService;

    public IMineService getiMineService() {
        if (iMineService == null) {
            iMineService = new EmptyMineService();
        }
        return iMineService;
    }

    public void setiMineService(IMineService iMineService) {
        this.iMineService = iMineService;
    }

    public ILoginService getiLoginService() {
        if (iLoginService == null) {
            iLoginService = new EmptyLoginService();
        }
        return iLoginService;
    }

    public void setiLoginService(ILoginService iLoginService) {
        this.iLoginService = iLoginService;
    }
}
