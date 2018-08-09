package com.utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.Map;

/**
* @Description:    学习javaPOI
* @Author:         zhouhui
* @CreateDate:
* @Version:        1.0
*/
public class exportByPOIUtils {

    /**
    * @Description:
    * @Author:         zhouhui
    * @CreateDate:
    * @Version:        1.0
    */
    public static void generateExcel( Map<String,Object> result){

        //生成excel对象
        HSSFWorkbook workbook = new HSSFWorkbook();
        //生成一个（带标题）表格
        HSSFSheet sheet = workbook.createSheet();
       /* //生成表格样式对象
        HSSFCellStyle headStyle = getStyle(workbook,1);
        HSSFCellStyle bodyStyle = getStyle(workbook,1);*/
        //生成行对象
        HSSFRow dataRow = null;
        for(int i=0;i<9;i++){
            //每一列宽度调整
            sheet.setColumnWidth(i,14*256);
        }
        //合并相关单元格
        sheet.addMergedRegion(new CellRangeAddress(5,5,0,5));
        sheet.addMergedRegion(new CellRangeAddress(1,7,6,7));
        //设置单元格斜线
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
        HSSFClientAnchor anchor = new HSSFClientAnchor();
        anchor.setAnchor((short)0,0,0,0,(short)1,1,0,0);
        // 生成划线对象
        HSSFSimpleShape line = patriarch.createSimpleShape(anchor);
        // 设置线的形状
        line.setShapeType(HSSFSimpleShape.OBJECT_TYPE_LINE);
        //设置线的样式
        line.setLineStyle(HSSFShape.LINESTYLE_SOLID);
        //设置划线宽度,在NPOI中线的宽度12700表示1pt,所以这里是0.5pt粗的线条
        line.setLineWidth(6350);

        //第一行
    }

    /**
     * 获取样式
     *
     * @param workbook 工作普对象
     * @param type     1 head 2 body
     * @return 样式表
     * /
     /*
    private static HSSFCellStyle getStyle(HSSFWorkbook workbook, int type) {
        HSSFCellStyle style = workbook.createCellStyle();
        //水平居中
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        //自动换行
        style.setWrapText(true);

        //生成一个字体
        HSSFFont font = workbook.createFont();//字体
        font.setFontHeightInPoints((short) 10);
        style.setFont(font);

        if (type == 1) {
            //垂直居中
            style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
            //背景色
            style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
            style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
            //设置边框
            style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            style.setBorderRight(HSSFCellStyle.BORDER_THIN);
            style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        } else {
            style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
            style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
            style.setBorderRight(HSSFCellStyle.BORDER_THIN);
            style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        }
        return style;
    }*/
}
