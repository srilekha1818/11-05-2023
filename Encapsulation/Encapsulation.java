package CoreJava.Encapsulation;
class Solution{
    private String name;
    /* if data members are not private any one can access it by using the reference.*/
    private int age;
    private String city;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
}

public class Encapsulation {
    public static void main(String[] args){
        Solution sl=new Solution();
        sl.setAge(12);
        System.out.println(sl.getAge());
        sl.setName("srilekha");
        System.out.println(sl.getName());

    }
}
