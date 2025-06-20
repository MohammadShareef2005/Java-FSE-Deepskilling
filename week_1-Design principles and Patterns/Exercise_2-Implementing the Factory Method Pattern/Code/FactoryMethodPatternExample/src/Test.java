

public class Test {
    public static void main(String[] args) {
        WordDocumentFactory wordFactory = new WordDocumentFactory();
        WordDocument wordDoc = wordFactory.createDocument();
        wordDoc.open();

        PdfDocumentFactory pdfFactory = new PdfDocumentFactory();
        PdfDocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        ExcelDocumentFactory excelFactory = new ExcelDocumentFactory();
        ExcelDocument excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
