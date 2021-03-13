package md.holatech.boottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstButton.setOnClickListener {
            val mBottomSheetFragment = ModalBottomSheet()
            mBottomSheetFragment.show(supportFragmentManager, "MY_BOTTOM_SHEET")
        }
    }
}