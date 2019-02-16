interface Animal {
	String voice();
	String name();
}

class Dog implements Animal {

	public String voice() {
		return "Hau hau!";
	}

	public String name() {
		return "Dog";
	}
}

class Cat implements Animal {

	public String voice() {
		return "miau!";
	}

	public String name() {
		return "Cat";
	}
}

class Mouse implements Animal {

	public String voice() {
		return "pi!";
	}

	public String name() {
		return "Mouse";
	}
}

class AnimalRecognizer {

	public String recognize(Animal animal) {
		return "I am sure that this is: " + animal.name() + '\n' + "And sounds like: " + animal.voice();
	}
}

class Application {
	public static void main(String args[]) {
		AnimalRecognizer recogonizer = new AnimalRecognizer();
		String recognizedAnimal = recogonizer.recognize(new Cat());
		System.out.println(recognizedAnimal);
	}
}