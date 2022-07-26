package com.inter;

public class ItalianBMT implements Sandwich{

	@Override
	public int getCalorie() {
		// TODO Auto-generated method stub
		return 388;
	}

	@Override
	public String getIngredient() {
		// TODO Auto-generated method stub
		return "페퍼로니 3장, 살라미 3장, 햄 2장, 치즈 2장, 핫칠리, 스위트 어니언";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "페퍼로니, 살라미 그리고 햄이 만들어내는 최상의 조화!\r\n" + 
				"전세계가 사랑하는 써브웨이의 베스트셀러!\r\n" + 
				"Biggest Meatiest Tastiest, its’ B.M.T.";
	}

}
