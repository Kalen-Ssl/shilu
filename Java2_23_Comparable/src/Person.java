
public class Person implements Comparable<Person>,Cloneable{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }


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

    public String toString(){
        return "Person{"+"name='"+name+'\'' +
                ",age="+age+'}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.age<o.age)
            return -1;
        else if(this.age==o.age) return 0;
        else{
            return 1;
        }
    }

   public Person clone(){
       try {
           return (Person)super.clone();
       } catch (CloneNotSupportedException e) {
           e.printStackTrace();
       }
       return null;
   }
}
