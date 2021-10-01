package edu.nmhu.bssd5250.question4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val constraintLayout = ConstraintLayout( this)
        val relative = RelativeLayout( this)
        val blueButton = Button( this).apply {
            layoutParams = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT)
            text = "Turn Blue"
        }

        val blueText = TextView(this).apply {
            text = "Turn everythin blue by clicking the button below."
        }
        setContentView(constraintLayout)
        constraintLayout.addView(blueText)
        
        //val my_image = findViewById(R.id.my_image) as ImageView
        val my_image = ImageView(this)
        // set on-click listener
        my_image.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "My Imaage was Clicked.", Toast.LENGTH_SHORT).show()
        }

        val redButton = Button(this).apply {
            layoutParams = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
            )
            text = "Turn Red"
        }

        relative.addView(redButton)
        relative.addView(blueButton)
        relative.addView(my_image)
        constraintLayout.addView(relative)
        setContentView(constraintLayout)
    }
}