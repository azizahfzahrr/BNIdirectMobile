package com.example.common.utils.fonts

import android.content.Context

object PreferenceFont {
    private const val SHARED_PREFERENCES_FILE = "font_"

    fun saveIntForKey(context: Context?, key: String?, data: Int) {
        if (context != null) {
            val sharedPreferences =
                context.getSharedPreferences(SHARED_PREFERENCES_FILE, Context.MODE_PRIVATE)
            if (sharedPreferences != null) {
                val editor = sharedPreferences.edit()
                editor.putInt(key, data)
                editor.commit()
            }
        }
    }

    fun getIntForKey(context: Context?, key: String?, defaultData: Int): Int {
        if (context != null) {
            val sharedPreferences =
                context.getSharedPreferences(SHARED_PREFERENCES_FILE, Context.MODE_PRIVATE)
            return sharedPreferences?.getInt(key, defaultData) ?: defaultData
        }
        return defaultData
    }
}