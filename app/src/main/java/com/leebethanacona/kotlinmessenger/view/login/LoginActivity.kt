package com.leebethanacona.kotlinmessenger.view.login

import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.leebethanacona.kotlinmessenger.MainActivity
import com.leebethanacona.kotlinmessenger.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : MainActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        butLogin.setOnClickListener {
            val email = editEmailLogin.text.toString()
            val password = editPasswordLogin.text.toString()
        }

        tvHaveAccount.setOnClickListener {
            finish()
        }
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        updateUI(currentUser)
    }

    private fun updateUI(currentUser: FirebaseUser?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
