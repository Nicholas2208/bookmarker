package com.nwhite.bookmarker.api;

import com.nwhite.bookmarker.domain.BookmarkDTO;
import com.nwhite.bookmarker.domain.BookmarkService;
import com.nwhite.bookmarker.domain.BookmarksDTO;
import com.nwhite.bookmarker.domain.CreateBookmarkRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {
    private final BookmarkService bookmarkService;

    public BookmarkController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    @GetMapping
    public BookmarksDTO getBookmarks(@RequestParam(defaultValue = "1") Integer page,
                                     @RequestParam(defaultValue = "") String query) {
        if(query == null || query.trim().isEmpty()) {
            return bookmarkService.getBookmarks(page);
        }
        return bookmarkService.searchBookmarks(query, page);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookmarkDTO createBookmark(@RequestBody @Valid CreateBookmarkRequest request) {
        return bookmarkService.createBookmark(request);
    }
}
