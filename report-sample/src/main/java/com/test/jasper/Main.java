package com.test.jasper;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<TableAItem> tableAItems = new ArrayList<>();
        List<TableBItem> tableBItems = new ArrayList<>();

        tableAItems.add(new TableAItem("item 1","item 1","item 1"));
        tableAItems.add(new TableAItem("item 2","item 2","item 2"));

        tableBItems.add(new TableBItem("item 1", "item 1", "item 1"));
        tableBItems.add(new TableBItem("item 2", "item 2", "item 2"));

        List<BarChartItem> barElements = new ArrayList<>();
        barElements.add(new BarChartItem("INDIVIDUAL PERFORMANCE", "TOTAL", 100.00));
        barElements.add(new BarChartItem("INDIVIDUAL PERFORMANCE", "NEW PRODUCTS", 20.00));
        barElements.add(new BarChartItem("INDIVIDUAL PERFORMANCE", "PERFORMANCE", 80.90));
        barElements.add(new BarChartItem("TEAM PERFORMANCE", "TOTAL", 74.90));
        barElements.add(new BarChartItem("TEAM PERFORMANCE", "NEW PRODUCTS", 90.88));
        barElements.add(new BarChartItem("TEAM PERFORMANCE", "PERFORMANCE", 54.90));

        List<LineChartItem> lineElements = new ArrayList<>();
        lineElements.add(new LineChartItem("INDIVIDUAL", "2016 Q1\n(1訪)", 54.90));
        lineElements.add(new LineChartItem("INDIVIDUAL", "2015 Q4", 57.50));
        lineElements.add(new LineChartItem("INDIVIDUAL", "2015 Q3", 52.90));
        lineElements.add(new LineChartItem("INDIVIDUAL", "2015 Q2", 55.40));
        lineElements.add(new LineChartItem("TEAM", "2016 Q1\n(1訪)", 20.00));
        lineElements.add(new LineChartItem("TEAM", "2015 Q4", 30.00));
        lineElements.add(new LineChartItem("TEAM", "2015 Q3", 31.30));
        lineElements.add(new LineChartItem("TEAM", "2015 Q2", 40.00));

        try {

            HashMap param = new HashMap();

            JRBeanCollectionDataSource tableA = new JRBeanCollectionDataSource(tableAItems);
            param.put("AtableDatasource", tableA);
            JRBeanCollectionDataSource tableB = new JRBeanCollectionDataSource(tableBItems);
            param.put("BtableDatasource", tableB);
            JRBeanCollectionDataSource barChart = new JRBeanCollectionDataSource(barElements);
            param.put("barChartDatasource", barChart);
            JRBeanCollectionDataSource lineChart = new JRBeanCollectionDataSource(lineElements);
            param.put("lineChartDatasource", lineChart);


            param.put("tableHeadA","TABLE A HEADER");
            param.put("column1AHead","A COL 1");
            param.put("column2AHead","A COL 2");
            param.put("column3AHead","A COL 3");
            param.put("tableHeadB","TABLE B HEADER");
            param.put("column1BHead","B COL 1");
            param.put("column2BHead","B COL 2");
            param.put("column3BHead","B COL 3");
            param.put("header","SAMPLE REPORT");
            param.put("theDetails", "THE DETAILS");
            param.put("detail1Label", "DETAIL BAND 1");
            param.put("detail2Label", "DETAIL BAND 2");

            InputStream parent = Main.class.getResourceAsStream("/sample_parent.jasper");
            JasperPrint jpParent = JasperFillManager.fillReport(parent, param, new JREmptyDataSource(1));

            JasperExportManager.exportReportToPdfFile(jpParent, "C:\\REPORTS\\sampleReport.pdf");


        } catch (JRException e) {
            e.printStackTrace();
        }




    }
}
