public class Study {
    private int number;
    private String place;
    private String name;
    private String type;
    private int amount_of_children;

    public Study (int number,String place,String name,String type,int amount_of_children){
        this.number = number;
        this.place = place;
        this.name = name;
        this.type = type;
        this.amount_of_children = amount_of_children;
    }

    public Study() {
        this.number = 227;
        this.place = "Київ";
        this.name = "Громова";
        this.type = "ліцей";
        this.amount_of_children = 2000;
    }
    public int getNumber() {

        return number;
    }
    public String getType() {

        return type;
    }
    public String getName() {

        return name;
    }
    public String toString() {
        return "Навчальний заклад{" +
                "номер=" + number +
                ", місце='" + place + '\'' +
                ", назва='" + name + '\'' +
                ", тип='" + type + '\'' +
                ", кількість учнів=" + amount_of_children +
                '}';
    }
}
