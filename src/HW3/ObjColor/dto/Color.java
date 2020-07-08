package HW3.ObjColor.dto;

public class Color {
    public Color(int col) {
        this.number = col;
    }

    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int VIOLET = 7;

    private int number;

    public String getName() {
        switch (this.number) {
            case RED: return "Красный";
            case ORANGE: return "Оранжевый";
            case YELLOW: return "Желтый";
            case GREEN: return "Зеленый";
            case BLUE: return "Голубой";
            case INDIGO: return "Синий";
            case VIOLET: return "Фиолетовый";
            default: return "неизвестно";
        }
    }
    public int getNumber() {
        return number;
    }

}
