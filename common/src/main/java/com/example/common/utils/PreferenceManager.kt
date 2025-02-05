package com.example.common.utils

import android.content.Context

object PreferenceManager {
    private const val SHARED_PREFERENCES_FILE = "languages_"

    fun getStringForKey(context: Context?, key: String?, defaultData: String?): String? {
        if (context != null) {
            val sharedPreferences =
                context.getSharedPreferences(SHARED_PREFERENCES_FILE, Context.MODE_PRIVATE)
            return if (sharedPreferences != null) {
                sharedPreferences.getString(key, defaultData)
            } else {
                defaultData
            }
        }
        return defaultData
    }

    fun saveStringForKey(context: Context?, key: String?, data: String?) {
        if (context != null) {
            val sharedPreferences =
                context.getSharedPreferences(SHARED_PREFERENCES_FILE, Context.MODE_PRIVATE)
            if (sharedPreferences != null) {
                val editor = sharedPreferences.edit()
                editor.putString(key, data)
                editor.commit()
            }
        }
    }
}