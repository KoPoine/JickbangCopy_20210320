package com.example.jickbangcopy_20210320

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jickbangcopy_20210320.adapters.RoomAdapter
import com.example.jickbangcopy_20210320.datas.Room
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val mRooms = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRooms.add(Room(7500, "서울시 동대문구", 2, "동대문구의 방입니다."))
        mRooms.add(Room(18500, "서울시 동대문구", 5, "동대문구의 방입니다."))
        mRooms.add(Room(25300, "서울시 동대문구", 4, "동대문구의 방입니다."))
        mRooms.add(Room(19500, "서울시 동대문구", 1, "동대문구의 방입니다."))
        mRooms.add(Room(9500, "서울시 서대문구", 0, "서대문구의 방입니다."))
        mRooms.add(Room(4000, "서울시 서대문구", -2, "서대문구의 방입니다."))
        mRooms.add(Room(15600, "서울시 서대문구", 6, "서대문구의 방입니다."))
        mRooms.add(Room(185000, "서울시 서대문구", 15, "서대문구의 방입니다."))
        mRooms.add(Room(2000, "서울시 중구", -5, "중구의 방입니다."))
        mRooms.add(Room(35000, "서울시 중구", 8, "중구의 방입니다."))
        mRooms.add(Room(2000, "서울시 중구", -3, "중구의 방입니다."))
        mRooms.add(Room(35400, "서울시 중구", 7, "중구의 방입니다."))


        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRooms)

        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRooms[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)

        }

    }
}