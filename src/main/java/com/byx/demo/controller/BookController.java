package com.byx.demo.controller;

import com.byx.demo.entity.Book;
import com.byx.demo.entity.Result;
import com.byx.demo.service.BookService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/Book")
    @ResponseBody
    public List books(){
        return bookService.getAll();
    }

    @RequestMapping("/del")
    @ResponseBody
    public Result del(int id){
        Result result = new Result();
        if(bookService.del(id)!=0){
            result.setSuccess(true);
        }else{
            result.setSuccess(false);
        }
        return result;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Book update(int bookId){
        if(bookService.getById(bookId)!=null){
            return bookService.getById(bookId);
        }
        else
            return null;
    }
    @RequestMapping("/updateSome")
    public String updateSome(String bookName,int bookPrice,String author,int bookId){
            Book book = new Book();
            book.setBookPrice(bookPrice);
            book.setBookName(bookName);
            book.setAuthor(author);
            book.setBookId(bookId);
            bookService.update(book);
        return "Book";
    }

    @PostMapping("/Add")
    public String add(String bookName,String bookPrice,String author){


        if(StringUtils.isNoneBlank(bookName,bookPrice,author)){
            Book book1 = Book.builder()
                    .author(author)
                    .bookId(1123)
                    .build();
            Book book = new Book();
            book.setAuthor(author);
            book.setBookName(bookName);
            book.setBookPrice(Integer.valueOf(bookPrice));
            bookService.add(book);
        }
        return "Book";
    }
    @RequestMapping("/addSome")
    public String addSome(){
        return "add";
    }
    @RequestMapping("/newBook")
    public String newBook(int bookId, ModelMap modelMap){

        modelMap.addAttribute("bookId",bookId);
        return "NewBook";
    }
}
