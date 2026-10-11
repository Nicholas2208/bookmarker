package com.nwhite.bookmarker.api;

import com.nwhite.bookmarker.domain.Bookmark;
import com.nwhite.bookmarker.domain.BookmarkService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {
    private final BookmarkService bookmarkService;

    public BookmarkController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    @GetMapping
    public List<Bookmark> getBookmarks(@RequestParam(defaultValue = "1") Integer page) {
        return bookmarkService.getBookmarks(page);
    }
}
