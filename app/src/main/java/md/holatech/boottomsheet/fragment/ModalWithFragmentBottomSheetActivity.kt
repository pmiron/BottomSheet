package md.holatech.boottomsheet.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import md.holatech.boottomsheet.R


class ModalWithFragmentBottomSheetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modal_with_fragment_bottom_sheet)

        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragmentFrameLayout, ModalWithFragmentBottomSheetFragment())
        ft.commit()
    }
}