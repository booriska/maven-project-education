package task2;

public class Office {


	Secretary secretary;



	Director director;

	/*
	Hr hr;
	*/

	//претенденты идут по одному, когда их достаточно,
	// то диретор принимает решение и берет одного в штат

	void invitePeaople(Secretary human){
		secretary = human;
		System.out.println(secretary.name);
	}

	void chooseDirector(Director human){
		director = human;
		director.firedPeople();
	}
}
