package cubex.mahesh.rview_cview_and7amjan19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import cubex.mahesh.rview_cview_and7amjan19.beans.Articles
import cubex.mahesh.rview_cview_and7amjan19.beans.ArticlesItem
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lManager = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.HORIZONTAL,
            false)
        var gManager = GridLayoutManager(
            this@MainActivity,2)

        rview.layoutManager =  gManager //  lManager // (or)

        var r:Retrofit  = Retrofit.Builder().
            addConverterFactory(GsonConverterFactory.create()).
            baseUrl("https://newsapi.org/v2/").build()

       var api:NewsAPI =  r.create(NewsAPI::class.java)
        var call = api.getNews()
        call.enqueue(object:Callback<Articles>{
            override fun onResponse(call: Call<Articles>, response: Response<Articles>) {
              var artcls:Articles? =   response.body()
               var list:List<ArticlesItem>? =  artcls?.articles
               rview.adapter = MyAdapter(this@MainActivity,
                                                    list)

            }
            override fun onFailure(call: Call<Articles>, t: Throwable) {

            }
        })

        fab.setOnClickListener {
            var sBar = Snackbar.make(it,
                "Are you sure want to Exit?",
                Snackbar.LENGTH_INDEFINITE)
            sBar.setAction("Yes",{
                System.exit(0)
            })
            sBar.show()
        }

    } // onCreate( )
}
