package com.test.jasper;

/**
 * Created by Javier on 02/02/2016.
 */
public class TableAItem {

    String column1A;
    String column2A;
    String column3A;

    public TableAItem() {
    }

    public TableAItem(String column1A, String column2A, String column3A) {
        this.column1A = column1A;
        this.column2A = column2A;
        this.column3A = column3A;
    }

    public String getColumn1A() {
        return column1A;
    }

    public void setColumn1A(String column1A) {
        this.column1A = column1A;
    }

    public String getColumn2A() {
        return column2A;
    }

    public void setColumn2A(String column2A) {
        this.column2A = column2A;
    }

    public String getColumn3A() {
        return column3A;
    }

    public void setColumn3A(String column3A) {
        this.column3A = column3A;
    }
}
