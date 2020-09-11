package HomeWork9.dto;

public class Teacher1 extends Person1 {
	/**
	 * Объект - учитель
	 */

	private Subject subject; // Какие предметы преподаёт
	private Category category; // Категория
	private double grade; // Балл в аттестате
	private double quality; // Базовый коэффициент качества обучения
	// Скрытый потенциал (-\+)
	private double profit; // Стоимость в сутки

	public Teacher1(String surname, String name, String secondName, String sex, int age) {
		super(surname, name, secondName, sex, age);
	}

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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		if (subject == null){
			this.subject = subject;
		}
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if (grade == 0){
			this.grade = grade;
		}
	}

	public double getQuality() {
		return quality;
	}

	public void setQuality(double quality) {
		if (quality == 0){
			this.quality = quality;
		}
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		if (profit == 0){
			this.profit = profit;
		}
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		if (category == null){
			this.category = category;
		}
	}

	@Override
	public String toString() {
		return "Teacher1{" +
				"subject=" + subject +
				", category=" + category +
				", grade=" + grade +
				", quality=" + quality +
				", profit=" + profit +
				'}';
	}
//	@Override
//	public String toString() {
//		return "Преподаватель: [ФИО:" + getSurname() +
//				" " + getName() +
//				" " + getSecondName() +
//				", пол: " + getSex().sex +
//				", возраст: " + getAge() +
//				", предмет: " + subject +
//				", категория: " + category.getCategoryName() +
//				", средний бал: " + grade +
//				", коэффициент качества: " + quality +
//				", доход в день: " + profit +
//				"]";
//	}
}
