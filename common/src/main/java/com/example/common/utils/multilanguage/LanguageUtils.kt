package com.example.common.utils.multilanguage

import android.content.Context
import com.example.common.R
import com.example.common.utils.PreferenceManager
import org.json.JSONObject
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream

class LanguageUtils {
    companion object {
        fun setLanguage(context: Context, code: Int) {

            var content: InputStream = if (code == 1) {
                context.resources.openRawResource(R.raw.eng_lang)
            } else {
                context.resources.openRawResource(R.raw.ind_lang)
            }

            var byteArrayOutputStream = ByteArrayOutputStream()
            var n: Int

            try {
                n = content.read()
                while (n != -1) {
                    byteArrayOutputStream.write(n)
                    n = content.read()
                }
                content.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }

            val jsonString: String = byteArrayOutputStream.toString()

            PreferenceManager.saveStringForKey(
                context,
                LanguageConstant.PREFERENCE_CURRENTLANGUAGE,
                jsonString
            )

            PreferenceManager.saveStringForKey(context, LanguageConstant.PREFERENCE_LANGUAGECODE, code.toString())
        }

        fun getLanguageString(context: Context, tag: String): String {
            if (PreferenceManager.getStringForKey(
                    context,
                    LanguageConstant.PREFERENCE_LANGUAGECODE,
                    null
                ) != null
            ) {
                var result = JSONObject(
                    PreferenceManager.getStringForKey(context,
                        LanguageConstant.PREFERENCE_CURRENTLANGUAGE,
                        ""
                    )
                )

                var data = when {
                    result.has(tag) -> {
                        result.getString(tag)
                    }
                    else -> "?"
                }

                return data.toString().trim()
            } else {

                return "?"
            }
        }
    }
}