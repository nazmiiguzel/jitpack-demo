package com.example.mylibrary

import android.util.Log

/**
 *  Created by Nazmi Güzel on 31.05.2022
 *  https://www.linkedin.com/in/nazmiguzel/
 *  https://github.com/nazmiiguzel
 */

class Log {

    companion object {
        private val TAG: String = "Log"

        fun log(logValue: String){
            Log.d(TAG, logValue)
        }
    }
}