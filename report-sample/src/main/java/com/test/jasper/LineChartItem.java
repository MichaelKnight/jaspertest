package com.test.jasper;

/**
 * Created by Javier on 14/02/2016.
 */
public class LineChartItem {

    String serie;
    String category;
    double value;

    public LineChartItem(String serie, String category, double value) {
        this.serie = serie;
        this.category = category;
        this.value = value;
    }

    public LineChartItem() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
