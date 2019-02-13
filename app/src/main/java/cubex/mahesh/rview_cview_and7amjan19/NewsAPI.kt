package cubex.mahesh.rview_cview_and7amjan19

import cubex.mahesh.rview_cview_and7amjan19.beans.Articles
import retrofit2.Call
import retrofit2.http.GET

interface NewsAPI {

    @GET("everything?q=bitcoin&from=2019-01-13&sortBy=publishedAt&apiKey=96e3942ff23c4ea38bcfa86a490bd933")
    fun getNews( ) : Call<Articles>

}