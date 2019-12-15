package com.example.customtoastlibrary

import android.content.Context
import android.widget.Toast

class CustomToast {

    companion object {

        fun ShowMessage(context: Context, message: String, duration: Int) {
            Toast.makeText(context, message, duration).show()
        }

    }

}