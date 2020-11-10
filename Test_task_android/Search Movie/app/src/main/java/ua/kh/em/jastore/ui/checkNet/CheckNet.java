package ua.kh.em.jastore.ui.checkNet;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

public class CheckNet {

    public static boolean isNetExists(Context context) {

        if (context == null) return false;

        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if (cm != null) {
            NetworkCapabilities capabilities = cm.getNetworkCapabilities(cm.getActiveNetwork());
            if (capabilities != null) {
                if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR))
                    return true;
                else return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI);
            }
        }
        return false;
    }
}
