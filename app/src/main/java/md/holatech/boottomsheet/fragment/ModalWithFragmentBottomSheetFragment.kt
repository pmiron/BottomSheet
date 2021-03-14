package md.holatech.boottomsheet.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_modal_with_fragment_bottom_sheet.*
import md.holatech.boottomsheet.R
import md.holatech.boottomsheet.modal.CustomBottomSheetDialogFragment

class ModalWithFragmentBottomSheetFragment :
    Fragment(R.layout.fragment_modal_with_fragment_bottom_sheet) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showBottomSheetButton.setOnClickListener {
            val customBottomSheetDialogFragment = CustomBottomSheetDialogFragment()
            customBottomSheetDialogFragment.show(
                requireActivity().supportFragmentManager,
                CustomBottomSheetDialogFragment.TAG
            )
        }
    }
}