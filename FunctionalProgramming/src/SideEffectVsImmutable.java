public class SideEffectVsImmutable {
	public int a = 0;
	
	public void addWithSideEffects(int b) {
		a += b;
	}
	
	public int addWithNoSideEffects(int x, int y) {
		return x + y;
	}
	


}
