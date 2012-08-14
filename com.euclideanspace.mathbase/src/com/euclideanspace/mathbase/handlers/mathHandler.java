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
		return null;
	}
}
