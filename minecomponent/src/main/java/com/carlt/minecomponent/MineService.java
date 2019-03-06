package com.carlt.minecomponent;

import android.content.Context;
import android.content.Intent;

import com.carlt.commonlibs.service.IMineService;

/**
 * Description:
 * Company    : carlt
 * Author     : zhanglei
 * Date       : 2019/2/25 16:02
 */
public class MineService implements IMineService {
    @Override
    public void launch(Context context, int uerID) {
        Intent intent = new Intent(context, ScrollingActivity.class);
        intent.putExtra(ScrollingActivity.EXTRA_DATA, uerID);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);

    }
}
