package task2;

public class Office {

	Director director;

	Hr hr;

	Secretary secretary;
	public Office(Director director, Hr hr) {
		this.director = director;
		this.hr = hr;
	}

	//претенденты идут по одному, когда их достаточно,
	// то диретор принимает решение и берет одного в штат

	void invitePeople(Object human){
		// TODO: 7/27/20 чтобы не было каши разделяй на смысловые группы, все что можно отделить должно быть отдельным методом. Проверка ком состав
		//  провека на рядовой состав и так далее. И помни офис это 4 чтены  и дверь, он содержит минимум логики, всю работу делают люди.
		// TODO: 7/29/20 логика это if , ее быть тут не должно(для того чтобу убрать ее и вынесли инициализацию ключевых объектов в конструктор),
		//  объекты просто обмениваются данными и совершают вызовы.
		hr.checkSecretary(human);
		secretary = hr.transferControlTo(director);
	}
}
