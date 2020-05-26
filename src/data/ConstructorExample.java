package data;

import static utils.MyUtils.getRandomFromRange;

public class ConstructorExample {
    private int field1;
    private String field2;

    public ConstructorExample() {
        this(getRandomFromRange(5, 99), "Default_Val");
    }

    public ConstructorExample(String field2) {
        this(getRandomFromRange(5, 99), field2);
    }

    public ConstructorExample(int field1) {
        this(field1, "Default_Val");
    }

    public ConstructorExample(int field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
}
