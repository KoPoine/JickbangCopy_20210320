package com.example.jickbangcopy_20210320

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jickbangcopy_20210320.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kotlinx.android.synthetic.main.activity_view_room_detail.descTxt
import kotlinx.android.synthetic.main.activity_view_room_detail.priceTxt
import kotlinx.android.synthetic.main.room_list_item.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roodData = intent.getSerializableExtra("roomInfo") as Room

        priceTxt.text = roodData.getFormattedprice()
        floorTxt.text = roodData.getFormattedFloor()
        addressTxt.text = roodData.address
        descTxt.text = roodData.description
    }
}