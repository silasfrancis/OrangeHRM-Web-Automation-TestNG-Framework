package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviders {

    @DataProvider(name = "loginData")
    public String[][] getAllData() throws IOException {
        {
            String path = System.getProperty("user.dir") + "//testData//LoginData.xlsx";
            XLUtility xl = new XLUtility(path);

            int rownum = xl.getRowCount("Login Data");
            int colcount = xl.getCellCount("Login Data", 1);

            String prices[][] = new String[rownum][colcount];

            for (int i = 1; i <= rownum; i++) {
                for (int j = 0; j < colcount; j++) {
                    prices[i - 1][j] = xl.getCellData("Login Data", i, j);
                }
            }

            return prices;
        }
    }

    @DataProvider(name = "EmployeeData")
    public String[][] getEmpData() throws IOException {
        {
            String path = System.getProperty("user.dir") + "//testData//Employee Data.xlsx";
            XLUtility xl = new XLUtility(path);

            int rownum = xl.getRowCount("Data");
            int colcount = xl.getCellCount("Data", 1);

            String emp_data[][] = new String[rownum][colcount];

            for (int i = 1; i <= rownum; i++) {
                for (int j = 0; j < colcount; j++) {
                    emp_data[i - 1][j] = xl.getCellData("Data", i, j);
                }
            }

            return emp_data;
        }
    }
}