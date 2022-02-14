package com.chartcore.info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.chartcore.info.chartType.ChartName
import com.chartcore.info.databinding.ActivityMainBinding
import com.github.aachartmodel.aainfographics.aachartcreator.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.apply {



            btnDoubleChartLinkedWork.setOnClickListener {
                goToDoubleChartLinkedActivity()
            }

            btnCustomXAxisCrossHairStyle.setOnClickListener {
                goToSingleChartActivity(ChartName.customXAxisCrossHairStyle)
            }

            btnAreaChartThreshold.setOnClickListener {
                goToSingleChartActivity(ChartName.areaChatThreshold)
            }

            btnAreaRangeMixedLine.setOnClickListener {
                goToSingleChartActivity(ChartName.areaRangeMixedLine)
            }

            btnBarChart.setOnClickListener {
                goToSingleChartActivity(ChartName.barChart)
            }

            btnColorfulColumnChart.setOnClickListener {
                goToSingleChartActivity(ChartName.colorfulColumnChart)
            }

            btnConfigurationDoubleYAxisAndColumnLineMixedChart.setOnClickListener {
                goToSingleChartActivity(ChartName.configurationDoubleYaxisAndColumnLineMixedChart)
            }

            btnPieChart.setOnClickListener {
                goToSingleChartActivity(ChartName.pieChart)
            }

            btnDataLabelsXAxisYAxisLegendStyle.setOnClickListener {
                goToSingleChartActivity(ChartName.dataLabelsXAxisYAxisLegendStyle)
            }



        }





    }



    private fun goToDoubleChartLinkedActivity(){
        val intent = Intent(this,DoubleChartLinkedWorkActivity::class.java)
        startActivity(intent)
    }

    private fun goToSingleChartActivity(type: String){
        val intent = Intent(this,SingleChart::class.java)
        intent.putExtra("chart",type)
        startActivity(intent)
    }




}

