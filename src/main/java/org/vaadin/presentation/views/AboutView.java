package org.vaadin.presentation.views;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.cdiviewmenu.ViewMenuItem;

import javax.annotation.PostConstruct;
import org.vaadin.viritin.label.RichText;

/*
 * A very simple view that just displays an "about text". The view also has 
 * a button to reset the demo date in the database.
 */
@CDIView("")
@ViewMenuItem(icon = FontAwesome.INFO)
public class AboutView extends VerticalLayout implements View {

    @PostConstruct
    void init() {
        setMargin(true);
        addComponents(new RichText().withMarkDownResource("/about.md"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {
    }
}
