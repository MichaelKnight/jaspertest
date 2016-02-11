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
        List<Double> lineChartIndividual = new ArrayList<>();
        List<Double> lineChartTeam = new ArrayList<>();
        List<String> lineCategories = new ArrayList<>();

        tableAItems.add(new TableAItem("item 1","item 1","item 1"));
        tableAItems.add(new TableAItem("item 2","item 2","item 2"));

        tableBItems.add(new TableBItem("item 1", "item 1", "item 1"));
        tableBItems.add(new TableBItem("item 2", "item 2", "item 2"));

        lineChartIndividual.add(54.9);
        lineChartIndividual.add(57.5);
        lineChartIndividual.add(52.9);
        lineChartIndividual.add(55.4);

        lineChartTeam.add(20.0);
        lineChartTeam.add(30.0);
        lineChartTeam.add(31.3);
        lineChartTeam.add(40.0);

        lineCategories.add("2016 Q1");
        lineCategories.add("2015 Q4");
        lineCategories.add("2015 Q3");
        lineCategories.add("2015 Q2");

        try {

            HashMap param = new HashMap();

            JRBeanCollectionDataSource tableA = new JRBeanCollectionDataSource(tableAItems);
            param.put("AtableDatasource", tableA);
            JRBeanCollectionDataSource tableB = new JRBeanCollectionDataSource(tableBItems);
            param.put("BtableDatasource", tableB);
            JRBeanCollectionDataSource lineIndividual = new JRBeanCollectionDataSource(lineChartIndividual);
            param.put("lineChartIndividual",lineIndividual);
            JRBeanCollectionDataSource lineTeam = new JRBeanCollectionDataSource(lineChartTeam);
            param.put("lineChartTeam",lineTeam);
            JRBeanCollectionDataSource lineChartCategories = new JRBeanCollectionDataSource(lineCategories);
            param.put("lineChartCategories", lineChartCategories);

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
