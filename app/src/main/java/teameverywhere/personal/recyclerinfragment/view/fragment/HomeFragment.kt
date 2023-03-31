package teameverywhere.personal.recyclerinfragment.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import teameverywhere.personal.recyclerinfragment.databinding.FragmentHomeBinding
import teameverywhere.personal.recyclerinfragment.model.TestData

@Suppress("DEPRECATION", "UNCHECKED_CAST")
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    // RecyclerView.adapter에 지정할 Adapter
    private lateinit var listAdapter: teameverywhere.personal.recyclerinfragment.view.adapter.ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var list: ArrayList<TestData> =
            requireActivity().intent!!.extras!!.get("DataList") as ArrayList<TestData>
        Log.e("FirstFragment", "Data List: $list")

        // Fragment에서 전달받은 list를 넘기면서 ListAdapter 생성
        listAdapter = teameverywhere.personal.recyclerinfragment.view.adapter.ListAdapter(list)
        bindViews()

    }

    private fun bindViews() = with(binding){
        rvView.layoutManager =
            LinearLayoutManager(activity, RecyclerView.VERTICAL, false)

        // RecyclerView.adapter에 지정
        rvView.adapter = listAdapter
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }
}