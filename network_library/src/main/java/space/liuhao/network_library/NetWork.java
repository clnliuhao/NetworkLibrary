package space.liuhao.network_library;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


/**
 * 网络相关工具类
 *
 * @author 刘浩 2015-06-06 13:20:47
 * @version 1.0.0
 */
@SuppressWarnings("unused")
public class NetWork implements I_NetWork {
    @Override
    public boolean networkIsConnection(Context context) {
        // 连接管理器
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        // 活动网络信息
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        // 有无连接
        return null != networkInfo && networkInfo.isConnected() && networkInfo.isAvailable();
    }
}
