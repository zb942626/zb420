package family.dad;

import family.uncle.Uncle;

public class HobbyShow {
    public static void main(String[] args) {


        Me me = new Me();
        Sister sister = new Sister();
        Uncle uncle = new Uncle();
        me.name="张三";
        me.hobby="玩游戏";
        sister.name="张四";
        sister.hobby="吃饭";
        uncle.name="张二";
        uncle.hobby="吃饭";
        if (me.hobby.equals(sister.hobby) && me.hobby.equals(uncle.hobby)) {
            System.out.println("我们家爱好都一样");
        } else if (me.hobby.equals(sister.hobby)) {
            System.out.println(me.name + "和" + sister.name + "爱好一样都是" + me.hobby);
        } else if (me.hobby.equals(uncle.hobby)) {
            System.out.println(me.name + "和" + uncle.name + "爱好一样都是" + me.hobby);
        } else if (sister.hobby.equals(uncle.hobby)) {
            System.out.println(sister.name + "和" + uncle.name + "爱好一样都是" + sister.hobby);
        } else {
            System.out.println("没有爱好一样的");
        }

    }


}
