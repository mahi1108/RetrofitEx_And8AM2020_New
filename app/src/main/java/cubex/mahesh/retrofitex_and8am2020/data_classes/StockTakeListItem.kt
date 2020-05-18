package cubex.mahesh.retrofitex_and8am2020.data_classes

import com.google.gson.annotations.SerializedName

data class StockTakeListItem(@SerializedName("Status")
                             val status: String = "",
                             @SerializedName("TSTHID")
                             val tsthid: Int = 0,
                             @SerializedName("BinID")
                             val binID: String = "",
                             @SerializedName("ObjectState")
                             val objectState: Int = 0,
                             @SerializedName("Description")
                             val description: String = "",
                             @SerializedName("RefNo")
                             val refNo: String = "",
                             @SerializedName("UserID")
                             val userID: String = "",
                             @SerializedName("WarehouseID")
                             val warehouseID: String = "")