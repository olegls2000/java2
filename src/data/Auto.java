package data;

import enums.Color;

import java.util.Objects;

import static utils.MyUtils.getRandomFromRange;

public class Auto {
    private static final int MIN_WEIGHT = 1_200;
    private static final int MAX_WEIGHT = 2_500;

    private static final int MIN_PRICE = 5_000;
    private static final int MAX_PRICE = 100_000;

    private Color color;

    @MaxValue
    private int weight;

    @MaxValue(100_000)
    private int price;

    @Override
    public String toString() {
        return "Auto{" +
                "color=" + color +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    public Auto() {
        this.color = getRandomColors();
        this.weight = getRandomFromRange(MIN_WEIGHT, MAX_WEIGHT);
        this.price = getRandomFromRange(MIN_PRICE, MAX_PRICE);
    }

    public Auto(Color color, int weight, int price) {
        checkWeight(weight);
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    private Color getRandomColors() {
        final Color[] colors = Color.values();
        //[0..length-1]
        int randomIndex = getRandomFromRange(0, colors.length - 1);

        return colors[randomIndex];
    }

    private void checkWeight(int weight) {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            throw new IllegalArgumentException("Invalid Weight!");
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        checkWeight(weight);
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return weight == auto.weight &&
                price == auto.price &&
                color == auto.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, price);
    }
}
