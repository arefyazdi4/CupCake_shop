package com.rfburger.cupcake_shop

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LicenseAgreement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_license_agreement)

        title = "License Agreement"
        val emailAddress = intent.getStringExtra("key_emailAddress")

        val licenseText :TextView = findViewById(R.id.licenseText)
        licenseText.movementMethod = ScrollingMovementMethod()

        val emailVerify :TextView = findViewById(R.id.email_verify)
        emailVerify.text = getString(R.string.email_verify , emailAddress)

    }

}