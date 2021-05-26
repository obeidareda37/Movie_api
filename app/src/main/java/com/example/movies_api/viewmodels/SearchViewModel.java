package com.example.movies_api.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.movies_api.repositories.SearchTVShowRepository;
import com.example.movies_api.responses.TVShowsResponse;

public class SearchViewModel  extends ViewModel {
    private SearchTVShowRepository searchTVShowRepository;

    public SearchViewModel() {
        searchTVShowRepository = new SearchTVShowRepository();
    }

    public LiveData<TVShowsResponse> searchTVShow(String query , int page){
        return searchTVShowRepository.searchTVShow(query , page);
    }
}
