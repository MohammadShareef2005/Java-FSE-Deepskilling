

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public ExcelDocument createDocument() {
        return new ExcelDocumentImpl();
    }
}

