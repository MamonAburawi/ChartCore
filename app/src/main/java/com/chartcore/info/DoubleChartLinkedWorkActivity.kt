package com.chartcore.info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.chartcore.info.chartType.DoubleChartsLinkedWork
import com.chartcore.info.databinding.ActivityDoubleChartLinkedWorkBinding

class DoubleChartLinkedWorkActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDoubleChartLinkedWorkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_double_chart_linked_work)



        binding.apply {

            AAChartView1.aa_drawChartWithChartOptions(DoubleChartsLinkedWork
                .configureChartOptions1(this@DoubleChartLinkedWorkActivity))
            AAChartView2.aa_drawChartWithChartOptions(DoubleChartsLinkedWork
                .configureChartOptions2(this@DoubleChartLinkedWorkActivity))

        }


    }
}