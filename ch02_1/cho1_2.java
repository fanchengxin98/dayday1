package ch02_1;

public class cho1_2 {
    private String name;
    private int years;
    private String achievements;
    private String description;

    public cho1_2(){

    }

    public cho1_2(String name, int years, String achievements, String description) {
        super();
        this.name = name;
        this.years = years;
        this.achievements = achievements;
        this.description = description;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
    public String getAchievements() {
        return achievements;
    }
    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void show(){
        System.out.println("name:"+name+"\n"+"years:"+years+"\n"+"achievements:"+achievements+"\n"+"description:"+description+"\n");
    }
}

