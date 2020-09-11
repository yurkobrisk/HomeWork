package HomeWork9.dto;

public class Student extends Person {
    /**
     * Объект - ученик школы
     */

    private Group numberGroup; // номер класса и буква
    private double scoreBehavior; // средний бал за поведение от 0 до 10
    private double scoreGrade;    // средний бал за успеваемость от 0 до 10
    private int delayCounter;     // счетчик опозданий
    private int rateIQ;     // IQ учащегося
    private double profitDay;  // доход в сутки

    public Student() {}

    /**
     * Метод возвращает номер класс/группы ученика
     * @return номер группы
     */
    public Group getNumberGroup() {
        return numberGroup;
    }

    /**
     * Метод устанавливает номер класса/группы ученика
     * @param numberGroup номер группы ученика
     */
    public void setNumberGroup(Group numberGroup) {
        this.numberGroup = numberGroup;
    }

    /**
     * Метод возвращает средний бал ученика за поведение
     * @return средний бал ученика за поведение
     */
    public double getScoreBehavior() {
        return scoreBehavior;
    }

    /**
     * Метод устанавливает средний бал ученика за поведение
     * @param scoreBehavior средний бал ученика за поведение
     */
    public void setScoreBehavior(double scoreBehavior) {
        this.scoreBehavior = scoreBehavior;
    }

    /**
     * Метод возвращает средний бал ученика за успеваемость
     * @return средний бал ученика за успеваемость
     */
    public double getScoreGrade() {
        return scoreGrade;
    }

    /**
     * Метод устанавливает средний бал ученика за успеваемость
     * @param scoreGrade средний бал ученика за успеваемость
     */
    public void setScoreGrade(double scoreGrade) {
        this.scoreGrade = scoreGrade;
    }

    /**
     * Метод возвращает количество опозданий ученика
     * @return количество опозданий
     */
    public int getDelayCounter() {
        return delayCounter;
    }

    /**
     * Метод устанавливает количество опозданий ученика
     * @param delayCounter количество опозданий ученика
     */
    public void setDelayCounter(int delayCounter) {
        this.delayCounter = delayCounter;
    }

    /**
     * Метод возвращает IQ ученика
     * @return IQ ученика
     */
    public int getRateIQ() {
        return rateIQ;
    }

    /**
     * Метод устанавливает IQ ученика
     * @param rateIQ IQ ученика
     */
    public void setRateIQ(int rateIQ) {
        this.rateIQ = rateIQ;
    }

    /**
     * Метод возвращает значение дохода ученика
     * @return доход ученика
     */
    public double getProfitDay() {
        return profitDay;
    }

    /**
     * Метод устанавливает значение дохода ученика
     * @param profitDay доход ученика
     */
    public void setProfitDay(double profitDay) {
        this.profitDay = profitDay;
    }

    @Override
    public String toString() {
        return "[ФИО:" + getSurname() +
                " " + getName() +
                " " + getSecondName() +
                ", класс: " + numberGroup +
                ", scoreBehavior=" + scoreBehavior +
                ", scoreGrade=" + scoreGrade +
                ", delayCounter=" + delayCounter +
                ", rateIQ=" + rateIQ +
                ", доход в день: " + profitDay +
                ", семья: " + getIndexFamily() +
                "]";
    }
}
