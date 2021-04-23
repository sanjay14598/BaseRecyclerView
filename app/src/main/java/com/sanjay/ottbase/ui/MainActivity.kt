package com.sanjay.ottbase.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sanjay.ottbase.Product
import com.sanjay.ottbase.ProductAdapter
import com.sanjay.ottbase.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter by lazy {
        ProductAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val products = listOf(
            Product(
                R.drawable.mastercard,
                "Master Cards..!!",
                "Facebook (stylized as facebook) is an American online social media and social networking service based in Menlo Park, California, and a flagship service of the ..",
                400000000.0,
                "4.5"
            ),
            Product(
                R.drawable.you,
                "You Tube Social Media..!!",
                "Facebook (stylized as facebook) is an American online social media and social networking service based in Menlo Park, California, and a flagship service of the ..",
                400000000.0,
                "4.5"
            ),
            Product(
                R.drawable.logo,
                "Logo Social Media..!!",
                "Facebook (stylized as facebook) is an American online social media and social networking service based in Menlo Park, California, and a flagship service of the ..",
                400000000.0,
                "4.5"
            ),
            Product(
                R.drawable.facebook,
                "Facebook Social Media..!!",
                "Facebook (stylized as facebook) is an American online social media and social networking service based in Menlo Park, California, and a flagship service of the ..",
                400000000.0,
                "4.5"
            ),
            Product(
                R.drawable.instagram,
                "Instagram clone..!!!",
                "Facebook (stylized as facebook) is an American online social media and social networking service based in Menlo Park, California, and a flagship service of the ..",
                50000.0,
                "4.7"
            ),
            Product(
                R.drawable.whatsapp,
                "WhatsApp Clone..!!",
                "WhatsApp was founded by Jan Koum and Brian Acton who had previously spent 20 years combined at Yahoo. WhatsApp joined Facebook in 2014, but continues",
                50000.0,
                "4.7"
            )
        )
        recyclerView.adapter = adapter
        adapter.addItems(products)

        adapter.listener = { view, item, position ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }
    }
}