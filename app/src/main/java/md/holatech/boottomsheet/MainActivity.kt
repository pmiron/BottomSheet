package md.holatech.boottomsheet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import md.holatech.boottomsheet.activity.ModalBottomSheetActivity
import md.holatech.boottomsheet.fragment.ModalWithFragmentBottomSheetActivity
import md.holatech.boottomsheet.navigation.ModalMainNavigationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstButton.setOnClickListener {
            val intent = Intent(applicationContext, ModalMainNavigationActivity::class.java)
            startActivity(intent)
        }

        secondButton.setOnClickListener {
            val intent = Intent(applicationContext, ModalBottomSheetActivity::class.java)
            startActivity(intent)
        }

        thirdButton.setOnClickListener {
            val intent =
                Intent(applicationContext, ModalWithFragmentBottomSheetActivity::class.java)
            startActivity(intent)
        }
    }
}
