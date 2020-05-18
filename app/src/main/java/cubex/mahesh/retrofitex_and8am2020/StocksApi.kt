package cubex.mahesh.retrofitex_and8am2020

import cubex.mahesh.retrofitex_and8am2020.data_classes.LoginStatus
import cubex.mahesh.retrofitex_and8am2020.data_classes.StockDetails
import cubex.mahesh.retrofitex_and8am2020.data_classes.StockTakeDetail
import cubex.mahesh.retrofitex_and8am2020.data_classes.StockTakeList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StocksApi {
    @GET("Account/LoginAPi?")
    fun  login(@Query("UserName") uname:String,
               @Query("Password") pass:String):Call<LoginStatus>
    @GET("StockTakeList?")
    fun getStocks(@Query("UserID") user_id:String):Call<StockTakeList>
    @GET("StockTake")
    fun getStockDetails(@Query("ID") id:Int):Call<StockDetails>
}