// class employee{         // Single Inheritance
//     void salary(){
//         System.out.println( "Salary = 70000");
//     }
// }

// class hr extends employee{
//     void bonus(){
//         System.out.println("Bonus = 20000");
//     }
// }
// public class Inheritance {
//     public static void main(String[] args){
//         hr obj = new hr();
//         obj.salary();
//         System.out.println();
//         obj.bonus();
//     }
// }
// Multi level Inheritance
class A{
     void methodA(){
        System.out.println("Method of A class");
     }
}

class B extends A{
     void methodB(){
        System.out.println("Method of A class");
     }
}
class C extends B{
     void methodC(){
        System.out.println("Method of A class");
     }
}


public class Inheritance{
    public static void main(String[] args){
        C obj = new C();
        obj.methodC();
        obj.methodB();
        obj.methodA();
    }
}



