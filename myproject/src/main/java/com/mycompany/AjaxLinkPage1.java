package com.mycompany;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class AjaxLinkPage1 extends WebPage {

	private static final long serialVersionUID = 7514416342722447820L;

	public AjaxLinkPage1(PageParameters parameters) {
		super(parameters);

		final Label label = new Label("labelComponent", "Initial value.");
		// autogenerate a markup id
		label.setOutputMarkupId(true);
		add(label);
		//
		AjaxLink ajaxLink = new AjaxLink("ajaxLink") {
			private static final long serialVersionUID = 1L;

			@Override
			public void onClick(AjaxRequestTarget target) {
				// modify the model of a label and refresh it on client side
				label.setDefaultModelObject("Another value 4 label.");
				target.add(label);
			}
		};
		add(ajaxLink);
	}

}
