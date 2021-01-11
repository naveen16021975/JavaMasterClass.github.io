package learn;

public class Human {

    private String name;
    private char gender = 'F';
    private int cash = 0;
    private float assets = 0.0f;

    enum Event {
        BIRTHDAY,
        ANNIVERSARY,
        FIGHT,
        DIVORSE
    };

    public Human() {

    }

    public Human(String name, char gender, int cash, float assets) {
        this.name=name;
        this.gender=gender;
        this.cash=cash;
        this.assets=assets;
    }

    class Spouse {

        int goodSpouse(String... events) {

            for(String event: events) {
                goodSpouse(event);
            }

            return cash;
        }
        
        int goodSpouse(String events) {
            Event event = Event.valueOf(events);        
            switch(event) {
                case BIRTHDAY:
                    reduceCash(1);break;
                case ANNIVERSARY:
                    reduceCash(2);break;
                case FIGHT:
                    reduceCash(5);
                    break;
                case DIVORSE:
                    reduceCash(1);                    
                    reduceAssets(50);
                    break;
                default:
                    System.out.println("Event provided is not valid, hence no action");

            }
            return cash;
        }

        private void reduceCash(int percentage) {
            cash = cash-(cash*percentage/100);
        }

        private void reduceAssets(int percentage) {
            assets = assets-(assets*percentage/100);
        }
    }

    public void printEvents() {
        for (Event myVar : Event.values()) {
            System.out.println(myVar);
          }
    }

    public String toString() {
         return String.format("%s %s %s %c %s %d %s %f", "Name", name, "Gender", gender, "Cash", cash, "Total Assets",assets );
    }

    public static void main(String[] args) {
        new Human().printEvents();

        Human h = new Human("Robin",'M',100,500f);
        Human.Spouse spouse = h.new Spouse();        
        //spouse.goodSpouse("BIRTHDAY");
        spouse.goodSpouse("FIGHT");
        System.out.println(h);

        Human h1 = new Human("Anuj",'M',1000,5000f);
        Human.Spouse sp = h1.new Spouse();  
        sp.goodSpouse("BIRTHDAY", "ANNIVERSARY");
        System.out.println(h1);
    }
    
}
