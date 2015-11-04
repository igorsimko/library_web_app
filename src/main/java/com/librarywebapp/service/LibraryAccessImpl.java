package com.librarywebapp.service;

import org.springframework.stereotype.Service;

/**
 * Created by Igor on 02.11.2015.
 */
@Service("libraryAccess")
public class LibraryAccessImpl implements LibraryAccess{

    public String getBook(){
        return "penis";
    }

}
