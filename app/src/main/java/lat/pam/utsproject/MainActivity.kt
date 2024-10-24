package lat.pam.utsproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.etUsername)
        val passwordEditText = findViewById<EditText>(R.id.etPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {
            val inputUsername = usernameEditText.text.toString()
            val inputPassword = passwordEditText.text.toString()

            val validUsername = "admin"
            val validPassword = "admin"

            if (inputUsername == validUsername && inputPassword == validPassword) {
                // login berhasil lanjut ke ListFoodActivity
                val intent = Intent(this, ListFoodActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
