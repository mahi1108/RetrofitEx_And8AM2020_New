package cubex.mahesh.retrofitex_and8am2020

import cubex.mahesh.retrofitex_and8am2020.data_classes.LoginStatus
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StocksApi {
    @GET("Account/LoginAPi?")
    fun  login(@Query("UserName") uname:String,
               @Query("Password") pass:String):Call<LoginStatus>
}