package com.euclideanspace.mathbase.handlers;

import com.euclideanspace.mathbase.*;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class mathHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public mathHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Integr I = new Integr();
		Expression a=I.integr(1);
		System.out.println("integer a="+a);
		Expression b=I.integr(2);
		System.out.println("integer b="+b);
		System.out.println("integer a+b="+I.add(a,b));
		Expression sa=I.integr("a");
		System.out.println("integer sa="+sa);
		Expression sb=I.integr("b");
		System.out.println("integer sb="+sb);
		System.out.println("integer sa+sb="+I.add(sa,sb));
		Real F = new Real();
		Expression fxa=F.real(1.1);
		System.out.println("float fxa="+fxa);
		Expression fxb=F.real(2.2);
		System.out.println("float fxb="+fxb);
		Expression[] fxs={fxa,fxb};
		Vect V = new Vect(F,2);
		Expression fx=V.vect(fxs);
		System.out.println("vector fx="+fx);
		Expression fya=F.real(3.3);
		System.out.println("float fya="+fya);
		Expression fyb=F.real(4.4);
		System.out.println("float fyb="+fyb);
		Expression[] fys={fya,fyb};
		Expression fy=V.vect(fys);
		System.out.println("vector fy="+fy);
		System.out.println("vector x+y="+V.add(fx,fy));
		return null;
	}
}
