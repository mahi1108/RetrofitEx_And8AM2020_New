package cubex.mahesh.retrofitex_and8am2020.data_classes

import com.google.gson.annotations.SerializedName

data class StockTakeDetail(@SerializedName("Status")
                           val status: Int = 0,
                           @SerializedName("ITSTHID")
                           val itsthid: String = "",
                           @SerializedName("CreatedBy")
                           val createdBy: String = "",
                           @SerializedName("TSTDID")
                           val tstdid: Int = 0,
                           @SerializedName("ModifiedBy")
                           val modifiedBy: String = "",
                           @SerializedName("ModifiedDate")
                           val modifiedDate: String = "",
                           @SerializedName("AvailableQty")
                           val availableQty: String = "",
                           @SerializedName("Ideleted")
                           val ideleted: Int = 0,
                           @SerializedName("ObjectState")
                           val objectState: Int = 0,
                           @SerializedName("StockID")
                           val stockID: String = "",
                           @SerializedName("UserID")
                           val userID: String = "",
                           @SerializedName("CreatedDate")
                           val createdDate: String = "",
                           @SerializedName("QTYOST")
                           val qtyost: String = "",
                           @SerializedName("UOMID")
                           val uomid: String = "")