package com.example.common.utils.fonts

import android.content.Context

class FontUtils {
    companion object {
        fun setFontSize(context: Context, code: Int) {
            PreferenceFont.saveIntForKey(
                context,
                FontConstant.PREFERENCE_CURRENTFONTSIZE,
                code
            )

            PreferenceFont.saveIntForKey(context, FontConstant.PREFERENCE_FONTCODE, code)
        }
    }
}