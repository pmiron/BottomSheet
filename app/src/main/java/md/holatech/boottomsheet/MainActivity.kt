package md.holatech.boottomsheet

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import md.holatech.boottomsheet.activity.BottomSheetActivity
import md.holatech.boottomsheet.navigation.MainNavigationActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstContentButton.setOnClickListener {
            val intent = Intent(applicationContext, MainNavigationActivity::class.java)
            startActivity(intent)
        }

        secondContentButton.setOnClickListener {
            val intent = Intent(applicationContext, BottomSheetActivity::class.java)
            startActivity(intent)
        }
    }
}
