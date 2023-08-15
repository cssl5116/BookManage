package com.book.www.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.www.service.BookmanageService;
import com.book.www.mapper.BookmanageMapper;
import com.book.www.entity.Bookmanage;
import org.springframework.stereotype.Service;

@Service
public class BookmanageServiceImpl
    extends ServiceImpl<BookmanageMapper, Bookmanage>
    implements BookmanageService {
}
