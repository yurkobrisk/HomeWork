package HomeWork9.dto;

public class Parent extends Person{
    /**
     * Объект - родитель
     */

    private double profitDay; // доход в день

    public Parent() {}

    /**
     * Метод устанавливает доход родителя
     * @param profitDay доход родителя
     */
    public void setProfitDay(double profitDay) {
        this.profitDay = profitDay;
    }

    /**
     * Метод возвращает доход
     * @return доход
     */
    public double getProfitDay() {
        return profitDay;
    }

    @Override
    public String toString() {
        try {
            return "[ФИО:" + getSurname() +
                    " " + getName() +
                    " " + getSecondName() +
                    ", пол: " + getSex().sex +
                    ", возраст: " + getAge() +
                    ", доход в день: " + getProfitDay() + "]";
        } catch ( NullPointerException e){
            return "Не всем полям присвоены значения";
        }

    }
}
