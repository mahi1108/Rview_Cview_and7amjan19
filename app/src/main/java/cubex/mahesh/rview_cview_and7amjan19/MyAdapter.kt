package cubex.mahesh.rview_cview_and7amjan19

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyAdapter(var activity:MainActivity) : RecyclerView.Adapter<MyHolder>() {
    override fun onCreateViewHolder(vg: ViewGroup, p1: Int): MyHolder {

        var inflater = LayoutInflater.from(activity)
        var v:View = inflater.inflate(R.layout.indiview,vg,
            false)
        return MyHolder(v)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: MyHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}