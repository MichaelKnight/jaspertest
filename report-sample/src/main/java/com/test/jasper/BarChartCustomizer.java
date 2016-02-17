package com.test.jasper;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

import java.text.NumberFormat;

/**
 * Created by Javier on 17/02/2016.
 */
public class BarChartCustomizer extends JRAbstractChartCustomizer {

    @Override
    public void customize(JFreeChart jFreeChart, JRChart jrChart) {

        CategoryPlot plot = (CategoryPlot) jFreeChart.getPlot();
        plot.setRangeAxisLocation(AxisLocation.BOTTOM_OR_LEFT);


        BarRenderer barRenderer = (BarRenderer) plot.getRenderer();
        barRenderer.setItemMargin(0.0);

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        NumberFormat numberFormat= NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
        rangeAxis.setNumberFormatOverride(numberFormat);
        rangeAxis.setUpperMargin(0.2);
        rangeAxis.setAutoRange(true); //make sure that fixed range is not set
    }
}
