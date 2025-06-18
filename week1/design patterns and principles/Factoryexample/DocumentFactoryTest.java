public class DocumentFactoryTest {
    public static void main(String[] args) {
        // Create factories for different document types
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Process different types of documents
        System.out.println("Processing Word Document:");
        wordFactory.processDocument();

        System.out.println("\nProcessing PDF Document:");
        pdfFactory.processDocument();

        System.out.println("\nProcessing Excel Document:");
        excelFactory.processDocument();
    }
} 