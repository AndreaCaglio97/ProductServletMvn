package it.intre.ProductServletMvn.models;

public class TableRow {
    private int idProduct;
    private String name;
    private ImportType importType;
    private double minimumPrice;
    private double maximumPrice;
    private Category category;

    public TableRow(int idProduct, String name, ImportType importType, double minimumPrice, double maximumPrice, Category category) {
        this.idProduct = idProduct;
        this.name = name;
        this.importType = importType;
        this.minimumPrice = minimumPrice;
        this.maximumPrice = maximumPrice;
        this.category = category;
    }

    public TableRow() {
        this(0,null,ImportType.ALL,0,0,Category.NOT_GENERAL);
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public ImportType getImportType() {
        return importType;
    }

    public double getMinimumPrice() {
        return minimumPrice;
    }

    public double getMaximumPrice() {
        return maximumPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImportType(ImportType importType) {
        this.importType = importType;
    }

    public void setMinimumPrice(double minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public void setMaximumPrice(double maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
