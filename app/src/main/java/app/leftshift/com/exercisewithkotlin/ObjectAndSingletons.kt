package app.leftshift.com.exercisewithkotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by vrushali on 3/28/18.
 */
class ObjectAndSingletons : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO Discuss “object” keyword in relation to anonymous classes in Java
        var adHocObject = object {
            var abc : String = "abc"
            var xyz : String = "xyz"
        }

        findViewById<TextView>(R.id.txt_kotlin).setText(adHocObject.abc)

    }

}