package Ferme.Dao;

import java.io.File;
import java.io.IOException;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class CreacionExcel {

    public void generarExcel(String[][] entrada, String ruta) throws IOException, WriteException {
        WorkbookSettings confi = new WorkbookSettings();
        WritableWorkbook work = jxl.Workbook.createWorkbook(new File(ruta), confi);
        WritableSheet sheet = work.createSheet("Resultado", 0);

        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada[i].length; j++) {
                sheet.addCell(new jxl.write.Label(j, i, entrada[i][j]));
            }
        }
        work.write();
        work.close();
    }
}
