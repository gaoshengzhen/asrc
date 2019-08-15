package com.byx.demo.mapper;

import com.byx.demo.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("select * from book")
    List<Book> getAll();

    @Delete("delete from book where bookid = #{bookId}")
    int del(int bookId);

    @Update("update book set bookPrice = #{bookPrice},bookName = #{bookName},author = #{author} where bookId = #{bookId}")
    void update (Book book);

    @Insert("insert into book values(null,#{bookName},#{bookPrice},#{author})")
    @Options(useGeneratedKeys = true,keyProperty = "bookId")
    int add (Book book);

    @Select("select * from book where bookid = #{bookId}")
    Book getById(int bookId);
}
