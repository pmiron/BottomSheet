package md.holatech.boottomsheet.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_modal_bottom_sheet.*
import md.holatech.boottomsheet.R
import md.holatech.boottomsheet.modal.CustomBottomSheetDialogFragment

class ModalBottomSheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modal_bottom_sheet)

        showBottomSheetButton.setOnClickListener {
            val customBottomSheetDialogFragment = CustomBottomSheetDialogFragment()
            customBottomSheetDialogFragment.show(
                supportFragmentManager,
                CustomBottomSheetDialogFragment.TAG
            )
        }
    }
}
