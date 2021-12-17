/**
 * @author xuyuqi
 */
package Server;
import java.io.*;
import java.sql.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
public class ExcelOutput {
    public static void main(String[] args) {

    }
    public void exportXls(){
        String jdbcURL="jdbc:mysql://localhost:3306/fmbank";
        String username="root";
        String password="123456";
        String excelFilePath="test.xlsx";
        try(Connection connection = DriverManager.getConnection(jdbcURL,username,password);
            String sql="SELECT * FROM account";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            XSSFWorkbook workbook=new XSSFWorkbook();
            XSSFSheet sheet=workbook.createSheet("account");
            writeHeaderLine(workbook);
            writeDataLines(resultSet,workbook);
            FileOutputStream outputStream=new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            workbook.close();
            statement.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    private void writeHeaderLine(XSSFWorkbook workbook) {
        Row headerRow=sheet.createRow(0);

    }
}
