package com.techlabs.ShoppingCart;

import java.util.ArrayList;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ArrayList<LineItem> lineItems=new ArrayList<LineItem>();
		lineItems.add(new LineItem(1,"HIDE&SEEK",2,30));
		lineItems.add(new LineItem(2,"OREO ICE CREAM",1,125));
		lineItems.add(new LineItem(3,"DAIRY MILK SILK FRUIT AND NUT",2,180));
		lineItems.add(new LineItem(4,"DORITOS",3,50));
		for (LineItem item : lineItems) {
            System.out.println(item.toString());
            System.out.println();
        }
		double totalAmount = 0;
		for (int i = 0; i < lineItems.size(); i++) {
		    LineItem item = lineItems.get(i);
		    totalAmount += item.calculateLineItemCost();
		}
		System.out.println("Total amount of all LineItems: " + totalAmount);
    

	}
}
	



