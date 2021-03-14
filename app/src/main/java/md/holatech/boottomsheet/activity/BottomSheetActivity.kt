package md.holatech.boottomsheet.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottom_sheet.*
import md.holatech.boottomsheet.CustomBottomSheetDialogFragment
import md.holatech.boottomsheet.R

class BottomSheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        showBottomSheetButton.setOnClickListener {
            val mBottomSheetFragment = CustomBottomSheetDialogFragment()
            mBottomSheetFragment.show(supportFragmentManager, CustomBottomSheetDialogFragment.TAG)
        }
    }
}
