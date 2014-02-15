package com.mycompany;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class Addressbook extends WebPage {
	private static final long serialVersionUID = 1L;

	public Addressbook(final PageParameters parameters) {
		super(parameters);

		add(new Label("message",
				"If you see this message wicket is properly configured and running"));
		add(new Label("version", getApplication().getFrameworkSettings()
				.getVersion()));
	}

}
