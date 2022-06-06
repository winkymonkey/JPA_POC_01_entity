package org.example.jpa.c_primarykey_composite_embeddedid;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Book {
	
    @EmbeddedId
    private BookId bookId;
    
    @Column(name = "PRICE")
    private String price;

    // GETTER, SETTER
    
}
