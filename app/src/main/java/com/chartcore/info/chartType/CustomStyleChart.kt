package com.chartcore.info.chartType

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection

object CustomStyleChart {

    fun configureColorfulColumnChart(): AAChartModel {
        return AAChartModel()
            .chartType(AAChartType.Column)
            .title("Colorful Column Chart")
            .subtitle("single data array colorful column chart")
            .colorsTheme(arrayOf("#febc0f", "#FF14d4", "#0bf8f5", "#F33c52", "#1904dd"))
            .series(arrayOf(
                AASeriesElement()
                    .name("东京")
                    .data(arrayOf(149.9, 171.5, 106.4, 129.2, 144.0, 176.0, 135.6, 188.5, 276.4, 214.1, 95.6, 54.4))
                    .colorByPoint(true)))
    }



     fun configureAreaChartThreshold(): AAChartModel {
        val gradientColorDic1 = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            "rgba(30, 144, 255,1)", //DodgerBlue, alpha 透明度 1
            "rgba(30, 144, 255,0.1)"//DodgerBlue, alpha 透明度 0.1
        )

        return AAChartModel()
            .chartType(AAChartType.Area)
            .title("")
            .yAxisTitle("")//设置Y轴标题
            .yAxisGridLineWidth(0f)
            .categories(arrayOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Spe", "Oct", "Nov", "Dec"))
            .dataLabelsEnabled(false)//是否显示值
            .markerRadius(8f)
            .markerSymbol(AAChartSymbolType.Circle)
            .markerSymbolStyle(AAChartSymbolStyleType.InnerBlank)
            .legendEnabled(false)
            .series(arrayOf(
                AASeriesElement()
                    .threshold(-200f)
                    .data(arrayOf(106.4, 129.2, 269.9, -100.5, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4))
                    .lineWidth(6f)
                    .color("rgba(30, 144, 255,1)")
                    .fillColor(gradientColorDic1)))
    }



}