public interface Document {
    void open();
    void close();
    void save();
    String getDocumentType();
} 