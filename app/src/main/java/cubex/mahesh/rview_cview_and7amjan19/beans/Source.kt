package cubex.mahesh.rview_cview_and7amjan19.beans

import com.google.gson.annotations.SerializedName

data class Source(@SerializedName("name")
                  val name: String = "",
                  @SerializedName("id")
                  val id: String = "")