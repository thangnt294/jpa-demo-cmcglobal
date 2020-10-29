package com.cmcglobal.demo.api.serviceImpl;

import com.cmcglobal.demo.api.entity.DigitalBook;
import com.cmcglobal.demo.api.entity.BookType;
import com.cmcglobal.demo.api.entity.PaperBook;
import com.cmcglobal.demo.api.repository.DigitalBookRepository;
import com.cmcglobal.demo.api.repository.BookTypeRepository;
import com.cmcglobal.demo.api.repository.PaperBookRepository;
import com.cmcglobal.demo.api.service.BookTypeService;
import org.springframework.stereotype.Service;

@Service
public class BookTypeServiceImpl implements BookTypeService {

    private BookTypeRepository bookTypeRepository;

    private PaperBookRepository paperBookRepository;

    private DigitalBookRepository digitalBookRepository;

    public BookTypeServiceImpl(BookTypeRepository bookTypeRepository, PaperBookRepository paperBookRepository, DigitalBookRepository digitalBookRepository) {
        this.bookTypeRepository = bookTypeRepository;
        this.paperBookRepository = paperBookRepository;
        this.digitalBookRepository = digitalBookRepository;
    }

    @Override
    public BookType saveBookType(BookType bookType) {
        return bookTypeRepository.save(bookType);
    }

    @Override
    public PaperBook savePaperBook(PaperBook paperBook) {
        return paperBookRepository.save(paperBook);
    }

    @Override
    public DigitalBook saveDigitalBook(DigitalBook digitalBook) {
        return digitalBookRepository.save(digitalBook);
    }
}
