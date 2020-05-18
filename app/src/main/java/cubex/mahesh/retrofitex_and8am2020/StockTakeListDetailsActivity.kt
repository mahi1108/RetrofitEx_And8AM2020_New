package cubex.mahesh.retrofitex_and8am2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import cubex.mahesh.retrofitex_and8am2020.data_classes.*
import kotlinx.android.synthetic.main.activity_stock_take_list_details.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StockTakeListDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stock_take_list_details)

       var call:Call<StockDetails> =
                MainActivity.sapi!!.getStockDetails(
                StockDetailsActivity.stlist_item!!.tsthid)
        call.enqueue(object:Callback<StockDetails>{
            override fun onResponse(
                call: Call<StockDetails>,
                response: Response<StockDetails>
            ) {
                    if(response.isSuccessful){
     var st_details:StockDetails? =  response.body()
                        mapData(st_details)
                    }
            }

            override fun onFailure(call: Call<StockDetails>, t: Throwable) {
                Toast.makeText(this@StockTakeListDetailsActivity,
                    "Something went wrong...",
                    Toast.LENGTH_LONG).show()
            }
        })
    }

    fun mapData(stdetails:StockDetails?){
        var tuom_items:List<TUOMItem>? =  stdetails?.tuom
        var tb_items:List<TBItem>? =  stdetails?.tb
        var tl_items:List<TLItem>? =  stdetails?.tl

        var tuom_items_asstring = mutableListOf<String>()
        var tb_items_asstring = mutableListOf<String>()
        var tl_items_asstring = mutableListOf<String>()
        tuom_items_asstring.add("Select")
        tb_items_asstring.add("Select")
        tl_items_asstring.add("Select")

        for( item in tuom_items!!){
            tuom_items_asstring.add(item.text)
        }
        for( item in tb_items!!){
            tb_items_asstring.add(item.text)
        }
        for( item in tl_items!!){
            tl_items_asstring.add(item.text)
        }
        var tuom_adapter = ArrayAdapter<String>(
this,android.R.layout.simple_list_item_1,
            tuom_items_asstring)
        var tb_adapter = ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1,
            tb_items_asstring)
        var tl_adapter = ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1,
            tl_items_asstring)
        sp_tuom.adapter = tuom_adapter
        sp_tb.adapter = tb_adapter
        sp_tl.adapter = tl_adapter

        var ware_house_id = stdetails!!.stockTakeHeader.warehouseID
        var bin_id = stdetails!!.stockTakeHeader.binID

        for (i in 0..tb_items.size){
                if(tb_items.get(i).value.toInt() == bin_id){
                    sp_tb.setSelection(i+1)
                }
        }
        for (i in 0..tl_items.size){
            if(tl_items.get(i).value.toInt() == ware_house_id){
                sp_tl.setSelection(i+1)
            }
        }
    }
}
