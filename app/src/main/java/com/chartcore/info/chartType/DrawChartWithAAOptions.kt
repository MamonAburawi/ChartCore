@file:Suppress("FunctionName")

package com.chartcore.info.chartType

import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAColor
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor
import com.github.aachartmodel.aainfographics.aatools.AALinearGradientDirection



object DrawChartWithAAOptions {

    fun customXAxisCrossHairStyle(): AAOptions {
        val x = AASeriesElement()
            .name("2020")
            .color(AAGradientColor.OceanBlue)
            .data(arrayOf(
                arrayOf(12464064, 25.5),
                arrayOf(12464928, 22.1),
                arrayOf(12465792, 23.2),
                arrayOf(12466656, 23.8),
                arrayOf(12467520, 21.4),
                arrayOf(12468384, 21.3),
                arrayOf(12469248, 18.3),
                arrayOf(12470112, 15.4),
                arrayOf(12470976, 16.4),
                arrayOf(12471840, 17.7),
                arrayOf(12472704, 17.5),
                arrayOf(12473568, 17.6),
                arrayOf(12474432, 17.7),
                arrayOf(12475296, 16.8),
                arrayOf(12476160, 17.7),
                arrayOf(12477024, 16.3),
                arrayOf(12477888, 17.8),
                arrayOf(12478752, 18.1),
                arrayOf(12479616, 17.2),
                arrayOf(12480480, 14.4),
                arrayOf(12481344, 13.7),
                arrayOf(12482208, 15.7),
                arrayOf(12483072, 14.6),
                arrayOf(12483936, 15.3),
                arrayOf(12484800, 15.3),
                arrayOf(12485664, 15.8),
                arrayOf(12486528, 15.2),
                arrayOf(12487392, 14.8),
                arrayOf(12488256, 14.4),
                arrayOf(12489120, 15.5),
                arrayOf(12489945, 13.6)
            ))

        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)// chart type
            .series(
                arrayOf(x)
            )

        val aaOptions = aaChartModel.aa_toAAOptions()
        val aaCrossHair = AACrosshair()
            .color(AAColor.Red)
            .width(1f)
            .dashStyle(AAChartLineDashStyleType.LongDashDotDot)
        aaOptions.xAxis?.crosshair(aaCrossHair)
        return aaOptions
    }



    fun configure_DataLabels_XAXis_YAxis_Legend_Style(): AAOptions {
        val backgroundColorGradientColor = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            "#4F00BC",
            "#29ABE2"// Color string setting supports hex type and rgba type
        )

        val fillColorGradientColor = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            "rgba(256,256,256,0.3)",
            "rgba(256,256,256,1.0)"// Color string setting supports hex type and rgba type
        )



        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline)
            .title("")
            .subtitle("")
            .backgroundColor(backgroundColorGradientColor)
            .yAxisVisible(true)
            .yAxisTitle("")
            .categories(arrayOf("Jan", "Feb", "Mar", "Apr", "May", "June",
                "July", "Aug", "Sep", "Oct", "Nov", "Dec"))
            .markerRadius(0f)
            .series(arrayOf(
                AASeriesElement()
                    .name("Berlin Hot")
                    .color(AAColor.White)
                    .lineWidth(7f)
                    .fillColor(fillColorGradientColor)
                    .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
            ))
        val aaOptions = aaChartModel.aa_toAAOptions()
        aaOptions.plotOptions?.areaspline
            ?.dataLabels(
                AADataLabels()
                .enabled(true)
                .style(
                    AAStyle()
                    .color(AAColor.Black)
                    .fontSize(14f)
                    .fontWeight(AAChartFontWeightType.Thin)))

        /** Cross Hair option **/
        val aaCrossHair = AACrosshair()
            .dashStyle(AAChartLineDashStyleType.LongDashDot)
            .color(AAColor.White)
            .width(1f)

        val aaLabels = AALabels()
            .useHTML(true)
            .style(
                AAStyle()
                .fontSize(10f)
                .fontWeight(AAChartFontWeightType.Bold)
                .color(AAColor.White))

        /** y axis option **/
        aaOptions.yAxis?.apply {
            opposite(false)
                .tickWidth(2f)
                .lineWidth(1.5f)
                .lineColor(AAColor.White)
                .gridLineWidth(0f)
                .crosshair(aaCrossHair)
                .labels(aaLabels)
        }

        /** x axis option **/
        aaOptions.xAxis?.apply {
            tickWidth(1f)// X axis thick Width
                .lineWidth(1.0f)//X axis width
                .lineColor(AAColor.White)//color of axis X
                .crosshair(aaCrossHair)
                .labels(aaLabels)
        }

        aaOptions.legend?.apply {
            itemStyle(
                AAItemStyle()
                    .color(AAColor.White)
                    .fontSize(13f)
                    .fontWeight("thin")
            )}

        return aaOptions
    }


    fun configureDoubleYAxesAndColumnLineMixedChart(): AAOptions {
        val stopsArr: Array<Any> = arrayOf(
            arrayOf(0.0, "rgba(156,107,211,0.5)"),
            arrayOf(0.2, "rgba(156,107,211,0.3)"),
            arrayOf(1.0, "rgba(156,107,211,0)")
        )
        val gradientColorDic1 = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            stopsArr
        )
        val gradientColorDic2 = AAGradientColor.linearGradient(
            AALinearGradientDirection.ToBottom,
            "#956FD4",
            "#3EACE5"
        )


        val category = arrayOf(
            "市区", "万州", "江北", "南岸", "北碚", "綦南", "长寿", "永川", "璧山", "江津",
            "城口", "大足", "垫江", "丰都", "奉节", "合川", "江津区", "开州", "南川", "彭水",
            "黔江", "石柱", "铜梁", "潼南", "巫山", "巫溪", "武隆", "秀山", "酉阳", "云阳",
            "忠县", "川东", "检修"
        )
        val goalValuesArr = arrayOf(
            18092, 20728, 24045, 28348, 32808
            , 36097, 39867, 44715, 48444, 50415
            , 56061, 62677, 59521, 67560, 18092, 20728, 24045, 28348, 32808
            , 36097, 39867, 44715, 48444, 50415, 36097, 39867, 44715, 48444, 50415
            , 50061, 32677, 49521, 32808
        )
        val realValuesArr = arrayOf(
            4600, 5000, 5500, 6500, 7500
            , 8500, 9900, 12500, 14000, 21500
            , 23200, 24450, 25250, 33300, 4600, 5000, 5500, 6500, 7500
            , 8500, 9900, 22500, 14000, 21500, 8500, 9900, 12500, 14000, 21500
            , 23200, 24450, 25250, 7500
        )

