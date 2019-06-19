package com.venkatesh.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkatesh.entity.BookDetailsEntity;
import com.venkatesh.pojo.BookDetails;
import com.venkatesh.repository.BookServiceRepository;


@Service
public class BookServiceImpl  implements BookService{
	
	@Autowired
	private BookServiceRepository bookrepo;

	@Override
	public Integer saveBook(BookDetails book) {
		BookDetailsEntity bookentity=new BookDetailsEntity();
		
		BeanUtils.copyProperties(book, bookentity);
		bookentity=bookrepo.save(bookentity);
		
		return bookentity.getId();
	}

	@Override
	public List<BookDetails> retiewAllBooks() {
		List<BookDetailsEntity> bookEntities=bookrepo.findAll();
		
		List<BookDetails> bookDetails=new ArrayList<>();
		 
		for(BookDetailsEntity entity:bookEntities)
		{
			BookDetails b=new BookDetails();
			BeanUtils.copyProperties(entity, b);
			bookDetails.add(b);
		}
		return null;
	}
	

}
