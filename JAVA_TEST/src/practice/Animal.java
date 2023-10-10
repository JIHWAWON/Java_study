abstract class Animal {
	abstract void Sound();
   
   
   void eat() {
      System.out.println("먹다");
   }
}

//======================

class Dog extends Animal {
   
   void Sound() {
      System.out.println("멍멍!");
   }

   void 똥개() {
      System.out.println("똥개");
   }
}

//======================

