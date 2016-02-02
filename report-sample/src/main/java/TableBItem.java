/**
 * Created by Javier on 02/02/2016.
 */
public class TableBItem {

    String column1B;
    String column2B;
    String column3B;

    public TableBItem() {
    }

    public TableBItem(String column1B, String column2B, String column3) {
        this.column1B = column1B;
        this.column2B = column2B;
        this.column3B = column3;
    }

    public String getColumn1B() {
        return column1B;
    }

    public void setColumn1B(String column1B) {
        this.column1B = column1B;
    }

    public String getColumn2B() {
        return column2B;
    }

    public void setColumn2B(String column2B) {
        this.column2B = column2B;
    }

    public String getColumn3B() {
        return column3B;
    }

    public void setColumn3B(String column3B) {
        this.column3B = column3B;
    }
}
