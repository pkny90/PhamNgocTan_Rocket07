package Ex2.Question3;

public class HV extends HCN{

	@Override
	public double P(double a, double b) {
		return super.P(a, b);
	}
	
	@Override
	public double S(double a, double b) {
		return super.S(a, b);
	}
	
	public double chuVi(double a){
		return this.P(a, a);
	}
	
	public double dienTich(double a){
		return this.S(a, a);
	}
}
