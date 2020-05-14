package cubex.mahesh.retrofitex_and8am2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    var _retofit:Retrofit? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _retofit = Retrofit.
            Builder().
            baseUrl("http://129.232.170.227/ODIStockmanagementApi/api/").
            addConverterFactory(GsonConverterFactory.create()).
            build()
    }

    fun login(view: View) {


    }
}
