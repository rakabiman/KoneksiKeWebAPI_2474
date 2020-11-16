package com.example.tabnavigation_2474.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tabnavigation_2474.Movie;
import com.example.tabnavigation_2474.MovieAdapter;
import com.example.tabnavigation_2474.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PlayingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlayingFragment extends Fragment {

    private String[] movie = {"Bad Boys for Life","The Old Guard","Raised by Wolves","Elite","The Walking Dead: World Beyond","Artemis Fowl","Black Box","Riverdale","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};
    private String[] movieYear = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013", "2014","2015","2016"};
    private ArrayList<Movie> listMovie;
    private RecyclerView rvMovie;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playing, container, false);
        listMovie = new ArrayList<>();
        for (int i = 0; i < movie.length ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i]);
            listMovie.add(mov);
        }
        rvMovie = view.findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);
        rvMovie.setLayoutManager(new LinearLayoutManager(getContext()));
        MovieAdapter movieAdapter = new MovieAdapter(listMovie);
        rvMovie.setAdapter(movieAdapter);
        return view;
    }
}