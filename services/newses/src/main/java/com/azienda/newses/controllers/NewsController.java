package com.azienda.newses.controllers;

import com.azienda.newses.dto.request.NewsRequest;
import com.azienda.newses.dto.request.NewsUpdateRequest;
import com.azienda.newses.dto.response.EntityIdResponse;
import com.azienda.newses.dto.response.NewsResponse;
import com.azienda.newses.mappers.NewsMapper;
import com.azienda.newses.services.NewsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1/News")
@CrossOrigin(origins = "http://localhost:8073")
public class NewsController
{
    @Autowired
    NewsService newsService;

    @Autowired
    NewsMapper newsMapper;

    @GetMapping("/get/{id}")
    public ResponseEntity<NewsResponse> getById(@PathVariable Long id){
        return new ResponseEntity<>(newsService.getNewsById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<NewsResponse>> getAll(){
        return  new ResponseEntity<>(newsService.getAllNews(),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<NewsResponse> create(@RequestBody @Valid NewsRequest request) throws Exception {
        return new ResponseEntity<>(newsService.createNews(request), HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<NewsResponse> update(@PathVariable Long id, @RequestBody @Valid NewsUpdateRequest request) throws Exception {
        return new ResponseEntity<>(newsService.updateNews(id, request), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<EntityIdResponse> deleteById(@PathVariable Long id){
        newsService.removeNews(id);
        return new ResponseEntity<>(new EntityIdResponse(id),HttpStatus.OK);
    }

    @PutMapping("/like/{id}")
    public  ResponseEntity<EntityIdResponse> like(@PathVariable Long id){
        newsService.likeNews(id);
        return new ResponseEntity<>(new EntityIdResponse(id), HttpStatus.OK);
    }
}
