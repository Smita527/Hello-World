package githubDemo;



public class Calculator {int i = 100;
int j = 20;
public void add() {
	int result = i+j;
	System.out.println(result);
}
public void subtract(int i,int j) {
	i = this.i;
	j = this.j;
	int answer = i-j;
	System.out.println(answer);
}

	public static void main(String[] args) {
		Calculator h = new Calculator();
		Calculator h1 = new Calculator();
		
		
		h1.subtract(50, 30);
	    h.add();
	}

}
