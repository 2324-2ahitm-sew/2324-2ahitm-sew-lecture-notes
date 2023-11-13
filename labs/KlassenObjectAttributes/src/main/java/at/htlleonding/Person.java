package at.htlleonding;

public class Person {

    private static int klassenVariable = 0;
    private int objektVariable = 0;

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void incrKlassenVariable() {
        klassenVariable++;
    }

    public void incrObjektVariable() {
        objektVariable++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s, ov: %d, kv: %d"
                , name
                , objektVariable
                , klassenVariable
        );
    }
}
