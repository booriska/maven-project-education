package task1;

public class Human {

        private int age;
        private String duties;
        private String status;
        private String hobby;
        private String work;
        private Human wife;
        private String lastname;
        private int height;
        private int weight;
        private Human husband;
        private String homeland;
        private double temperature;
        private String gender;
        private Human freind;
        private Human son;
        private Human father;
        private Human daughter;

        public Human(String name) {
    }


    public void human() {
            Human andrew = new Human("Andrew"); //1
            Human steve = new Human("Steve"); //2
            Human artur = new Human("Artur"); //3
            Human arnold = new Human("Arnold"); //4
            Human ignat = new Human("Ignat"); //5
            Human alena = new Human("Alena"); //6
            Human nazir = new Human("Nazir"); //7
            Human sasha = new Human("Sasha"); //8
            Human uriy = new Human("Uriy"); //9
            Human vasya = new Human("Vasya"); //10

            andrew.age = 71;
            andrew.duties = "wath the house";
            andrew.status = "retiree";
            steve.age = 37;
            steve.hobby = "basketball";
            steve.work = "programmer";
            artur.age = 35;
            artur.wife = alena;
            artur.work = "salemanager";
            artur.hobby = "snowboard";
            arnold.age = 46;
            arnold.lastname = "Schwarzenegger";
            arnold.height = 199;
            arnold.weight = 120;
            ignat.status = "student";
            ignat.duties = "study hard";
            ignat.age = 18;
            alena.husband = artur;
            alena.father = vasya;
            alena.age = 33;
            alena.height = 55;
            alena.hobby = "self-care";
            nazir.age = 44;
            nazir.homeland = "Uzbekistan";
            nazir.temperature = 36.6;
            sasha.age = 2;
            sasha.hobby = "play games";
            sasha.gender = "man";
            sasha.father = uriy;
            uriy.work = "ceiling man";
            uriy.freind = artur;
            uriy.son = sasha;
            uriy.father = andrew;
            vasya.hobby = "fishing";
            vasya.daughter = alena;
        }
    }
