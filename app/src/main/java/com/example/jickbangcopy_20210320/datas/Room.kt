package com.example.jickbangcopy_20210320.datas

class Room (
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) {

    fun getFormattedFloor() : String {

        if (this.floor >= 1) {
            return "${this.floor}층"
        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {
            "지하${-this.floor}층"
        }

    }

}