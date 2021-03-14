package md.holatech.boottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_custom_bottom_sheet_dialog.*

class CustomBottomSheetDialogFragment : BottomSheetDialogFragment() {
    companion object {
        const val TAG = "CustomBottomSheetDialogFragment"
    }

    override fun getTheme(): Int = R.style.BottomSheetMenuTheme

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_custom_bottom_sheet_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (dialog as BottomSheetDialog).behavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        Toast.makeText(context, "STATE_COLLAPSED", Toast.LENGTH_SHORT).show()
                    }
                    BottomSheetBehavior.STATE_HIDDEN -> {
                        Toast.makeText(context, "STATE_HIDDEN", Toast.LENGTH_SHORT).show()
                    }
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        Toast.makeText(context, "STATE_EXPANDED", Toast.LENGTH_SHORT).show()
                    }
                    BottomSheetBehavior.STATE_DRAGGING -> {
                        Toast.makeText(context, "STATE_DRAGGING", Toast.LENGTH_SHORT).show()
                    }
                    BottomSheetBehavior.STATE_SETTLING -> {
                        Toast.makeText(context, "STATE_SETTLING", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                Toast.makeText(context, "On Slide", Toast.LENGTH_SHORT).show()
            }
        })

        firstContentButton.setOnClickListener {
            Toast.makeText(context, "First Button Clicked", Toast.LENGTH_SHORT).show()
        }
        secondContentButton.setOnClickListener {
            Toast.makeText(context, "Second Button Clicked", Toast.LENGTH_SHORT).show()
        }
        thirdContentButton.setOnClickListener {
            Toast.makeText(context, "Third Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
