/*
 *  Copyright 2009 Tsutomu YANO.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package com.mycompany;

//import jp.gihyo.wicket.page.simple.MyTimeline;
//import jp.gihyo.wicket.AppSession;
//import org.apache.wicket.PageParameters;
import java.io.Serializable;
import java.util.Date;

import org.apache.wicket.MetaDataKey;
import org.apache.wicket.protocol.http.IRequestLogger.RequestData;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.validation.validator.PatternValidator;
import org.apache.wicket.validation.validator.StringValidator;

/**
 * 
 * @author Tsutomu YANO
 */
public class Login extends WebPage {
	private static final long serialVersionUID = 7514416342722447820L;

	String userName;
	String password;

	public Login(PageParameters parameters) {
		super(parameters);

		add(new FeedbackPanel("feedback"));

		Form<Void> form = new Form<Void>("loginForm");
		add(form);

		TextField<String> loginNameField = new TextField<String>("loginName",
				new PropertyModel<String>(this, "userName"));
		loginNameField.add(new PatternValidator("[a-zA-Z1-9_]*"));
		loginNameField.setRequired(true);
		form.add(loginNameField);

		PasswordTextField passwordField = new PasswordTextField("password",
				new PropertyModel<String>(this, "password"));
		passwordField.add(StringValidator.maximumLength(20));
		passwordField.setRequired(true);
		form.add(passwordField);

		Button submit = new Button("login") {
			private static final long serialVersionUID = 1L;

			@Override
			public void onSubmit() {
				System.out.println("userName =: " + userName);
				System.out.println("password =: " + password);
				Serializable sessionValue1 = getSession().getMetaData(key);
				if (sessionValue1 == null) {
					sessionValue1 = new Date();
					getSession().setMetaData(key, sessionValue1);
				}
				System.out.println("sessionValue1 =: " + sessionValue1);
			}
		};
		form.add(submit);

	}

	MetaDataKey<Date> key = new MetaDataKey<Date>() {
		private static final long serialVersionUID = 1L;
	};

}
