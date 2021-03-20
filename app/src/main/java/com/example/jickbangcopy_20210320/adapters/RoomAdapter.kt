package com.example.jickbangcopy_20210320.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.jickbangcopy_20210320.datas.Room

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room> (mContext, resId, mList) {
}