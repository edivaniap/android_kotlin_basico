package br.com.edivaniadev.diasdasemana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        highlightCurrentDay()
    }

    private fun highlightCurrentDay() {
        val today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

        val textViewIds = arrayOf(
            R.id.textViewSunday,
            R.id.textViewMonday,
            R.id.textViewTuesday,
            R.id.textViewWednesday,
            R.id.textViewThursday,
            R.id.textViewFriday,
            R.id.textViewSaturday
        )

        val textViewToday = findViewById<TextView>(textViewIds[today - 1])

        textViewToday.setTextColor(ContextCompat.getColor(this, R.color.green))
    }
}