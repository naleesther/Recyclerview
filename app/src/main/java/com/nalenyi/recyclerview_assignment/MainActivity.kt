package com.nalenyi.recyclerview_assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import androidx.recyclerview.widget.LinearLayoutManager
import com.nalenyi.recyclerview_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList = Addition(100)
        println(numberList)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = NumberRecycleViewAdapter(numberList)
    }

    fun Addition(size: Int): List<Int> {
        var list = ArrayList<Int>()
        var numb1 = 0
        var numb2 = 1
        var num = 0
        while (num <= size) {
            println(numb1)
            var sum = numb1 + numb2
            numb1 = numb2
            numb2 = sum
            num++
            list += sum

        }
        return list
    }
}
