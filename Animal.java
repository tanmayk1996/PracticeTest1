package practiceTest1;


	class Animal1{  
	    String printMsg()
	    {
	    	return "Animal";
	    	
	    }  
	}  
	class Horse extends Animal1{  
	    String printMsg()
	    {
	    	return "snorting";
	    }  
	}  
	class Dog extends Animal1{  
	    String printMsg()
	    {
	        return "barking";
	    }  
	}  
	class Cat extends Animal1{  
	    String printMsg()
	    {
	        return "meowing";
	    }  
	}
	  
	public class Animal {
   
		public static void main(String args[]){  
	        Animal1 ani;  
	        ani=new Horse();  
	        System.out.println("Horse is  "+ani.printMsg());  
	        ani=new Dog();  
	        System.out.println("Dog is "+ani.printMsg());  
	        ani=new Cat();  
	        System.out.println("Cat is "+ani.printMsg());  
	    }  
	}

