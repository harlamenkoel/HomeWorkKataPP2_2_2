package web.model;

import java.util.Objects;

public class Car {
    private String mark;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(mark, car.mark) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mark == null) ? 0 : mark.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Car: " + mark + " " + model + " " + year;
    }
}
