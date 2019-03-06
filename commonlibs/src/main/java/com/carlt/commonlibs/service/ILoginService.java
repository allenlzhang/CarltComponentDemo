package com.carlt.commonlibs.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Description:
 * Company    : carlt
 * Author     : zhanglei
 * Date       : 2019/2/25 15:48
 */
public interface ILoginService {
    void lauch(Context context, String targetClass);

    Fragment newUserInfoFragment(FragmentManager manager, int viewId, Bundle bundle);
}
