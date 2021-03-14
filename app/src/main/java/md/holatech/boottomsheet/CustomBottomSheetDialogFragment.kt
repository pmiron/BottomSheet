package md.holatech.boottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_custom_bottom_sheet_dialog.*

class CustomBottomSheetDialogFragment : BottomSheetDialogFragment() {
    companion object {
        const val TAG = "CustomBottomSheetDialogFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_custom_bottom_sheet_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstButton.setOnClickListener {
            Toast.makeText(context, "First Button Clicked", Toast.LENGTH_SHORT).show()
        }
        secondButton.setOnClickListener {
            Toast.makeText(context, "Second Button Clicked", Toast.LENGTH_SHORT).show()
        }
        thirdButton.setOnClickListener {
            Toast.makeText(context, "Third Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
