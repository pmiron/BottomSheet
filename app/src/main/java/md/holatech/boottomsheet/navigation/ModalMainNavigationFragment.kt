package md.holatech.boottomsheet.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_modal_main_navigation.*
import md.holatech.boottomsheet.R

class ModalMainNavigationFragment : Fragment(R.layout.fragment_modal_main_navigation) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showBottomSheetButton.setOnClickListener {
            findNavController().navigate(R.id.action_modalMainNavigationFragment_to_customBottomSheetDialogFragment)
        }
    }
}
