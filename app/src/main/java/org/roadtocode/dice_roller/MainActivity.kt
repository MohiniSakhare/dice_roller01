package org.roadtocode.dice_roller

import android.media.MediaPlayer
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnRoll)
        val tvFace: TextView = findViewById(R.id.tvFace)
        val ivFace: ImageView = findViewById(R.id.ivFace)
        val im1: ImageView = findViewById(R.id.im1)
        val im2: ImageView = findViewById(R.id.im2)


        val anim = AnimationUtils.loadAnimation(this,R.anim.rotate)
        ivFace.startAnimation(anim)

        val player = MediaPlayer.create(this,R.raw.sound)

        btnRoll.setOnClickListener{
            player.start()
            val randomNum = (1..6).random()
            val anim = AnimationUtils.loadAnimation(this, R.anim.rotate)
            tvFace.text = randomNum.toString()

            if(randomNum==1)
            {
                ivFace.setImageResource(R.drawable.dice1)
                im1.setImageResource(R.drawable.star)
                im2.setImageResource(R.drawable.star)

            }
            else if(randomNum==2)
            {
                ivFace.setImageResource(R.drawable.dice2)
                im1.setImageResource(R.drawable.star)
                im2.setImageResource(R.drawable.star)

            }
            else if(randomNum==3)
            {
                ivFace.setImageResource(R.drawable.dice3)
                im1.setImageResource(R.drawable.star)
                im2.setImageResource(R.drawable.star)

            }
            else if(randomNum==4)
            {
                ivFace.setImageResource(R.drawable.dice4)
                im1.setImageResource(R.drawable.star)
                im2.setImageResource(R.drawable.star)

            }
            else if(randomNum==5)
            {
                ivFace.setImageResource(R.drawable.dice5)
            }
            else if(randomNum==6) {
                ivFace.setImageResource(R.drawable.dice6)
                im1.setImageResource(R.drawable.cele1)
                im2.setImageResource(R.drawable.cele3)

            }
        }



    }
}