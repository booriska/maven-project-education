package simpleTasks.Homework;

public class ChildRoom {
    private final Child child;
    private final Mother mother;
    private final Father father;

    public ChildRoom(Child child, Mother mother, Father father) {
        this.child = child;
        this.mother = mother;
        this.father = father;
    }


    // TODO: 4/10/20 помни коментарии это хорошо, но хороший коментарий отвечает на вопрос почему, а не что.
    public static void main(String[] args) throws Exception {
        Child child = new Child();
        Father father = new Father();
        Mother mother = new Mother();
        ChildRoom childRoom = new ChildRoom(child, mother, father);
        childRoom.timeToMakeHomework();
        childRoom.timeForFairyTale();
        childRoom.timeToSleep();
    }

    private void timeToSleep() {

    }

    private void timeForFairyTale() {

    }

    private void timeToMakeHomework() throws Exception {
        Task task = new Task(25,"Find multiplication of two numbers: ");
        Task task1 = new Task(26,"Find xxxxxxxxxxxxxxxxxx: ");
        Task task2 = new Task(27,"Find xxxxxxxxxxxxxxxxxx: ");
        Task task3 = new Task(28,"Find xxxxxxxxxxxxxxxxxx: ");
        // TODO: 4/10/20 создай коллекцию помести задачи в нее
        int numberOfTask = mother.chooseTask(task); // помести коллекцию сюда и сделай выбор одной задачи, по индексу сложности например.
        Notebook notebook = new Notebook();
        Pen pen = new Pen();
        MathBook mathBook = new MathBook();
        child.openMathBook(numberOfTask);
        child.askHelp(father);  // просит помощь от родителей, в зависимости от mother/father разные ответы
    }


}