package com.hsw.viewbindingktx

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hsw.viewbinding_ktx.viewBinding
import com.hsw.viewbindingktx.databinding.FragmentBindBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BindFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BindFragment : Fragment(R.layout.fragment_bind) {

    private val viewBinding by viewBinding<FragmentBindBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.tvText.text = getString(R.string.hello_blank_fragment)
    }
}