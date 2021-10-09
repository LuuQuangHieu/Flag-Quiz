package com.startactivityforresultdemo

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_first.*

// TODO (STEP 2: Add First Activity.)
// START
class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        // TODO (STEP 8: Add a click event for finish button which will set the result and finish the activity.)
        btn_finish.setOnClickListener {

            setResult(Activity.RESULT_OK) // It is used to set the RESULT OK which means it is success action which we wants to send back.
            finish()
        }
        // END
    }
}
// END