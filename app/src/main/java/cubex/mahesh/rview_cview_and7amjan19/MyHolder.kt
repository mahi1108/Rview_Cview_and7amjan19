package cubex.mahesh.rview_cview_and7amjan19

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.indiview.view.*

class MyHolder(v:View) : RecyclerView.ViewHolder(v) {
  var title:TextView ? = null
  var iview:ImageView ? = null
  var desc:TextView? = null

    init {
        title = v.title
        iview = v.iview
        desc = v.desc
    }
}