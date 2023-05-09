package com.example.genjutsucom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val Pref = this.getPreferences(MODE_PRIVATE)
        val editor = Pref.edit()

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE

        auth = Firebase.auth

        val logintext: TextView = findViewById(R.id.textView_login_now)

        logintext.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            finish()
        }

        val registerButton: Button = findViewById(R.id.button_register)

        registerButton.setOnClickListener {
            performSignUp()
        }

    }

    private fun performSignUp(){
        val email = findViewById<EditText>(R.id.editText_email_register)
        val password = findViewById<EditText>(R.id.editText_password_register)

        val intent = Intent(this, RegisterActivity::class.java)
        intent.putExtra(Constants.USER_NAME, email.toString())
        startActivity(intent)

        val PrefRegister = this.getPreferences(MODE_PRIVATE)
        val editor = PrefRegister.edit()

        if (email.text.isEmpty() || password.text.isEmpty()){
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT)
                .show()
            return
        }

        val inputEmail = email.text.toString()
        val inputPassword = password.text.toString()

        auth.createUserWithEmailAndPassword(inputEmail, inputPassword)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information

                    editor.putString("email", inputEmail)

                    val intent = Intent(this, LobbyActivity::class.java)
                    intent.putExtra(Constants.USER_NAME, email.text.toString())
                    startActivity(intent)

                    Toast.makeText(
                        baseContext, "Success",
                        Toast.LENGTH_SHORT
                    ).show()

                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(
                        baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            .addOnFailureListener {
                Toast.makeText(this, "Error ocurred ${it.localizedMessage}", Toast.LENGTH_SHORT)
                    .show()
            }
    }
}