//        val rateValuesArr = arrayOfNulls<Any>(33)

//        for (i in 0..32) {
//            val goalValue: Float = goalValuesArr[i].toFloat()
//            val realValue: Float = realValuesArr[i].toFloat()
//            val rateValue = realValue / goalValue
//            rateValuesArr[i] = rateValue
//        }

        val aaChart = AAChart()
            .backgroundColor("#191E40")

        val aaTitle = AATitle()
            .text("")

        val aaLabels = AALabels()
            .enabled(true)
            .style(AAStyle()
                .color(AAColor.LightGray))

        /** this is the x axis options**/
        val aaXAxis = AAXAxis()
            .visible(true)
            .labels(aaLabels)
            .min(0f)
            .categories(category)

        val aaYAxisTitleStyle = AAStyle()
            .color("#1e90ff") //Title font color
            .fontSize(14f) //Title font size
            .fontWeight(AAChartFontWeightType.Bold) //Title font weight
            .textOutline("0px 0px contrast")

        /** y axis 1 options in left side  **/
        val yAxis1 = AAYAxis()
            .visible(true)
            .labels(aaLabels)
            .gridLineWidth(0f)
            .title(AATitle()
                .text("the values of y axis 1")
                .style(aaYAxisTitleStyle))

        /** y axis 2 options in right side  **/
        val yAxis2 = AAYAxis()
            .visible(true)
            .labels(aaLabels)
            .gridLineWidth(0f)
            .title(AATitle()
                .text("the values of y axis 2")
                .style(aaYAxisTitleStyle))
            .opposite(true)

        val aaTooltip = AATooltip().enabled(true).shared(true)

        val aaPlotOptions = AAPlotOptions().
            series(AASeries()
            .animation(AAAnimation()
                .easing(AAChartAnimationType.EaseTo)
                .duration(1000)))
            .column(AAColumn()
                .grouping(false)
                .pointPadding(0f)
                .pointPlacement(0f))

        val aaLegend = AALegend()
            .enabled(true)
            .itemStyle(AAItemStyle()
                .color(AAColor.LightGray))
            .floating(true)
            .layout(AAChartLayoutType.Horizontal)
            .align(AAChartAlignType.Left)
            .x(30f)
            .verticalAlign(AAChartVerticalAlignType.Top)
            .y(10f)

        /** option of chart 1 **/
        val goalValuesElement: AASeriesElement = AASeriesElement()
            .name("Plan Through")
            .type(AAChartType.Column)
            .borderWidth(0f)
            .color(gradientColorDic1)
            .yAxis(0)
            .data(goalValuesArr as Array<Any>)

        /** option of chart 2 **/
        val realValuesElement: AASeriesElement = AASeriesElement()
            .name("Passed Through")
            .type(AAChartType.Column)
            .borderWidth(0f)
            .color(gradientColorDic2)
            .yAxis(0)
            .data(realValuesArr as Array<Any>)

//        /** option of chart 3 **/
//        val rateValuesElement = AASeriesElement()
//            .name("Penetration Rate")
//            .type(AAChartType.Line)
//            .marker(AAMarker()
//                .radius(7f) //曲线连接点半径，默认是4
//                .symbol(AAChartSymbolType.Circle.value) //曲线点类型："circle", "square", "diamond", "triangle","triangle-down"，默认是"circle"
//                .fillColor("#ffffff") //点的填充色(用来设置折线连接点的填充色)
//                .lineWidth(3f) //外沿线的宽度(用来设置折线连接点的轮廓描边的宽度)
//                .lineColor("") //外沿线的颜色(用来设置折线连接点的轮廓描边颜色，当值为空字符串时，默认取数据点或数据列的颜色)
//            )
//            .color("#F02FC2")
//            .yAxis(1)
//            .data(rateValuesArr as Array<Any>)

        return AAOptions()
            .chart(aaChart)
            .title(aaTitle)
            .xAxis(aaXAxis)
            .yAxisArray(arrayOf(yAxis1, yAxis2))
            .tooltip(aaTooltip)
            .plotOptions(aaPlotOptions)
            .legend(aaLegend)
            .series(arrayOf(
                goalValuesElement,
                realValuesElement,
//                rateValuesElement,
            ))
    }


}