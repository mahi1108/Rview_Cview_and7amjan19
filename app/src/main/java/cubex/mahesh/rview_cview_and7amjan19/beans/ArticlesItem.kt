package cubex.mahesh.rview_cview_and7amjan19.beans

import com.google.gson.annotations.SerializedName

data class ArticlesItem(@SerializedName("urlToImage")
                        val urlToImage: String = "",
                        @SerializedName("description")
                        val description: String = "",
                        @SerializedName("title")
                        val title: String = "")