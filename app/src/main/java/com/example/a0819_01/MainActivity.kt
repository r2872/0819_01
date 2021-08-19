package com.example.a0819_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a0819_01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null

    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.logBtn01.setOnClickListener {
//            무슨 말을 적어도 괜찮다, (메모 - 주석)
//            Ctrl + / : 주석 단축키
            Log.d("mainActivity","첫번째 로그 버튼이 눌렸습니다.")
        }

        binding.logBtn02.setOnClickListener {
            Log.d("mainActivity","두번째 로그 버튼이 눌렸습니다.")
        }
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}