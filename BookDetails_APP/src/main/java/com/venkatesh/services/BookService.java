package com.venkatesh.services;

import java.util.List;

import com.venkatesh.pojo.BookDetails;

public interface BookService {
	
	public Integer saveBook(BookDetails book);
	public List<BookDetails> retiewAllBooks();

}
