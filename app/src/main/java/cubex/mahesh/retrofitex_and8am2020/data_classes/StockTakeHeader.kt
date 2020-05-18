package cubex.mahesh.retrofitex_and8am2020.data_classes

import com.google.gson.annotations.SerializedName

data class StockTakeHeader(@SerializedName("Status")
                           val status: String = "",
                           @SerializedName("TSTHID")
                           val tsthid: Int = 0,
                           @SerializedName("StockTakeDate")
                           val stockTakeDate: String = "",
                           @SerializedName("CreatedBy")
                           val createdBy: String = "",
                           @SerializedName("Description")
                           val description: String = "",
                           @SerializedName("RefNo")
                           val refNo: String = "",
                           @SerializedName("WarehouseID")
                           val warehouseID: Int = 0,
                           @SerializedName("ModifiedBy")
                           val modifiedBy: String = "",
                           @SerializedName("ModifiedDate")
                           val modifiedDate: String = "",
                           @SerializedName("Ideleted")
                           val ideleted: String = "",
                           @SerializedName("BinID")
                           val binID: Int = 0,
                           @SerializedName("ObjectState")
                           val objectState: Int = 0,
                           @SerializedName("UserID")
                           val userID: String = "",
                           @SerializedName("CreatedDate")
                           val createdDate: String = "")