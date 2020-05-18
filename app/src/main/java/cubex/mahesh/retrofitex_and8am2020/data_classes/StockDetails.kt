package cubex.mahesh.retrofitex_and8am2020.data_classes

import com.google.gson.annotations.SerializedName

data class StockDetails(@SerializedName("BarCode")
                        val barCode: String = "",
                        @SerializedName("TUOM")
                        val tuom: List<TUOMItem>?,
                        @SerializedName("TL")
                        val tl: List<TLItem>?,
                        @SerializedName("StockTakeHeader")
                        val stockTakeHeader: StockTakeHeader,
                        @SerializedName("StockDescription")
                        val stockDescription: String = "",
                        @SerializedName("StockTakeDetail")
                        val stockTakeDetail: StockTakeDetail,
                        @SerializedName("StockCode")
                        val stockCode: String = "",
                        @SerializedName("TB")
                        val tb: List<TBItem>?)