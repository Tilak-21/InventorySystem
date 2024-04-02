//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class ImageNameComparison {
//
//    public static void main(String[] args) {
//        // Path to the folder containing the images
//        String folderPath = "C:/Users/tilak/Desktop/Business Files/Punjab Trading/Product Images";
//        String excelFilePath = "C:/Users/tilak/Desktop/Business Files/Punjab Trading/Product Excel/Product Names.xlsx";
//
//        try {
//            // Load Excel file
//            FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
//            Workbook workbook = new XSSFWorkbook(excelFile);
//            Sheet sheet = workbook.getSheetAt(0); // Assuming the product names are in the first sheet
//
//            // Get image files from the folder
//            File folder = new File(folderPath);
//            File[] listOfFiles = folder.listFiles();
//
//            if (listOfFiles != null) {
//                for (File file : listOfFiles) {
//                    if (file.isFile()) {
//                        // Remove file extension
//                        String imageName = file.getName().replaceFirst("[.][^.]+$", "");
//
//                        // Compare image name with product names in Excel
//                        for (Row row : sheet) {
//                            Cell cell = row.getCell(0); // Assuming product names are in the first column
//                            if (cell != null && cell.getCellType() == CellType.STRING) {
//                                String productName = cell.getStringCellValue();
//                                if (productName.equalsIgnoreCase(imageName)) {
//                                    System.out.println("Match found: " + productName);
//                                    // You can add further processing here
//                                }
//                            }
//                        }
//                    }
//                }
//            } else {
//                System.out.println("No files found in the folder.");
//            }
//
//            workbook.close();
//            excelFile.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}