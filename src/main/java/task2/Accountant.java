package task2;

class Accountant implements WantAWork {

    String name;
    boolean hired = false;

    public Accountant(String name){this.name = name;}

    @Override
    public String toString(){return "Бухгалтер " + name;}

    @Override
    public boolean passInterview() {
        return true;
    }
}

