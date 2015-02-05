package execucio;

import interficies.*;
import clases.*;

public class Principal {
	public static void main(String[] args){
		System.out.println("Execucio de les interficies");
		interficies.Quadrat q=new interficies.Quadrat();
		interficies.Circumferencia c=new interficies.Circumferencia();
		interficies.Triangle t=new interficies.Triangle();
		
		q.setLongitud(3);
		System.out.println(q.toString());
		
		c.setRadi(11.3);
		System.out.println(c.toString());
		
		t.setAltura(1.2);
		t.setBase(2.3);
		System.out.println(t.toString());
		
		System.out.println("Execucio de les clases");
		clases.Quadrat qc=new clases.Quadrat();
		clases.Circumferencia cc=new clases.Circumferencia();
		clases.Triangle tc=new clases.Triangle();
		
		qc.setLongitud(3);
		System.out.println(qc.toString());
		
		cc.setRadi(11.3);
		System.out.println(cc.toString());
		
		tc.setAltura(1.2);
		tc.setBase(2.3);
		System.out.println(tc.toString());
	}
}
