package com.chartcore.info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.chartcore.info.chartType.*
import com.chartcore.info.databinding.ActivitySingleChartBinding
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions

class SingleChart : AppCompatActivity() {

    private lateinit var binding: ActivitySingleChartBinding
    private var aaOptions: AAOptions? = null
    private var chartModel: AAChartModel? = null

    companion object{
        const val TAG = "SingleChart"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_single_chart)




        binding.apply {

           val type = intent.extras?.get("chart").toString()
//            Toast.makeText(this@SingleChart,type,Toast.LENGTH_SHORT).show()

            initChart(type)

            if (aaOptions != null){
                AAChartView.aa_drawChartWithChartOptions(aaOptions!!)
            }

            if(chartModel != null){
                AAChartView.aa_drawChartWithChartModel(chartModel!!)
            }

        }




    }


    private fun initChart(chart: String) {

        when(chart){

            ChartName.customXAxisCrossHairStyle ->{
                aaOptions = DrawChartWithAAOptions.customXAxisCrossHairStyle()
            }
            ChartName.dataLabelsXAxisYAxisLegendStyle ->{
                aaOptions = DrawChartWithAAOptions.configure_DataLabels_XAXis_YAxis_Legend_Style()
            }
            ChartName.configurationDoubleYaxisAndColumnLineMixedChart ->{
                aaOptions = DrawChartWithAAOptions.configureDoubleYAxesAndColumnLineMixedChart()
            }
            ChartName.barChart ->{
                aaOptions = ScrollableChart.configureColumnChartAndBarChartStyle()
            }
            ChartName.pieChart ->{
               chartModel =  SpecialTypeChart.configurePieChart()
            }
            ChartName.areaRangeMixedLine ->{
               chartModel = MixedChartCompose.areaRangeMixedLine()
            }
            ChartName.colorfulColumnChart ->{
                chartModel = CustomStyleChart.configureColorfulColumnChart()
            }
            ChartName.areaChatThreshold ->{
                chartModel = CustomStyleChart.configureAreaChartThreshold()
            }

            else->{
                Log.i(TAG,"Unknown chart")
                aaOptions = null
                chartModel = null
            }

         }



    }

}