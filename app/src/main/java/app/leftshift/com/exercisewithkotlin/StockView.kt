package app.leftshift.com.exercisewithkotlin

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.stockview.view.*

/**
 * Created by vrushali on 4/2/18.
 */
class StockView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
        LinearLayout(context, attrs, defStyleAttr) {

    var view : View

    init {
        view = LayoutInflater.from(context).inflate(R.layout.stockview,this,false)
        addView(view)
    }

    fun setStock(stock : Person) {
    }
}