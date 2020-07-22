package HW5.ObjColor.dto;

public enum Color {
    RED(1, "Красный"),
    ORANGE(2, "Оранжевый"),
    YELLOW(3, "Желтый"),
    GREEN(4, "Зеленый"),
    BLUE(5, "Голубой"),
    INDIGO(6, "Синий"),
    VIOLET(7, "Фиолетовый");


    private int id;
    private String rusName = "";

    Color(int id, String rusName) {
        this.id = id;
        this.rusName = rusName.toUpperCase();
    }

    public int getId() {
        return id;
    }

    public String getRusName() {
        return rusName;
    }

    public static Color valueOfIgnoreCase(String name) {
        return valueOf(name.toUpperCase());
    }


}
