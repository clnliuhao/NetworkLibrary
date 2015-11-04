package space.liuhao.network_library;

import android.content.Context;

/**
 *
 * 网络相关操作接口
 *
 * @version 1.0.0 2015-06-06 13:14:01
 * @author 刘浩
 */
@SuppressWarnings("unused,WeakerAccess")
public interface I_NetWork{
    /**
     * 网络是否连通状态检测
     *
     * @param context 上下文实体
     * @return 网络处于连通状态：true,否则为：false
     */
    boolean networkIsConnection(Context context);
}
