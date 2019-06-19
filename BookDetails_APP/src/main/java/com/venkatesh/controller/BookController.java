package com.venkatesh.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.ls.LSInput;

import com.venkatesh.pojo.BookDetails;
import com.venkatesh.properties.AppProperties;
import com.venkatesh.services.BookServiceImpl;


@Controller
public class BookController {
	
	/*private static List books=null;
	
	
	
	public BookController() {
		books=new ArrayList();
	}*/
	
	@Autowired
	private BookServiceImpl bookSer;

	@Autowired
	private AppProperties appProps;
	
	@RequestMapping("/bookDetailsForm")
	public String displayForm(Model model)
	{
		model.addAttribute("bookmsg", "Enter Book Details");
		model.addAttribute("book",new BookDetails());
		
		return "bookForm";
		
	}
	
	@RequestMapping(value="/bookReg",method=RequestMethod.POST)
	public String saveBookDetails(@ModelAttribute("book")BookDetails book, Model model )
	{
		
		/*System.out.println(book);
		intializeFormValues(model);
		books.add(book);
		System.out.println(books);
		model.addAttribute("books" ,books);
		String reMsg=appProps.getProperties().get("succMsg");
		model.addAttribute("msg1",reMsg);
		 model.addAttribute("book", new BookDetails());
		
		return "bookForm";
		*/
		
		
		Integer id=bookSer.saveBook(book);
		if (id >0)
		{
			String reMsg=appProps.getProperties().get("succMsg");
			model.addAttribute("msg1",reMsg);
			 model.addAttribute("book", new BookDetails());
		}
		else
			
		{
			String failMsg=appProps.getProperties().get("failMsg");
			model.addAttribute("msg2",failMsg);
			 model.addAttribute("book", new BookDetails());
		}
		
		List<BookDetails> books=bookSer.retiewAllBooks();
		model.addAttribute("book","books");
		
		return "bookForm";
		
	}
	
	
	
	/*@RequestMapping(value="/bookEdit/{id}")
	public String editOperation(@PathVariable int id, BookDetails book,Model model) {
		
		
		model.addAttribute("book", "books");
		
		
		return "bookForm";
	}*/
	
	
	

}
