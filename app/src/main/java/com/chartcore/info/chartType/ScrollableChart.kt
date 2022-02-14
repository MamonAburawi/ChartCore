package com.chartcore.info.chartType

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AAOptions
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement
import com.github.aachartmodel.aainfographics.aaoptionsmodel.*
import com.github.aachartmodel.aainfographics.aatools.AAJSStringPurer

object ScrollableChart {


     fun configureColumnChartAndBarChartStyle(): AAOptions {

        val pureJSStr: String = AAJSStringPurer.pureJavaScriptFunctionString(
            "Source: <a href=\"https://highcharts.uservoice.com/forums/55896-highcharts-javascript-api\">UserVoice</a>"
        )
        val element: AASeriesElement = AASeriesElement()
            .data(
                arrayOf(
                    arrayOf("Gantt chart", 1000),
                    arrayOf("Autocalculation and plotting of trend lines", 575),
                    arrayOf("Allow navigator to have multiple data series", 523),
                    arrayOf("Implement dynamic font size", 427),
                    arrayOf("Multiple axis alignment control", 399),
                    arrayOf("Stacked area (spline etc) in irregular datetime series", 309),
                    arrayOf("Adapt chart height to legend height", 278),
                    arrayOf("Export charts in excel sheet", 239),
                    arrayOf("Toggle legend box", 235),
                    arrayOf("Venn Diagram", 203),
                    arrayOf("Add ability to change Rangeselector position", 182),
                    arrayOf("Draggable legend box", 157),
                    arrayOf("Sankey Diagram", 149),
                    arrayOf("Add Navigation bar for Y-Axis in Highstock", 144),
                    arrayOf("Grouped x-axis", 143),
                    arrayOf("ReactJS plugin", 137),
                    arrayOf("3D surface charts", 134),
                    arrayOf("Draw lines over a stock chart, for analysis purpose", 118),
                    arrayOf("Data module for database tables", 118),
                    arrayOf("Draggable points", 117)
                )
            )

        return AAOptions()
            .chart(
                AAChart()
                .type(AAChartType.Bar)
                .scrollablePlotArea(
                    AAScrollablePlotArea()
                        .minHeight(900)
                )
            )
            .title(
                AATitle()
                .text("Most popular ideas by April 2016")
            )
            .subtitle(
                AASubtitle()
                .text(pureJSStr)
            )
            .xAxis(
                AAXAxis()
                .type("category")
            )
            .series(arrayOf(element))

    }


}