package bonus;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;


/*Используя данную конструкцию, работая только в методе main вывести на печать
	ABC в строку и в столбик.
 */

public class Lambda {

	public static void main(String[] args) {

		// TODO: 9/11/19 вызвать fun здесь (в одну строчку)

	}

	public static void fun(Supplier<Apple> supplier, Consumer<Apple> consumer) {

		// TODO: 9/11/19    нужно покормить лошадь тут используя интерфейсы (в одну строчку)

	}
}

class Apple{

}

class Horse{

	void chew(Apple apple){
		System.out.println("omnomnom");
	}

}


