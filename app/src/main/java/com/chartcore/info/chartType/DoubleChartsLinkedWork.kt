package com.chartcore.info.chartType

import android.content.Context
import com.github.aachartmodel.aainfographics.aachartcreator.*
import com.github.aachartmodel.aainfographics.aatools.AAGradientColor

object DoubleChartsLinkedWork {



     fun configureChartOptions1(context: Context): AAOptions {
        val gradientColorNamesArr = arrayOf(
            "oceanBlue",
            "sanguine",
            "lusciousLime",
            "purpleLake",
            "freshPapaya",
            "ultramarine",
            "pinkSugar",
            "lemonDrizzle",
            "victoriaPurple",
            "springGreens",
            "mysticMauve",
            "reflexSilver",
            "neonGlowColor",
            "berrySmoothieColor",
            "newLeaf",
            "cottonCandy",
            "pixieDust",
            "fizzyPeach",
            "sweetDream",
            "firebrick",
            "wroughtIron",
            "deepSea",
            "coastalBreeze",
            "eveningDelight",
            "neonGlowColor",
            "berrySmoothieColor"
        )

        val gradientColorArr = arrayOf(
            AAGradientColor.OceanBlue,
            AAGradientColor.Sanguine,
            AAGradientColor.LusciousLime,
            AAGradientColor.PurpleLake,
            AAGradientColor.FreshPapaya,
            AAGradientColor.Ultramarine,
            AAGradientColor.PinkSugar,
            AAGradientColor.LemonDrizzle,
            AAGradientColor.VictoriaPurple,
            AAGradientColor.SpringGreens,
            AAGradientColor.MysticMauve,
            AAGradientColor.ReflexSilver,
            AAGradientColor.NewLeaf,
            AAGradientColor.CottonCandy,
            AAGradientColor.PixieDust,
            AAGradientColor.FizzyPeach,
            AAGradientColor.SweetDream,
            AAGradientColor.Firebrick,
            AAGradientColor.WroughtIron,
            AAGradientColor.DeepSea,
            AAGradientColor.CoastalBreeze,
            AAGradientColor.EveningDelight,
            AAGradientColor.NeonGlow,
            AAGradientColor.BerrySmoothie
        )
      val gradientColorsArr = gradientColorArr as Array<Any>
        val aaChartModel: AAChartModel = AAChartModel.Builder(context)
            .setChartType(AAChartType.Column)
            .setTitle("")
            .setYAxisTitle("")
            .setCategories(*gradientColorNamesArr)
            .setColorsTheme(gradientColorArr)
            .setXAxisReversed(true)
            .setYAxisReversed(true)
            .setInverted(true)
            .setLegendEnabled(false)
            .setTouchEventEnabled(true)
            .setSeries(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(
                        211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13,
                        211, 183, 157, 133, 111, 91, 73, 57, 43, 31, 21, 13
                    ))
                    .colorByPoint(true)).build()
        val aaOptions: AAOptions = aaChartModel.aa_toAAOptions()
        aaOptions.plotOptions?.column?.groupPadding = 0f
        return aaOptions
    }


     fun configureChartOptions2(context: Context): AAOptions {
        val aaChartModel: AAChartModel = AAChartModel.Builder(context)
            .setChartType(AAChartType.Column)
            .setTitle("")
            .setYAxisTitle("")
            .setLegendEnabled(false)
            .setYAxisGridLineWidth(0f)
            .setSeries(
                AASeriesElement()
                    .name("Tokyo")
                    .data(arrayOf(
                        211,183,157,133,111,91,73,57,43,31,21,13,
                        211,183,157,133,111,91,73,57,43,31,21,13,
                    ))
            ).build()
        val aaOptions: AAOptions = aaChartModel.aa_toAAOptions()
        aaOptions.plotOptions?.column?.groupPadding = 0f
        return aaOptions
    }



}