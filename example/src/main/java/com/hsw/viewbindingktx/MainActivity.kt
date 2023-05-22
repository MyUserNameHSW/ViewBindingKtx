package com.hsw.viewbindingktx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hsw.viewbinding_ktx.viewBinding
import com.hsw.viewbindingktx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewBinding by viewBinding<ActivityMainBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewBinding.tvText.text = getString(R.string.string_hello)
        supportFragmentManager.beginTransaction().add(R.id.container, BindFragment()).commit()
    }
}