package com.chartcore.info.chartType

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement

object SpecialTypeChart {


    fun configurePieChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Pie)
            .backgroundColor("#ffffff")
            .title("LANGUAGE MARKET SHARES JANUARY,2020 TO MAY")
            .subtitle("virtual data")
            .colorsTheme(arrayOf("#0c9674", "#7dffc0", "#d11b5f", "#facd32", "#ffffa0",))
            .dataLabelsEnabled(true)//是否直接显示扇形图数据
            .yAxisTitle("℃")
            .series(arrayOf(
                AASeriesElement()
                    .name("Language market shares")
                    .data(arrayOf(
                        arrayOf("Java",   67),
                        arrayOf("Swift", 999),
                        arrayOf("Python", 83),
                        arrayOf("OC",     11),
                        arrayOf("Go",     30)
                    ))))
    }



}