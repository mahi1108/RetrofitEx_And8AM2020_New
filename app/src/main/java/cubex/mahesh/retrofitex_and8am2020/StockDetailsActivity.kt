package cubex.mahesh.retrofitex_and8am2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import cubex.mahesh.retrofitex_and8am2020.data_classes.StockTakeList
import cubex.mahesh.retrofitex_and8am2020.data_classes.StockTakeListItem
import kotlinx.android.synthetic.main.activity_stock_details.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StockDetailsActivity : AppCompatActivity() {

    companion object{
        var stlist:List<StockTakeListItem>? = null
        var stlist_item : StockTakeListItem? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stock_details)

        lview.setOnItemClickListener { parent, view, position, id ->
             stlist_item = stlist?.get(position)
             var i = Intent(this@StockDetailsActivity,
                 StockTakeListDetailsActivity::class.java)
            startActivity(i)
        }

        var call:Call<StockTakeList>? =
    MainActivity.sapi?.getStocks(MainActivity._userDetails!!.userID)
        call?.enqueue(object :Callback<StockTakeList>{
            override fun onFailure(call: Call<StockTakeList>, t: Throwable) {

            }
            override fun onResponse(call: Call<StockTakeList>, response: Response<StockTakeList>) {
                if(response.isSuccessful ){
             var slist:StockTakeList? = response.body()
               stlist= slist?.stockTakeList
                    if(stlist?.size != 0){
                        var listAsString = mutableListOf<String>()
                        for(item in stlist!!){
                            listAsString.add("Ref"+ item.refNo+
                                "\n Warehouse:"+item.warehouseID
                                    +"\n"+"Bin : "+ item.binID+"\n")
                        }
                        var myadapter = ArrayAdapter<String>(
                            this@StockDetailsActivity,
                            android.R.layout.simple_list_item_1,listAsString)
                        lview.adapter = myadapter
                    }
                }
            }
        })
    }
}
