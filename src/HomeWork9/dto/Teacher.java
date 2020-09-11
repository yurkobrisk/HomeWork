package HomeWork9.dto;

import java.util.ArrayList;

public class Teacher extends Person {
	/**
	 * Объект - учитель
	 */

	private Subject subjectPrimary, subjectSecondary; // какие предметы преподаёт, основной и второстепенный
	private Category category; // категория
	private double grade; // балл в аттестате
	private double quality; // базовый коэффициент качества обучения
	// Скрытый потенциал (-\+)
	private double profit; // cтоимость в сутки
	private Group groupBoss = null; // классный руководитель

	public Teacher() {}

	/**
	 * Категория преподавателя
	 */
	public enum Category{
		NOVICE(1, "Начинающий специалист"),
		TEACHER1(2, "Преподаватель 1-ой категории"),
		TEACHER2(3,"Преподаватель 2-ой категории"),
		MASTER(4, "Преподаватель высшей категории");

		private final String categoryName; // категория преподавателя
		private final int id; // порядковый номер категории

		Category(int id, String categoryName) {
			this.id = id;
			this.categoryName = categoryName;
		}

		public int getId() {
			return id;
		}

		public String getCategoryName() {
			return categoryName;
		}
	}

	public Subject getSubjectPrimary() {
		return subjectPrimary;
	}

	public void setSubjectPrimary(Subject subjectPrimary) {
			this.subjectPrimary = subjectPrimary;
	}

	public Subject getSubjectSecondary() {
		return subjectSecondary;
	}

	public void setSubjectSecondary(Subject subjectSecondary) {
			this.subjectSecondary = subjectSecondary;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
			this.grade = grade;
	}

	public double getQuality() {
		return quality;
	}

	public void setQuality(double quality) {
			this.quality = quality;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
			this.profit = profit;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
			this.category = category;
	}

	public Group getGroupBoss() {
		return groupBoss;
	}

	public void setGroupBoss(Group groupBoss) {
		this.groupBoss = groupBoss;
	}

	@Override
	public String toString() {
		return "[Преподаватель: ФИО: " + getSurname() +
				" " + getName() +
				" " + getSecondName() +
				", предметы: " + subjectPrimary.getName() + ", " + subjectSecondary.getName() +
				", категория: " + category.categoryName +
				", бал в аттестате: " + grade +
				", стоимость в день: " + profit +
				"]";
	}
}
