package cubex.mahesh.retrofitex_and8am2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import cubex.mahesh.retrofitex_and8am2020.data_classes.LoginStatus
import cubex.mahesh.retrofitex_and8am2020.data_classes.UserDetails
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    companion object{
        var _retofit:Retrofit? = null
        var sapi:StocksApi? = null
        var _userDetails:UserDetails? = null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            login()
        }

        _retofit = Retrofit.
            Builder().
            baseUrl("http://129.232.170.227/ODIStockmanagementApik/api/").
            addConverterFactory(GsonConverterFactory.create()).
            build()
        sapi = _retofit?.create(StocksApi::class.java)
    }


    fun login() {
        var call: Call<LoginStatus>? = sapi?.login(editText.text.toString(),
            editText2.text.toString())
        call?.enqueue(object : Callback<LoginStatus>{
            override fun onFailure(call: Call<LoginStatus>, t: Throwable) {
                Toast.makeText(this@MainActivity,
                    "Something went wrong...",
                    Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<LoginStatus>, response: Response<LoginStatus>) {
                    if(response.isSuccessful)
                    {
                        var lstatus:LoginStatus? = response.body()
                        if(lstatus?.status.equals("Success")){
                            _userDetails = lstatus?.data?.userDetails
                                    var i = Intent(this@MainActivity,
                                        StockDetailsActivity::class.java)
                                    startActivity(i)
                        }else{
                            Toast.makeText(this@MainActivity,
                                lstatus?.errorMessage,
                                Toast.LENGTH_LONG).show()
                        }
                    }
            }
        })
    }
}