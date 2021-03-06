package com.averi.worldscribe.utilities;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by mark on 21/06/16.
 */
public class AppPreferences {
    public static final String PREFERENCES_FILE_NAME = "com.averi.worldscribe";
    public static final String LAST_OPENED_WORLD = "lastOpenedWorld";
    public static final String WRITE_PERMISSION_PROMPT_IS_ENABLED = "permissionPromptIsEnabled";
    public static final String APP_THEME = "appTheme";
    public static final String NIGHT_MODE_IS_ENABLED = "nightModeIsEnabled";

    /**
     * Save the name of the World that was last opened, so that it can automatically be loaded the
     * next time the app is launched.
     * @param context The Context calling this method.
     * @param worldName The name of the last opened World.
     */
    public static void saveLastOpenedWorld(Context context, String worldName) {
        SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_FILE_NAME,
                Context.MODE_PRIVATE);
        preferences.edit().putString(AppPreferences.LAST_OPENED_WORLD, worldName).apply();
    }

    /**
     * Checks if Night Mode is enabled.
     * @param context The The Context calling this method.
     * @return True if Night Mode is enabled; false otherwise.
     */
    public static boolean nightModeIsEnabled(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_FILE_NAME,
                Context.MODE_PRIVATE);
        return preferences.getBoolean(NIGHT_MODE_IS_ENABLED, false);
    }
}
