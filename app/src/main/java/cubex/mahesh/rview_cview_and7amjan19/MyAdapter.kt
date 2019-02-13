package cubex.mahesh.rview_cview_and7amjan19

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import cubex.mahesh.rview_cview_and7amjan19.beans.ArticlesItem

class MyAdapter(var activity:MainActivity,
                var list:List<ArticlesItem>?) : RecyclerView.Adapter<MyHolder>() {
    override fun onCreateViewHolder(vg: ViewGroup, p1: Int): MyHolder {

        var inflater = LayoutInflater.from(activity)
        var v:View = inflater.inflate(R.layout.indiview,vg,
            false)
        return MyHolder(v)
    }

    override fun getItemCount(): Int = list!!.size

    override fun onBindViewHolder(mh: MyHolder, pos: Int) {
        mh.title?.text = list?.get(pos)?.title
        mh.desc?.text = list?.get(pos)?.description
        Glide.with(activity).load(list?.get(pos)?.urlToImage).
            into(mh.iview!!)
    }

}