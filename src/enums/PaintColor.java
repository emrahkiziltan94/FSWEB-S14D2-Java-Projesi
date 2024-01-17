package enums;

public enum PaintColor {

    BLUE("#0000FF"),
    RED("#FF0000"),
    GREEN("#3CB371"),
    WHITE("#FFFFFF");


    private String hexCode;

    PaintColor(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
