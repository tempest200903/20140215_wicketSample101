package com.mycompany;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.AbstractReadOnlyModel;

public class Addressbook extends WebPage {
	private static final long serialVersionUID = 1L;

	public Addressbook(final PageParameters parameters) {
		super(parameters);

		if (false) {
			add(new Label("message",
					"If you see this message wicket is properly configured and running"));

		}
		add(new Label("message", new AbstractReadOnlyModel<String>() {
			public String getObject() {
				return new SimpleDateFormat("HH時mm分ss秒").format(new Date());
			}
		}));
		add(new Label("version", getApplication().getFrameworkSettings()
				.getVersion()));
	}

}
