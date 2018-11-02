package exercise2;

class Person {
	private int age;
	private static int cmpt = 0;
	private static int ageTotal = 0;

	Person(int age) {
		this.age=age;
		cmpt++;
		ageTotal+=age;
	}

	static int computePopulationSize() {
		return cmpt;
	}

	static float computeAveragePopulationAge() {
		return (float)ageTotal/(float)cmpt;
	}

	static void resetPopulation() {
		cmpt = 0;
		ageTotal = 0;
	}
}
