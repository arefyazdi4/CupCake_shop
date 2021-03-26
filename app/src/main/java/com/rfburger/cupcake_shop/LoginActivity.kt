package com.rfburger.cupcake_shop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val forgotMail : TextView = findViewById(R.id.ForgotEmail_text)
        forgotMail.setOnClickListener {
            Toast.makeText(this, "try remember it", Toast.LENGTH_SHORT).show()
        }

        val enteredEmail : EditText = findViewById(R.id.login_EmailAddress)

        val nextButton : Button = findViewById(R.id.Next_button)
        nextButton.setOnClickListener {
            val emailAddress = enteredEmail.text.toString()
            if(emailAddress.isNotEmpty()){
                val licenseAgreementIntent = Intent(this , LicenseAgreement::class.java)
                licenseAgreementIntent.putExtra("key_emailAddress" , emailAddress)
                startActivity(licenseAgreementIntent)
            }else{
                Toast.makeText(this , R.string.email_error_message , Toast.LENGTH_SHORT).show()
            }
        }

        val createNewAccount :Button = findViewById(R.id.Create_account)
        createNewAccount.setOnClickListener {
            val createAccountDialogBuilder = AlertDialog.Builder(this)
                    .setTitle("How to create")
                    .setMessage("You can make new one just by enter new email in mail box")
                    .setPositiveButton("got it"){ _, _ ->
                        Toast.makeText(this, "SO keep going" , Toast.LENGTH_SHORT).show()
                    }
                    .setNeutralButton("cancel"){_,_ ->
                        Toast.makeText(this, "so never mind" , Toast.LENGTH_SHORT).show()
                    }
                    .setOnDismissListener{
                        Toast.makeText(this, "or you can use phone number" , Toast.LENGTH_SHORT).show()
                    }
            createAccountDialogBuilder.show()
        }



    }
}