package com.greenmily.profiler

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IconInteractionCallBack {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(iconRecycler){
            layoutManager = GridLayoutManager(this@MainActivity, 4)
            adapter = IconAdapter(setData(), this@MainActivity)
        }
    }

    private fun setData(): List<Icondata> {
        return listOf(
            Icondata("https://www.facebook.com/fataia1", "Facebook", R.drawable.facebook),
            Icondata("https://www.github.com/rhemi7", "Github", R.drawable.github),
            Icondata("https://www.gmail.com/adelefatai", "Gmail", R.drawable.gmail),
            Icondata("https://www.google.com","Google+", R.drawable.googleplus),
            Icondata("https://www.instagram.com/Adele.aderemi", "instagram", R.drawable.instagram),
            Icondata("https://www.linkedin.com/in/fatai-adele-543262112", "LinkedIn", R.drawable.linkedin),
            Icondata("https://play.google.com", "PlayStore", R.drawable.playstore),
            Icondata("https://skype.com","Skype", R.drawable.skype),
            Icondata("https://www.telegram.org", "Telegram", R.drawable.telegram),
            Icondata("https://www.whatsapp.com", "WhatsApp", R.drawable.whatsapp),
            Icondata("https://www.yahoomail.com", "YahooMail", R.drawable.yahoo),
            Icondata("https://www.twitter.com/FataiAdele", "Twitter", R.drawable.twitter),
            Icondata("adelefatai@gmail.com", "Email", R.drawable.email),
            Icondata("https://www.youtube.com/adelefatai", "Youtube", R.drawable.youtube),
            Icondata("https://www.bitbucket.com", "Bitbucket", R.drawable.bitbucket),
            Icondata("https://www.dribbble.com", "Dribbble", R.drawable.dribbble)
        )
    }

    override fun onClick(item: Icondata) {
        val intent = Intent()
        intent.data = Uri.parse(item.URL)
        intent.action = Intent.ACTION_VIEW
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main Activity", "onStart Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main Activity", "onStop Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main Activity", "onPause Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main Activity", "onResume Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main Activity", "onDestroy Called")
    }

}
