package flyweight.Mosh;

public class PointIcon {
    private final PointType type;

    private final  byte[] icon;
    public PointIcon(PointType type, byte[] icon) {
        this.icon = icon;
        this.type = type;
    }

    public PointType getType() {
        return type;
    }
}
