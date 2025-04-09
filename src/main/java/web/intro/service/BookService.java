package web.intro.service;

import java.util.List;
import web.intro.dto.BookDto;
import web.intro.dto.CreateBookRequestDto;

public interface BookService {
    List<BookDto> getAll();

    BookDto getBookById(Long id);

    BookDto createBook(CreateBookRequestDto bookDto);

    BookDto updateBook(Long id, CreateBookRequestDto bookDto);

    void deleteById(long id);
}
