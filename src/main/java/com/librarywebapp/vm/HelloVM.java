package com.librarywebapp.vm;

import com.librarywebapp.service.LibraryAccess;
import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;

/**
 * Created by Igor on 02.11.2015.
 */
public class HelloVM {

    private String ahoj = "serus";

    @WireVariable
    private LibraryAccess libraryAccess;

    @AfterCompose
    public void initSetup(@ContextParam(ContextType.VIEW) Component view) {
        Selectors.wireComponents(view, this, false);

    }

    public String getAhoj() {
        return libraryAccess.getBook();
    }

    public void setAhoj(String ahoj) {
        this.ahoj = ahoj;
    }
}
