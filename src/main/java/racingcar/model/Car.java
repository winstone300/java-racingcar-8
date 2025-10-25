package racingcar.model;

import java.util.Objects;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
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
