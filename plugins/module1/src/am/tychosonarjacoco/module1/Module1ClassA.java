package am.tychosonarjacoco.module1;

public class Module1ClassA implements AllModulesInterface {

	private int x;
    private int y;
	
	public Module1ClassA() {
		
	}
	
    public Module1ClassA(int a, int b) {
        x = a;
        y = b;
    }
    public int ajouter() {
        x += y;
        return x;
    }
    
    public int soustraire() {
        x -= y;
        return x;
    }
    
    public int multiplier() {
        x *= y;
        return x;
    }
    
    public int diviser() {
        x /= y;
        return x;
    }

	@Override
	public String getName() {
		return "1A";
	}

}

