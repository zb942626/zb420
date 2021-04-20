package object;

public class Dog {
    /*String name;
    String variety;
    String type;
    String iq;
    int  age;
    public void bite(String renMing){

        System.out.println("一个名叫"+name+variety+"咬了"+renMing+"一口快去打狂犬疫苗");
    }*/
    private String name;
    private String sex;
    private int age;
    private int health;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ("1".equals(sex)){
            sex = "公仔";
            this.sex=sex;
        }else if ("2".equals(sex)){
            sex="母妹";
            this.sex=sex;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (1<=age&&age<=20){
            this.age = age;
        }
       else {
           age =1;
           this.age=age;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (1<= health && health <= 100) {

            this.health=health;
        }else {
            health=60;
            this.health = health;
        }

    }




}