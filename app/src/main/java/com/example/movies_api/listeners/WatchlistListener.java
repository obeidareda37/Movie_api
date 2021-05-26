package com.example.movies_api.listeners;

import com.example.movies_api.models.TVShow;

public interface WatchlistListener {
    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist(TVShow tvShow , int position);
}
