package dev.alexfranco.mtw.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var EsFrag : Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton.setOnClickListener {
            val fragmento2 = fragmento2()
            val fragmento3 = fragmento3()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()

            if(EsFrag) {
                EsFrag = false
                transaction.replace(R.id.scroll, fragmento3)
                transaction.addToBackStack(null)
                transaction.commit()
            } else {
                EsFrag = true
                transaction.replace(R.id.scroll, fragmento2)
                transaction.addToBackStack(null)
                transaction.commit()
            }

        }
    }
}
