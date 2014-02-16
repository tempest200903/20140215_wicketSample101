package com.mycompany;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class ListBook extends WebPage {

	private static final long serialVersionUID = 7514416342722447820L;

	public ListBook(PageParameters parameters) {
		super(parameters);

		// ListView
		IModel<List<String>> myModel = new LoadableDetachableModel<List<String>>() {
			private static final long serialVersionUID = 1L;

			@Override
			protected List<String> load() {
				return Arrays.asList(new String[] { "a", "b", "c" });
			}
		};

		ListView<String> view = new ListView<String>("repeatView", myModel) {
			private static final long serialVersionUID = 1L;

			@Override
			protected void populateItem(ListItem<String> item) {
				String labelString = item.getModelObject();
				Label label = new Label("column1", labelString);
				item.add(label);
			}
		};
		add(view);

		// ExternalLink
		ExternalLink link1 = new ExternalLink("link1",
				"http://gihyo.jp/dev/feature/01/wicket/0005?page=2");
		add(link1);
	}

}
