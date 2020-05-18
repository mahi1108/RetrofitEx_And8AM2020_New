package cubex.mahesh.retrofitex_and8am2020.data_classes

import com.google.gson.annotations.SerializedName

data class StockTakeList(@SerializedName("StockTakeList")
                         val stockTakeList: List<StockTakeListItem>?)