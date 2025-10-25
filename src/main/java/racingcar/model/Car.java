package racingcar.model;

import java.util.Objects;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("이름이 비어 있습니다.");
        if (name.length() >= 5) throw new IllegalArgumentException("이름은 4자 이하여야 합니다. 입력: " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPos() {
        return position;
    }

    public void move(){
        this.position++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Car)) {
            return false;
        }
        Car other = (Car) o;
        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
