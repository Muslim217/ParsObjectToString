public class Fighter {
    private int id;
    private String name;
    private Weight weight;
    private int age;
    private int height;
    private int reach;
    private Stance stance;
    private Style style;
    private boolean isChampion;

    public Fighter(String name, Weight weight, int age, int height, int reach, Stance stance, Style style, boolean isChampion) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.height = height;
        this.reach = reach;
        this.stance = stance;
        this.style = style;
        this.isChampion = isChampion;
    }

    public Fighter(int id, String name, Weight weight, int age, int height, int reach, Stance stance, Style style, boolean isChampion) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.height = height;
        this.reach = reach;
        this.stance = stance;
        this.style = style;
        this.isChampion = isChampion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public Stance getStance() {
        return stance;
    }

    public void setStance(Stance stance) {
        this.stance = stance;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public boolean isChampion() {
        return isChampion;
    }

    public void setChampion(boolean champion) {
        isChampion = champion;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", height=" + height +
                ", reach=" + reach +
                ", stance=" + stance +
                ", style=" + style +
                ", isChampion=" + isChampion +
                '}';
    }

    public int getId() {
        return id;
    }


}
