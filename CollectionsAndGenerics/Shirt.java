package CollectionsAndGenerics;

public class Shirt {
    String name,color;
    int size;

    public Shirt(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

}
