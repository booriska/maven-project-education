package task3;

public interface OracleHelper {
    void assistOracle();

    void assistOracle(String s, String ss);

    /*
    Что-то мне это все не нравится. Сколько методов я должен выделить в интерфейсе? Его надобность я, вроде, осознаю.
    Я теперь при помощи него могу создавать классы, которые помогут оракулу ходить в базу данных, или качать
    ответы из интернета, или сохранять что-то на диск, в общем все, что угодно и все через ссылочный тип интерфейса.
    Но я не знаю, сколько методов в этом случае я должен заготовить? Я бы пока вообще ограничился одним, а метод, который
    принимает два стринга реализовал бы в OracleMemory, но тогда мне до него не добраться по ссылке интерфейса.
    Делать cast? Вроде тоже плохая идея.
     */

    // TODO: 8/4/20 кто сказал что оракулу нужен помошник? Интерфейс требуется для него

}

//interface WiseMan{
//
//    Answer ask(Question question);
//
//}