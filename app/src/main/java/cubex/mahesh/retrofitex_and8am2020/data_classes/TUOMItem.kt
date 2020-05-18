package cubex.mahesh.retrofitex_and8am2020.data_classes

import com.google.gson.annotations.SerializedName

data class TUOMItem(@SerializedName("Value")
                    val value: String = "",
                    @SerializedName("Text")
                    val text: String = "")