package com.mycompany;

import java.util.Locale;

import org.apache.wicket.IPageFactory;
import org.apache.wicket.authorization.IAuthorizationStrategy;
import org.apache.wicket.event.IEvent;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebSession;
import org.apache.wicket.protocol.http.request.WebClientInfo;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.session.ISessionStore;

class AppSession extends WebSession {

	boolean verbose = false;

	/**
	 * 
	 */
	private static final long serialVersionUID = -3680367104629871281L;

	public AppSession(Request request) {
		super(request);
	}

	@Override
	public void invalidate() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("invalidate();");
		super.invalidate();
	}

	@Override
	public WebClientInfo getClientInfo() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("getClientInfo();");
		return super.getClientInfo();
	}

	@Override
	protected WebPage newBrowserInfoPage() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("newBrowserInfoPage();");
		return super.newBrowserInfoPage();
	}

	@Override
	public IAuthorizationStrategy getAuthorizationStrategy() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("getAuthorizationStrategy();");
		return super.getAuthorizationStrategy();
	}

	@Override
	public Locale getLocale() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("getLocale();");
		return super.getLocale();
	}

	@Override
	protected boolean isCurrentRequestValid(RequestCycle lockedRequestCycle) {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("isCurrentRequestValid(lockedRequestCycle);");
		return super.isCurrentRequestValid(lockedRequestCycle);
	}

	@Override
	public IPageFactory getPageFactory() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("getPageFactory();");
		return super.getPageFactory();
	}

	@Override
	public void invalidateNow() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("invalidateNow();");
		super.invalidateNow();
	}

	@Override
	public void replaceSession() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("replaceSession();");
		super.replaceSession();
	}

	@Override
	public void setLocale(Locale locale) {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("setLocale(locale);");
		super.setLocale(locale);
	}

	@Override
	public void detach() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("detach();");
		super.detach();
	}

	@Override
	public void internalDetach() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("internalDetach();");
		super.internalDetach();
	}

	@Override
	protected ISessionStore getSessionStore() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("getSessionStore();");
		return super.getSessionStore();
	}

	@Override
	public synchronized int nextSequenceValue() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("nextSequenceValue();");
		return super.nextSequenceValue();
	}

	@Override
	public synchronized int nextPageId() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("nextPageId();");
		return super.nextPageId();
	}

	@Override
	public void onEvent(IEvent<?> event) {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("onEvent(event);");
		super.onEvent(event);
	}

	@Override
	public void onInvalidate() {
		if (verbose)
			System.out.println("----------");
		if (verbose)
			System.out.println("onInvalidate();");
		super.onInvalidate();
	}

}
