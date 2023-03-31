package teameverywhere.personal.recyclerinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import teameverywhere.personal.recyclerinfragment.databinding.ActivityMainBinding
import teameverywhere.personal.recyclerinfragment.model.TestData
import teameverywhere.personal.recyclerinfragment.view.fragment.HomeFragment

//Todo: Package는 View, Model, Controller
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        dataList()
    }

    private fun init(){
        var manager = supportFragmentManager.beginTransaction().apply {
            add(R.id.container, HomeFragment())
            commit()
        }
    }

    private fun bindViews() = with(binding){
        //Todo Binding 사용할 때 여기에 쓰기
    }

    private fun dataList(){
        var dataList: ArrayList<TestData> = arrayListOf(
            TestData("첫 번째 데이터1", "두 번째 데이터1", "세 번째 데이터1"),
            TestData("첫 번째 데이터2", "두 번째 데이터2", "세 번째 데이터2"),
            TestData("첫 번째 데이터3", "두 번째 데이터3", "세 번째 데이터3"),
            TestData("첫 번째 데이터4", "두 번째 데이터4", "세 번째 데이터4"),
            TestData("첫 번째 데이터5", "두 번째 데이터5", "세 번째 데이터5"),
            TestData("첫 번째 데이터6", "두 번째 데이터6", "세 번째 데이터6"),
            TestData("첫 번째 데이터7", "두 번째 데이터7", "세 번째 데이터7"),
            TestData("첫 번째 데이터8", "두 번째 데이터8", "세 번째 데이터8"),
            TestData("첫 번째 데이터9", "두 번째 데이터9", "세 번째 데이터9"),
            TestData("첫 번째 데이터10", "두 번째 데이터10", "세 번째 데이터10"),
            TestData("첫 번째 데이터11", "두 번째 데이터11", "세 번째 데이터11"),
            TestData("첫 번째 데이터12", "두 번째 데이터12", "세 번째 데이터12"),
            TestData("첫 번째 데이터13", "두 번째 데이터13", "세 번째 데이터13"),
            TestData("첫 번째 데이터14", "두 번째 데이터14", "세 번째 데이터14"),
            TestData("첫 번째 데이터15", "두 번째 데이터15", "세 번째 데이터15")
        )

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(
            R.id.container,
            HomeFragment()
        )
        transaction.commit()
        intent.putExtra("DataList", dataList)
    }

}

