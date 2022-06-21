package developer.abdusamid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import developer.abdusamid.instagram.R
import developer.abdusamid.instagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val secondFragment = SecondFragment()
        val homeFragment = HomeFragment()
        val fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction().add(R.id.my_container, homeFragment).commit()

        binding.home.setOnClickListener {
            fragmentManager.beginTransaction().replace(R.id.my_container, secondFragment).commit()
        }
        binding.MyProfile.setOnClickListener {
            fragmentManager.beginTransaction().replace(R.id.my_container, homeFragment).commit()
        }
    }
}