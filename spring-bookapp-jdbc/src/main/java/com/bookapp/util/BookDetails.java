package com.bookapp.util;



import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {
    public static List<Book> showBooks(){
        return Arrays.asList(
                new Book("Breathe","Kennedy","Life",1,1000),
                new Book("Fire","Kennedy","Death",2,2000),
                new Book("Mind","James","Power",3,3000),
                new Book("Corporate","Dolly","Working",4,4000),
                new Book("God","Alwin","Life",5,5000)
        );


        }
    }
