package com.carlt.commonlibs.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Description:
 * Company    : carlt
 * Author     : zhanglei
 * Date       : 2019/2/25 16:20
 */
public class EmptyLoginService implements ILoginService {
    @Override
    public void lauch(Context context, String targetClass) {

    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager manager, int viewId, Bundle bundle) {
        return null;
    }
}
