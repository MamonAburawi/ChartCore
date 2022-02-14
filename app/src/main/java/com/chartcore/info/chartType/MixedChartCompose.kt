package com.chartcore.info.chartType

import com.github.aachartmodel.aainfographics.aachartcreator.AAChartModel
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartType
import com.github.aachartmodel.aainfographics.aachartcreator.AASeriesElement

object MixedChartCompose {

    fun areaRangeMixedLine(): AAChartModel {
        return AAChartModel()
            .title("LANGUAGE MARKET SHARES JANUARY,2020 TO MAY")
            .subtitle("virtual data")
            .series(arrayOf(
                AASeriesElement()
                    .name("Temperature")
                    .color("#1E90FF")
                    .type(AAChartType.Line)
                    .data(arrayOf(
                        arrayOf(12464064, 21.5),
                        arrayOf(12464928, 22.1),
                        arrayOf(12465792, 23.0),
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
                        arrayOf(12489120, 15.0),
                        arrayOf(12489984, 13.6)
                    ))
                    .zIndex(1),
                AASeriesElement()
                    .name("Range")
                    .color("#1E90FF")
                    .type(AAChartType.Arearange)
                    .lineWidth(0f)
                    .fillOpacity(0.3f)
                    .data(arrayOf(
                        arrayOf(12464064, 14.3, 27.7),
                        arrayOf(12464928, 14.5, 27.8),
                        arrayOf(12465792, 15.5, 29.6),
                        arrayOf(12466656, 16.7, 30.7),
                        arrayOf(12467520, 16.5, 25.0),
                        arrayOf(12468384, 17.8, 25.7),
                        arrayOf(12469248, 13.5, 24.8),
                        arrayOf(12470112, 10.5, 21.4),
                        arrayOf(12470976, 9.20, 23.8),
                        arrayOf(12471840, 11.6, 21.8),
                        arrayOf(12472704, 10.7, 23.7),
                        arrayOf(12473568, 11.0, 23.3),
                        arrayOf(12474432, 11.6, 23.7),
                        arrayOf(12475296, 11.8, 20.7),
                        arrayOf(12476160, 12.6, 22.4),
                        arrayOf(12477024, 13.6, 19.6),
                        arrayOf(12477888, 11.4, 22.6),
                        arrayOf(12478752, 13.2, 25.0),
                        arrayOf(12479616, 14.2, 21.6),
                        arrayOf(12480480, 13.1, 17.1),
                        arrayOf(12481344, 12.2, 15.5),
                        arrayOf(12482208, 12.0, 20.8),
                        arrayOf(12483072, 12.0, 17.1),
                        arrayOf(12483936, 12.7, 18.3),
                        arrayOf(12484800, 12.4, 19.4),
                        arrayOf(12485664, 12.6, 19.9),
                        arrayOf(12486528, 11.9, 20.2),
                        arrayOf(12487392, 11.0, 19.3),
                        arrayOf(12488256, 10.8, 17.8),
                        arrayOf(12489120, 11.8, 18.5),
                        arrayOf(12489984, 10.8, 16.1)
                    ))
                    .zIndex(0)))
    }
}