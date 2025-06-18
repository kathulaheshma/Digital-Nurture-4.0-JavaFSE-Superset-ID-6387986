public abstract class DocumentFactory {
    // Factory method
    public abstract Document createDocument();
    
    // Common method to process documents
    public void processDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
        System.out.println("Processed: " + doc.getDocumentType());
    }
} 