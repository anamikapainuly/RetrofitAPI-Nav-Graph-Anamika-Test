package com.anupras.apl.anamika_test.ui.weather.future.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anupras.apl.anamika_test.R
import com.anupras.apl.anamika_test.adapter.ForecastsWeatherAdapter
import com.anupras.apl.anamika_test.constant.CITY_NAME
import com.anupras.apl.anamika_test.constant.NO_OF_DAYS
import com.anupras.apl.anamika_test.constant.UNIT
import com.anupras.apl.anamika_test.data.ForecastDetail
import com.anupras.apl.anamika_test.service.OpenWeatherApiService
import kotlinx.android.synthetic.main.future_list_weather_fragment.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FutureListWeatherFragment : Fragment() {

    companion object {
        fun newInstance() =
            FutureListWeatherFragment()
    }

    private lateinit var viewModel: FutureListWeatherViewModel

    protected lateinit var rootView: View
    lateinit var recyclerView: RecyclerView
    var dataList= ArrayList<ForecastDetail> ()
    var myAdapter: ForecastsWeatherAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.future_list_weather_fragment, container, false);
        initView()
        return rootView
    }

    private fun initView() {
        initializeRecyclerView()
    }

    //Initializing recycler view
    private fun initializeRecyclerView() {
        recyclerView = rootView.findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        //recyclerView.adapter = adapter
        myAdapter = activity?.let { ForecastsWeatherAdapter(dataList, it) }
        recyclerView.adapter = myAdapter
        myAdapter?.notifyDataSetChanged();

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FutureListWeatherViewModel::class.java)
        // TODO: Use the ViewModel


        val apiService = OpenWeatherApiService()

        GlobalScope.launch(Dispatchers.Main) {
            val futuretWeatherResponse =
                apiService.getFutureWeather(CITY_NAME, UNIT, NO_OF_DAYS).await()
            if (futuretWeatherResponse != null) {
                futuretWeatherResponse.forecast?.let { dataList.addAll(it)
                    recyclerView.adapter!!.notifyDataSetChanged()
                }
                Log.d("Response - DataList", "" + dataList)
            }
        }

    }

}