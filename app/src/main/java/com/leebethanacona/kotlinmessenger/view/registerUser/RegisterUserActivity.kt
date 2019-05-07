package com.leebethanacona.kotlinmessenger.view.registerUser

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.leebethanacona.kotlinmessenger.MainActivity
import com.leebethanacona.kotlinmessenger.R
import com.leebethanacona.kotlinmessenger.view.login.LoginActivity
import kotlinx.android.synthetic.main.activity_register_user.*

class RegisterUserActivity : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        butRegister.setOnClickListener {

        }

        tvHaveAccount.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
