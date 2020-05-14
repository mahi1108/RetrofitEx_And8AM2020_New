package cubex.mahesh.retrofitex_and8am2020.data_classes

import com.google.gson.annotations.SerializedName

data class LoginStatus(@SerializedName("Status")
                       val status: String = "",
                       @SerializedName("ErrorKey")
                       val errorKey: String? = null,
                       @SerializedName("RedirectUrl")
                       val redirectUrl: String? = null,
                       @SerializedName("Data")
                       val data: Data,
                       @SerializedName("ErrorMessage")
                       val errorMessage: String? = null)