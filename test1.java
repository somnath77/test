class child{
	child(){
		System.out.println("Hi from constructor");
	}
	static void show(){
		System.out.println("Hi from show");
	}
	void result(){
		System.out.println("Hi from result");
	}
}

class demo{
	public static void main(String args[]){
		// System.out.print("Hi\n");
		// System.out.println("Bye");
		child c=new child();
		c.result();
		//child.result();
		//child.show();	
		c.show();
		
		//String s=new String("Welcome");
		StringBuffer s=new StringBuffer("Welcome");
		s.append(" here!");
		System.out.println(s);
	}
	
}
