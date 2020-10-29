package com.cmcglobal.demo.api.service;

import com.cmcglobal.demo.api.entity.BookType;
import com.cmcglobal.demo.api.entity.DigitalBook;
import com.cmcglobal.demo.api.entity.PaperBook;

public interface BookTypeService {
    BookType saveBookType(BookType bookType);
    PaperBook savePaperBook(PaperBook paperBook);
    DigitalBook saveDigitalBook(DigitalBook digitalBook);
}
