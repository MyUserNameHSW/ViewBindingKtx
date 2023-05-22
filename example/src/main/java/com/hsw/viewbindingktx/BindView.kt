package com.hsw.viewbindingktx

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import com.hsw.viewbinding_ktx.viewBinding
import com.hsw.viewbindingktx.databinding.ViewBindBinding

/**
 * @author: HSW
 * @data: 2023/5/22
 * @desc:
 */
class BindView @JvmOverloads constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int = 0): FrameLayout(context, attrs, defStyleAttr) {
    private val binding by viewBinding<ViewBindBinding>()

    init {
        binding.viewRoot.setBackgroundColor(ContextCompat.getColor(context, android.R.color.holo_blue_bright))
    }
}
