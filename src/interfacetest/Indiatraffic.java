package interfacetest;

public class Indiatraffic implements Centraltraffic,CentraltrainSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indiatraffic in = new Indiatraffic();
		in.gogreen();
		in.trainsymbol();
	}

	@Override
	public void gogreen() {
		System.out.println("Go ahed");
		
	}

	@Override
	public void Red() {
		System.out.println("Stop");
		
	}

	@Override
	public void Yello() {
		System.out.println("Ready for stop");
		
	}

	@Override
	public void trainsymbol() {
		System.out.println("Go ahed when green flag show");
		
	}

}
