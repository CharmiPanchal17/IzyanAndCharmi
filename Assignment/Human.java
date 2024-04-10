public class Human{

    //these are the fields
    public String name;
    public String gender;
    public int age;
    public double weight;
    public double height;

    //constructor
    public Human(String n, String g, int a){
        this.name = n;
        this.gender = g;
        this.age = a;
        
    }

    public Human(double w, double h){
        this.weight = w;
        this.height = h;
    }

    //methods
    public void greeting(String name, String gender, int age){
        System.out.println("Hello, my name is: " + name + "\nI am a: " + gender + " and I am: " + age + " years old.");
    }

    public void human_data(double weight, double height){
        System.out.println("My weight is: " + weight + "\nAnd my height is: " + height);
    }
    
    public void walking(){
        System.out.println("The human is walking.");
    }

    public static void main(String[] args){
        Human human1 = new Human("", "", 0);
        Human human2 = new Human(0.0, 0.0);
        Human human3 = new Human("", "", 0);

        human1.greeting("John", "male", 35);
        human2.human_data(60.0, 170);
        human3.walking();
    }

}