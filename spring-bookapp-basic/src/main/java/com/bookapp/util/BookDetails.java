package com.bookapp.util;

import com.bookapp.model.Book;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class BookDetails {
    public List<Book> showBooks(){
        return Arrays.asList(
                new Book("Breathe","Kennedy","Life",1,1000),
                new Book("Fire","Kennedy","Death",2,2000),
                new Book("Mind","James","Power",3,3000),
                new Book("Corporate","Dolly","Working",4,4000),
                new Book("God","Alwin","Life",5,5000)
        );


        }
    }
