package br.com.textsfilds.guedes.textfilds

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun validarCampo() {
        if (et_email.text.toString().isEmpty()) {
            txtlayout_email.isErrorEnabled = true
            txtlayout_email.error = "Preencha com seu email"
        } else {
            txtlayout_email.isErrorEnabled = false
        }
        if (et_senha.getText().toString().isEmpty()) {
            txtlayout_passwd.isErrorEnabled = true
            txtlayout_passwd.error = "Preencha com seu password"
        } else {
            txtlayout_passwd.isErrorEnabled = false
        }
    }

    fun enviar(view: View) {
        validarCampo()
    }
}
